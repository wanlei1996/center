package com.seecen.exam.day0822;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.ResultSet;

import com.seecen.exam.myUtils.JdbcUtil;

/**
 * ģ���¼ ��ֹSQLע��
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��22��
 */
public class LoginDemo {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�������û���:");
		String username = br.readLine();
		System.out.print("����������:");
		String pwd = br.readLine();
		//ʹ�ù�����������ݿ����
		JdbcUtil ju = new JdbcUtil();
		ResultSet rs = ju.executeQuery("select * from t_student where sname= ? and sclass = ?", username,pwd);
		if (rs.next()) {
			System.out.println("��¼�ɹ�!");
		}else {
			System.out.println("�û������������");
		}
		ju.closeAll();
		br.close();
	/*	��ѯ�������ݿ��¼
		JdbcUtil ju = new JdbcUtil();
		ResultSet rs = ju.executeQuery("select * from t_student order by sno");
		try {
			while (rs.next()) {
				int sno = rs.getInt("sno");
				String sname = rs.getString("sname");
				String ssex = rs.getString("ssex");
				Date sbirthday = rs.getDate("sbirthday");
				String sclass = rs.getString("sclass");
				System.out.println(sno + "\t" + sname + "\t" + ssex + "\t"
						+ sbirthday + "\t" + sclass);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ju.closeAll();
	 */
	}
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�������û���:");
		String username = br.readLine();
		System.out.print("����������:");
		String pwd = br.readLine();

		// String sql = "select count(1) from t_student where sname='" +
		// username
		// + "' and sclass='" + pwd + "'";
		String sql = "select count(1) from t_student where sname= ? and sclass = ? ";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "scott", "admin");
			// stmt = con.createStatement();
			// Ԥ����,Ԥ�ȱ���,����Ч��
			// ��ֹsqlע��
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, pwd);
			// rs = stmt.executeQuery(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				int result = rs.getInt(1);
				if (result > 0) {
					System.out.println("��¼�ɹ�!");
				} else {
					System.out.println("�û������������");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		br.close();
	}*/

}
