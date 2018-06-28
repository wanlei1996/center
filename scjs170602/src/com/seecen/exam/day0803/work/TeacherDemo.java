package com.seecen.exam.day0803.work;

import java.util.Scanner;
/**
 * ������ʦ����ϵͳ��
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��3��
 */
public class TeacherDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Teacher tea = new Teacher();

		String isContinue = null;
		do {
			tea.printMenu();
			System.out.print("��ѡ��,��������:");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				 //�����ʦ
				System.out.println("����ʦ����ϵͳ>�����ʦ��");
				String answer = null;
				do {
					System.out.print("��������ʦ������:");
					String nameInput = sc.next();
					if (tea.add(nameInput)) {
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
				 //ɾ����ʦ
				System.out.println("����ʦ����ϵͳ>ɾ����ʦ��");
				while (true) {
					System.out.print("��������Ҫɾ������ʦ����:");
					String delName = sc.next();
					if (tea.deleteName(delName)) {
						System.out.println("�ҵ���ɾ���ɹ�!");
						System.out.println("������ʦ����Ϣ����:");
						tea.showAll();
						break;
					} else {
						System.out.println("��Ҫɾ������ʦ������!");
					}
				}
				break;
			case 3:
				 //�޸���ʦ
				System.out.println("����ʦ����ϵͳ>�޸���ʦ��");
				while (true) {
					System.out.print("��������Ҫ�޸ĵ���ʦ����:");
					String oldName = sc.next();
					System.out.print("�������µ���ʦ����:");
					String newName = sc.next();
					if (tea.updateName(oldName, newName)) {
						// �ҵ��˲��޸ĳɹ�
						System.out.println("�ҵ����޸ĳɹ�!");
						System.out.println("������ʦ����Ϣ����:");
						tea.showAll();
						break;
					} else {
						System.out.println("��Ҫ�޸ĵ���ʦ������!");
					}
				}
				break;
			case 4:
				 //ȫ�ֲ�����ʦ
				System.out.println("����ʦ����ϵͳ>ȫ�ֲ�����ʦ��");
				while (true) {
					System.out.print("������Ҫ���ҵ���ʦ����:");
					String findName = sc.next();
					if (tea.findByName(findName) == -1) {
						System.out.println("�����������û�ҵ�!");
					} else {
						System.out.println("�ҵ���,����Ϊ:" + findName + "��,������ĵ�"
								+ (tea.findByName(findName) + 1) + "��λ����!");
						break;
					}
				}
				break;
			case 5:
				 //����������ʦ
				System.out.println("����ʦ����ϵͳ>����������ʦ��");
				while (true) {
					System.out.print("��������ʼλ��:");
					int startNum = sc.nextInt();
					System.out.print("������ĩβλ��:");
					int endNum = sc.nextInt();
					System.out.print("�����������Ҫ���ҵ���ʦ����:");
					String findName = sc.next();
					if (tea.findByIndex(startNum, endNum, findName) == -1) {
						System.out.println("�����������û�ҵ�!");
					} else {
						System.out.println("�ҵ���,����Ϊ:" + findName + "��,������ĵ�"
								+ (tea.findByName(findName) + 1) + "��λ����!");
						break;
					}
				}
				break;
			case 6:
				 //��ʾ������ʦ��Ϣ
				System.out.println("����ʦ����ϵͳ>��ʾ������ʦ��");
				System.out.println("������ʦ����Ϣ����:");
				tea.showAll();
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
