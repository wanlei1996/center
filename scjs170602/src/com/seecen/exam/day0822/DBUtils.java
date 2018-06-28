package com.seecen.exam.day0822;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * ���ݿ⹤����(��ʦ��װ��)
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��22��
 */
public class DBUtils {

	private static final String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private static final String USER_NAME = "scott";
	private static final String PWD = "admin";
	/**
	 * ע�����ݿ�����
	 */
	static {
		try {
			Class.forName(DRIVER_CLASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ȡ���ݿ�����
	 * 
	 * @return ���ݿ�����
	 * @throws Exception
	 */
	public static Connection getCon() throws Exception {
		Connection con = DriverManager.getConnection(URL, USER_NAME, PWD);
		return con;
	}

	/**
	 * �ͷ����ݿ�������Դ
	 * 
	 * @param rs
	 *            �����
	 * @param stmt
	 *            ָ��
	 * @param con
	 *            ���ݿ�����
	 * @throws Exception
	 */
	public static void closeAll(ResultSet rs, Statement stmt, Connection con)
			throws Exception {
		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (con != null)
			con.close();
	}

	/**
	 * �÷�����ִ�����ݿ������ɾ���Ĳ���
	 * 
	 * @param sql
	 *            Ҫִ�е�����ɾ����SQL���
	 * @param param
	 *            Ԥ�����SQL����е�'?'�������ַ�������,�ɱ����
	 * @return ����ִ�в�����Ӱ�������
	 */
	public static int doUpdate(String sql, Object... param) {
		int result = 0;
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			con = getCon();
			pstm = con.prepareStatement(sql);
			for (int i = 0; i < param.length; i++) {
				pstm.setObject(i + 1, param[i]);
			}
			result = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeAll(null, pstm, con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * ���Ҳ���
	 * 
	 * @param sql
	 *            Ҫִ�еĲ�ѯSQL���
	 * @param param
	 *            Ԥ�����SQL����е�'?'�������ַ�������,�ɱ����
	 * @return ���Ŷ�������
	 */
	public static List<Dept> findDept(String sql, Object... param) {
		ResultSet rs = null;
		PreparedStatement pstm = null;
		Connection con = null;
		List<Dept> list = new ArrayList<Dept>();
		;
		try {
			con = getCon();
			pstm = con.prepareStatement(sql);
			// �в����ͻ��ȥ����
			for (int i = 0; i < param.length; i++) {
				pstm.setObject(i + 1, param[i]);
			}
			rs = pstm.executeQuery();
			while (rs.next()) {
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				list.add(dept);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeAll(rs, pstm, con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	/**
	 * ���ݿ����ݵ����������
	 * 
	 * @param sql
	 *            Ҫִ�е�����ɾ����SQL���
	 * @param ids
	 *            Ҫִ�е���������
	 * @return ����ִ�в�����Ӱ�������
	 */
	public static int doBatch(String sql, List<Integer> ids) {
		int result = 0;
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			con = getCon();
			pstm = con.prepareStatement(sql);
			for (int i = 0; i < ids.size(); i++) {
				int id = ids.get(i);
				pstm.setInt(1, id);
				// ����ǰָ����ӵ�����������
				pstm.addBatch();
			}
			// ִ������������
			pstm.executeBatch();
			result = 1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeAll(null, pstm, con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
