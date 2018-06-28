package com.seecen.exam.day0821.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Jdbc��������
 * һ�㲽��:
 * 1. �������ݿ����� 
 * 2. ��ȡ���ݿ�����
 * 3. ����ָ��
 * 4. ִ��ָ��õ����
 * 5. ���������ͷ����ݿ���Դ(һ����finally���ͷ�)
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��21��
 */
public class TestJdbc {
	//public static final String ORACLE_URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	public static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	public static final String ORACLE_username = "scott";
	public static final String ORACLE_password = "admin";
	/*
	 * �������ݿ��URL���Ӹ�ʽ:
	 * oracle----> jdbc:oracle:thin:@127.0.0.1:1521:orcl
	 * mssql ----> jdbc:sqlserver://127.0.0.1:1433
	 * db2   ----> jdbc:db2:<db_name>
	 * mysql ----> jdbc:mysql://127.0.0.1:3306/<db_name>
	 */
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 1. �������ݿ�����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. ��ȡ���ݿ�����
			con = DriverManager.getConnection(ORACLE_URL, ORACLE_username,
					ORACLE_password);
			// Ĭ��Ϊ�Զ��ύ,������Ϊfalse,���ֶ��ύ
			con.setAutoCommit(false);
			// 3. ����ָ��
			stmt = con.createStatement();
			// 4. ִ��ָ��õ����
			// ��������
			//String sql = "insert into t_dept values(50,'���۲�','china')";
			// ɾ������
			// String sql = "delete from t_dept where deptno=50";
			// ��������
			// String sql = "update t_dept set loc='nanchang' where deptno=50 ";
			// ��ѯ����
			String sql = "select * from t_dept order by deptno desc";
			//�÷�������ִ����ɾ�Ĳ���
			int num = stmt.executeUpdate(sql);
			//�÷���ִֻ�в�ѯ����
			rs = stmt.executeQuery(sql);
			// 5. ������
			if (num > 0) {
				System.out.println("�����ɹ�!");
			} else {
				System.out.println("����ʧ��!");
			}
			//������ѯ���õ��Ľ����,�����ַ�ʽȡ(������,��1��ʼ������,���˱�����Ҫ�ñ���)
			while (rs.next()) {
				/*int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);*/
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno + "-" + dname + "-" + loc);
			}
			//�ֶ��ύ
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
			//�������ͻع�
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			// �ͷ����ݿ���Դ
			// ���rs��Ϊ��,�͹ر�,�ͷ����ݿ���Դ
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			// ���stmt��Ϊ��,�͹ر�,�ͷ����ݿ���Դ
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			// ���con��Ϊ��,�͹ر�,�ͷ����ݿ���Դ
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
