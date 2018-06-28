package com.seecen.exam.day0803;

import java.util.Scanner;
public class StudentManageSystemDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentManageSystem stu = new StudentManageSystem();

		String isContinue = null;
		do {
			stu.printMenu();
			System.out.print("��ѡ��,��������:");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				/**
				 * ���ѧԱ
				 */
				System.out.println("��ѧԱ����ϵͳ>���ѧԱ��");
				String answer = null;
				do {
					System.out.print("������ѧԱ������:");
					String nameInput = sc.next();
					if (stu.add(nameInput)) {
						System.out.println("��ӳɹ���");
					} else {
						System.out.println("��������,���ʧ�ܣ�");
						break;
					}
					System.out.print("�Ƿ��������(y/n):");
					answer = sc.next();
				} while (answer.equals("y"));
				break;
			case 2:
				/**
				 * ɾ��ѧԱ
				 */
				System.out.println("��ѧԱ����ϵͳ>ɾ��ѧԱ��");
				while (true) {
					System.out.print("��������Ҫɾ����ѧԱ����:");
					String delName = sc.next();
					if (stu.deleteName(delName)) {
						System.out.println("�ҵ���ɾ���ɹ�!");
						System.out.println("����ѧԱ����Ϣ����:");
						stu.showAll();
						break;
					} else {
						System.out.println("��Ҫɾ����ѧԱ������!");
					}
				}
				break;
			case 3:
				/**
				 * �޸�ѧԱ
				 */
				System.out.println("��ѧԱ����ϵͳ>�޸�ѧԱ��");
				while (true) {
					System.out.print("��������Ҫ�޸ĵ�ѧԱ����:");
					String oldName = sc.next();
					System.out.print("�������µ�ѧԱ����:");
					String newName = sc.next();
					if (stu.updateName(oldName, newName)) {
						// �ҵ��˲��޸ĳɹ�
						System.out.println("�ҵ����޸ĳɹ�!");
						System.out.println("����ѧԱ����Ϣ����:");
						stu.showAll();
						break;
					} else {
						System.out.println("��Ҫ�޸ĵ�ѧԱ������!");
					}
				}
				break;
			case 4:
				/**
				 * ȫ�ֲ���ѧԱ
				 */
				System.out.println("��ѧԱ����ϵͳ>ȫ�ֲ���ѧԱ��");
				while (true) {
					System.out.print("������Ҫ���ҵ�ѧԱ����:");
					String findName = sc.next();
					if (stu.findByName(findName) == -1) {
						System.out.println("�����������û�ҵ�!");
					} else {
						System.out.println("�ҵ���,����Ϊ:" + findName + "��,������ĵ�"
								+ (stu.findByName(findName) + 1) + "��λ����!");
						break;
					}
				}
				break;
			case 5:
				/**
				 * ��������ѧԱ
				 */
				System.out.println("��ѧԱ����ϵͳ>��������ѧԱ��");
				while (true) {
					System.out.print("��������ʼλ��:");
					int startNum = sc.nextInt();
					System.out.print("������ĩβλ��:");
					int endNum = sc.nextInt();
					System.out.print("�����������Ҫ���ҵ�ѧԱ����:");
					String findName = sc.next();
					if (stu.findByIndex(startNum, endNum, findName) == -1) {
						System.out.println("�����������û�ҵ�!");
					} else {
						System.out.println("�ҵ���,����Ϊ:" + findName + "��,������ĵ�"
								+ (stu.findByName(findName) + 1) + "��λ����!");
						break;
					}
				}
				break;
			case 6:
				/**
				 * ��ʾ����ѧԱ
				 */
				System.out.println("��ѧԱ����ϵͳ>��ʾ����ѧԱ��");
				System.out.println("����ѧԱ����Ϣ����:");
				stu.showAll();
				break;
			default:
				System.out.println("��������ȷ�Ĳ˵�ѡ��!");
				break;
			}
			System.out.print("�Ƿ�����ص��˵�(y/n):");
			isContinue = sc.next();
		} while (isContinue.equals("y"));
		System.out.println("ϵͳ�˳�,ллʹ�ã�");
		System.exit(1);
		sc.close();
	}
}
