package com.seecen.exam.myUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * ͨ�����ݿ����ӳ�(JNDI)�����ݿ�����Ĺ�����
 * 
 * @DrivingExam
 * @author �����ڡ�
 * @2017��8��22��
 */
public class JDNIUtil {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	/**
	 * ͨ�����ݿ����ӳ�(JNDI)����ȡ����
	 * @return ���ݿ�����
	 * @throws Exception
	 */
	public Connection getConnByDataSource() throws Exception {
		//ʵ����JNDL,ͨ��JDNI(Java������Ŀ¼�ӿ�)��ȡ���ݿ�����
		Context initContext = new InitialContext();
		DataSource ds = (DataSource)initContext.lookup("java:/comp/env/jdbc/myoracle");
		Connection conn = ds.getConnection();
		return conn;
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
			conn = getConnByDataSource();
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
			conn = getConnByDataSource();
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
}
