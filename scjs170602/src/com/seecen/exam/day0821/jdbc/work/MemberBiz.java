package com.seecen.exam.day0821.jdbc.work;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * ��Աҵ���� 1. ¼������ ---�������Ա���ƣ���Ա�ȼ� 2. �޸����� ---������Ҫ�޸ĵĻ�Ա��ţ����������ƣ��µȼ� 3. ɾ������
 * ---������Ҫɾ���Ļ�Ա��� 4. ��ѯ���� ---����ʾ��������
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��21��
 */
public class MemberBiz {
	/**
	 * ��ӡϵͳ�˵�
	 */
	public void printMenu() {
		System.out.println("*******��ӭ�����Ա����ϵͳ***********");
		System.out.println("\t1.¼������");
		System.out.println("\t2.�޸�����");
		System.out.println("\t3.ɾ������");
		System.out.println("\t4.��ѯ����");
		System.out.println("*********************************");
	}

	/**
	 * ��ӻ�Ա��Ϣ
	 * @param m Ҫ��ӵĻ�Ա����
	 * @return ��ӳɹ�����Ӱ������,���򷵻�0
	 * @throws SQLException SQL�쳣
	 */
	public int addMember(Member m,Connection con, Statement stmt) throws SQLException {
		String sql = "insert into member_tab values(seq_member.nextval,'"
				+ m.getMemberName() + "','" + m.getMemberGrade() + "')";
		int num = stmt.executeUpdate(sql);
		return num;
	}

	/**
	 * �޸Ļ�Ա��Ϣ
	 * @param m �µĻ�Ա����
	 * @return �޸ĳɹ�����Ӱ������,���򷵻�0
	 * @throws SQLException SQL�쳣
	 */
	public int updateMember(Member m,Connection con, Statement stmt) throws SQLException {
		String sql = "update member_tab set memberName='"
				+ m.getMemberName() + "',memberGrade='"
				+ m.getMemberGrade() + "' where memberId="
				+ m.getMemberId() + "";
		int num = stmt.executeUpdate(sql);
		return num;
	}

	/**
	 * ɾ����Ա��Ϣ
	 * @param id ��Ա���
	 * @return ɾ���ɹ�����Ӱ������,���򷵻�0
	 * @throws SQLException SQL�쳣
	 */
	public int deleteMember(int id,Connection con, Statement stmt) throws SQLException {
		String sql = "delete from member_tab where memberId=" + id + "";
		int num = stmt.executeUpdate(sql);
		return num;
	}

	
	/**
	 * ��ѯ��Ա��Ϣ
	 * 
	 * @return ��Ա��������
	 * @throws SQLException
	 *             SQL�쳣
	 */
	public ArrayList<Member> queryMember(Connection con, Statement stmt ,ResultSet rs) throws SQLException {
		String sql = "select * from member_tab order by memberId";
		rs = stmt.executeQuery(sql);
		ArrayList<Member> list = new ArrayList<Member>();
		while (rs.next()) {
			int id = rs.getInt("memberId");
			String name = rs.getString("memberName");
			String grade = rs.getString("memberGrade");
			Member m = new Member();
			m.setMemberId(id);
			m.setMemberName(name);
			m.setMemberGrade(grade);
			list.add(m);
		}
		return list;
	}
}
