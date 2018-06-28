package com.seecen.exam.day0731;

import java.util.Scanner;
/**
 * С�͵ļ������߽��͸���ϵͳ(��ϵͳ��ע�ᣬ��¼���齱�ȹ���)
 * ��ϵͳ������ע�ᣬ�ٽ��е�¼���ٽ��г齱
 * @author Administrator
 */
public class OnlineSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �����������������û���,����ͻ�Ա����(��ʱ���ݿ�)
		int dbSize = 100;// ��ʱ���ݿ�Ĵ�С
		String[] names = new String[dbSize];
		String[] pwds = new String[dbSize];
		int[] IdNums = new int[dbSize];
		String answer = null;
		// ����û��Ƿ��¼,Ĭ��Ϊδ��¼״̬
		boolean isLogin = false;
		String loginName = "";
		int loginIndex = 0;
		// ��ǰ�洢λ��
		int index = 0;
		do {
			System.out.println("******��ӭ���뽱�͸���ϵͳ******");
			System.out.println("\t1.ע��");
			System.out.println("\t2.��¼");
			System.out.println("\t3.�齱");
			System.out.println("***************************");
			System.out.print("��ѡ��˵�:");
			int menuNum = sc.nextInt();
			menu: switch (menuNum) {
			case 1:// ע��ģ��
				String registerContinue = null;
				do {
					System.out.println("�����͸���ϵͳ��ע�᡿");
					System.out.println("����д����ע����Ϣ:");
					System.out.print("�û���:");
					String name = sc.next();
					System.out.print("����:");
					String pwd = sc.next();
					// ���û�������ɸѡ(�����ظ�)��ɸѡ������������
					boolean isNotExit = true;// �ȼ��費�����ظ�
					for (int i = 0; i < dbSize; i++) {
						if (names[i] == null) {
							break;
						}
						if (name.equals(names[i])) {
							isNotExit = false;
							break;
						}
					}
					if (!isNotExit) {
						System.out.println("��Ҫע����û����Ѿ����ڣ�����������!");
					} else {
						// �û������ظ�,����ʹ��,�����ɲ��ظ��������Ա����
						int randNum = 0;
						while (true) {
							boolean isExist = false;// ���費�����ظ�
							randNum = 1000 + (int) (Math.random() * 9000);// 1000-10000
							for (int i = 0; i < dbSize; i++) {
								if (IdNums[i] == 0) {
									break;
								}
								if (randNum == IdNums[i]) {
									isExist = true;
									break;
								}
							}
							if (!isExist) {
								break;
							}
						}
						// ���û���,����ͻ�Ա����������Ӧ�������в���ӡע����Ϣ
						names[index] = name;
						pwds[index] = pwd;
						IdNums[index] = randNum;
						System.out.println("ע��ɹ�,���ס���Ļ�Ա����,���ע����Ϣ����:");
						System.out.println("�û���\t����\t��Ա����");
						System.out.println(name + "\t" + pwd + "\t" + randNum);
						index++;
						// ��index�Ĵ�С�������ݿ�Ĵ�С����ʾ����
						if (index > dbSize) {
							System.out.println("ϵͳ�û��������ݲ�����ע��!");
						}
					}
					System.out.print("���Ƿ����ע�᣿(y/n):");
					registerContinue = sc.next();
				} while (registerContinue.equals("y"));
				System.out.println("ע�����,���˳�!");
				break;
			case 2:// ��¼ģ��
				String loginContinue = null;
				int count = 3;// 3������������
				do {
					System.out.println("�����͸���ϵͳ����¼��");
					System.out.print("�������û���:");
					String nameInput = sc.next();
					System.out.print("����������:");
					String pwdInput = sc.next();
					// ���費���ڸ��û����͸�����
					boolean isExit1 = false;
					boolean isExit2 = false;
					for (int i = 0; i < index; i++) {
						if (nameInput.equals(names[i])) {
							// �ҵ��˸��û���
							isExit1 = true;
							if (pwdInput.equals(pwds[i])) {
								// �ҵ��˸�����
								loginIndex = i;
								isExit2 = true;
								break;
							}
						}
					}
					if (!isExit1) {
						System.out.println("��������û��������� !");
						count--;
						if (count == 0) {
							System.out.println("���Ѿ�3��������������½���ϵͳ��");
							break;
						} else {
							System.out.println("�㻹��" + count + "�λ��ᣬ����������");
						}
					} else if (!isExit2) {
						System.out.println("��������������,��ƥ�� ");
						count--;
						if (count == 0) {
							System.out.println("���Ѿ�3��������������½���ϵͳ��");
							break;
						} else {
							System.out.println("�㻹��" + count + "�λ��ᣬ����������");
						}
					} else {
						System.out.println("��ӭ" + nameInput + ",���Ѿ���¼��!");
						isLogin = true;
						loginName = nameInput;
						break;
					}
					System.out.print("���Ƿ������¼��(y/n):");
					loginContinue = sc.next();
				} while (loginContinue.equals("y"));
				break;
			case 3:// �齱ģ��
				System.out.println("�����͸���ϵͳ���齱��");
				// ����ʹ��ȫ�ֱ���isLogin��loginName���ж��Ƿ��¼���ѵ�¼���û���
				if (isLogin) {
					System.out.println("��ӭ�����齱����,���Ѿ���¼����" + loginName
							+ ",�����Խ��г齱��");
					while (true) {
						System.out.print("���������Ļ�Ա��:");
						int idNumInput = sc.nextInt();
						if (idNumInput == 0) {
							System.out.println("��������ȷ����λ��Ա��!");
							break menu;
						}
						//loginIndex��ʾ�ѵ�¼�û����������е�����,������ȡ�ѵ�¼�û����Ļ�Ա����
						if (idNumInput != IdNums[loginIndex]) {
							System.out.println("������Ļ�Ա�����û�����ƥ��,����������!");
						} else {
							System.out.println("��Ա��ƥ��ɹ�,����ʼ�齱��!");
							// �������������Ա����,����������������ȣ��ͼ������������֪�������
							int r1 = 0, r2 = 0;
							//��ע������Ϊ1��ʱ�����ܽ��г齱����Ϊ���˿���������
							if(index == 1){
								System.out.println("ע������̫�٣����ܽ��г齱!");
								break menu;
							}
							while (r1 == r2) {
								r1 = (int) (Math.random() * index);
								r2 = (int) (Math.random() * index);
							}
							System.out.println("���յ������������Ϊ:" + IdNums[r1] + "\t" + IdNums[r2]);
							boolean isChecked = false;// û�н�
							for (int i = 0; i < IdNums.length; i++) {
								if (idNumInput == IdNums[r1] || idNumInput == IdNums[r2]) {
									isChecked = true;
									break;
								}
							}
							if (isChecked) {
								System.out.println("��ϲ��Ա��Ϊ:" + idNumInput + "�Ļ�Ա�����н���!");
							} else {
								System.out.println("��Ǹ����Ļ�Ա��" + idNumInput + "���Ǳ��յ����˻�Ա!");
							}
							break;
						}
					}
				} else {
					System.out.println("����û�е�¼,���ȵ�¼��");
				}
				break;
			default:
				System.out.println("�������,��ѡ����ȷ�Ĳ˵�ѡ��!");
				break;
			}
			System.out.print("���Ƿ��������ϵͳ��(y/n):");
			answer = sc.next();
		} while (answer.equals("y"));
		System.out.println("ϵͳ�˳�,ллʹ��!");
		sc.close();
		System.exit(1);
	}
}
