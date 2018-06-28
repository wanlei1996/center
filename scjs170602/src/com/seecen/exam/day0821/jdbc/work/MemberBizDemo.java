package com.seecen.exam.day0821.jdbc.work;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.seecen.exam.myUtils.JdbcUtil;

/**
 * ���Ի�Աҵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��21��
 */
public class MemberBizDemo {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		MemberBiz mb = new MemberBiz();
		String answer = null;
		JdbcUtil ju = new JdbcUtil();
		Connection con = ju.getConnByFile();
		Statement stmt = null;
		ResultSet rs = null;
		stmt = con.createStatement();
		try {
			do {
				mb.printMenu();
				System.out.print("��ѡ��˵�:");
				int operator = sc.nextInt();
				switch (operator) {
				case 1:
					System.out.println("��¼�����ݡ�");
					Member m = new Member();
					System.out.print("�������Ա����:");
					m.setMemberName(sc.next());
					System.out.print("�������Ա�ȼ�:");
					m.setMemberGrade(sc.next());
					if (mb.addMember(m, con, stmt) > 0) {
						System.out.println("�������ݳɹ�!");
					} else {
						System.out.println("��������ʧ��!");
					}
					break;
				case 2:
					System.out.println("���޸����ݡ�");
					Member m1 = new Member();
					System.out.print("������Ҫ�޸ĵĻ�Ա���:");
					m1.setMemberId(sc.nextInt());
					System.out.print("�������Ա����:");
					m1.setMemberName(sc.next());
					System.out.print("�������Ա�ȼ�:");
					m1.setMemberGrade(sc.next());
					if (mb.updateMember(m1, con, stmt) > 0) {
						System.out.println("�޸����ݳɹ�!");
					} else {
						System.out.println("�޸�����ʧ��!");
					}
					break;
				case 3:
					System.out.println("��ɾ�����ݡ�");
					System.out.print("������Ҫɾ���Ļ�Ա���:");
					if (mb.deleteMember(sc.nextInt(), con, stmt) > 0) {
						System.out.println("ɾ�����ݳɹ�!");
					} else {
						System.out.println("ɾ������ʧ��!");
					}
					break;
				case 4:
					System.out.println("����ѯ���ݡ�");
					System.out.println("���л�Ա��Ϣ����:");
					ArrayList<Member> list = mb.queryMember(con, stmt, rs);
					for (Member me : list) {
						System.out.println(me.getMemberId() + "\t"
								+ me.getMemberName() + "\t"
								+ me.getMemberGrade());
					}
					break;
				default:
					System.out.println("��������ȷ�Ĳ˵�ѡ��!");
					break;
				}
				System.out.print("�Ƿ�Ҫ��������ϵͳ(y/n):");
				answer = sc.next();
			} while (answer.equals("y"));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		System.out.println("ллʹ��!");
		System.exit(1);
		sc.close();
	}
}
