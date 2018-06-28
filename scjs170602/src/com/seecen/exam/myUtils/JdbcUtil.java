package com.seecen.exam.myUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

/**
 * jdbc�������ݿ�Ĺ�����
 * 
 * @DrivingExam
 * @author �����ڡ�
 * @2017��8��22��
 */
public class JdbcUtil {
	/**
	 * ���ݿ�����
	 */
	// public final static String DB_DRIVER = "com.mysql.jdbc.Driver";
	public final static String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	/**
	 * ���ݿ�URL
	 */
	// public final static String DB_URL = "jdbc:mysql://localhost:3306/testmvc";
	public final static String DB_URL = "jdbc:oracle:thin:@192.168.188.83:1521:orcl";
	/**
	 * ���ݿ��û���
	 */
	// public final static String DB_NAME = "root";
	public final static String DB_NAME = "scott";
	/**
	 * ���ݿ�����
	 */
	// public final static String DB_PWD = "admin";
	public final static String DB_PWD = " admin";

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	/**
	 * �õ����ݿ�����
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @return ���ݿ�����
	 */
	public Connection getConn() throws Exception {
		// ע������
		Class.forName(DB_DRIVER);
		// ������ݿ�����
		conn = DriverManager.getConnection(DB_URL, DB_NAME, DB_PWD);
		return conn;
	}

	/**
	 * ͨ��src�µ������ļ���ȡ���ݿ������
	 * 
	 * @return ���ݿ�����
	 * @throws Exception
	 */
	public Connection getConnByFile() throws Exception {
		Properties prop = new Properties();
		// ����JdbcConfig�����ļ�
		prop.load(this.getClass().getClassLoader().getResourceAsStream("JdbcConfig"));
		String driver = prop.getProperty("oracle_driver");
		String url = prop.getProperty("oracle_url");
		String username = prop.getProperty("oracle_username");
		String password = prop.getProperty("oracle_password");
		Class.forName(driver);
		return DriverManager.getConnection(url, username, password);
	}

	/**
	 * �ͷ����ݿ�������Դ
	 * 
	 * @throws SQLException
	 */
	public void closeAll() {
		// ���rs���գ��ر�rs
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// ���pstmt���գ��ر�pstmt
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// ���conn���գ��ر�conn
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * �˷������Խ������ݵ�����ɾ���ĵĲ���
	 * 
	 * @param preparedSql
	 *            Ԥ�����SQL���,������ɾ���ĵ�SQL�������
	 * @param param
	 *            Ԥ�����SQL����е�'?'�������ַ�������,�ɱ����
	 * @return ����ִ�в�����Ӱ�������
	 */
	public int executeUpdate(String preparedSql, Object... param) {
		int num = 0;
		try {
			// �õ����ݿ�����
			conn = getConn();
			// �õ�PreparedStatement����
			pstmt = conn.prepareStatement(preparedSql);
			if (param != null) {
				// ΪԤ����sql���ò���
				for (int i = 0; i < param.length; i++) {
					pstmt.setObject(i + 1, param[i]);
				}
			}
			num = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return num;
	}

	/**
	 * �˷������Խ������ݵĲ�ѯ����
	 * 
	 * @param preparedSql
	 *            Ԥ����� SQL��䣬����ѯ��SQL���
	 * @param param
	 *            Ԥ�����SQL����е�'?'�������ַ�������,�ɱ����
	 * @return ���ز�ѯ������ݽ����
	 */
	public ResultSet executeQuery(String preparedSql, Object... param) {
		try {
			conn = getConn();
			pstmt = conn.prepareStatement(preparedSql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					pstmt.setObject(i + 1, param[i]);
				}
			}
			// ִ��SQL���,�������ݼ�
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * �˷������Խ������ݵĲ�ѯ����
	 * 
	 * @param preparedSql
	 *            Ԥ����� SQL��䣬����ѯ��SQL���
	 * @param objs
	 *            Object���͵Ĳ���List����
	 * @return ���ز�ѯ������ݽ����
	 */
	public ResultSet executeQuery(String preparedSql, List<Object> objs) {
		try {
			conn = getConn();
			pstmt = conn.prepareStatement(preparedSql);
			for (int i = 0; i < objs.size(); i++) {
				if (objs.get(i) != null) {
					pstmt.setObject(i + 1, objs.get(i));
				}
			}
			// ִ��SQL���,�������ݼ�
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
}
