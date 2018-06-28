package com.seecen.exam.day0731.work;

import java.util.Scanner;

/**
 * С�͵ļ������߽��͸���ϵͳ(��ϵͳ��ע�ᣬ��¼���齱���޸����룬ע����¼������,��ӡ�û���Ϣ�ȹ���)
 * ��������:��ϵͳ������ע�ᣬ�ٽ��е�¼�������ȵ�¼���ٽ��г齱,�����ȵ�¼,�ſ����޸ĸ��û���������
 * �����ȵ�¼������ע����¼���������û��������룬��Ա���Ų����ڵģ� ��������: 1.ע�ᣨ���ж��û�����������8λ�� 2.��¼��������֤�룩
 * 3.�齱��ÿ���û�ֻ�ܳ�һ�Σ� 4.�޸����� 5.ע��������
 * 
 * @author Administrator
 */
public class OnlineSystemUpdate {
	public static void printMenu() {
		System.out.println("******��ӭ���뽱�͸���ϵͳ******");
		System.out.println("\t1.ע��");
		System.out.println("\t2.��¼");
		System.out.println("\t3.�齱");
		System.out.println("\t4.�޸�����");
		System.out.println("\t5.ע����¼������");
		System.out.println("\t6.��ӡ�û���Ϣ");
		System.out.println("***************************");
		System.out.print("��ѡ��˵�:");
	}

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
		// �ȼ���û�����齱����
		boolean isCome = false;
		// ��ǰ�洢λ��
		int index = 0;
		do {
			printMenu();
			int menuNum = sc.nextInt();
			menu: switch (menuNum) {
			case 1:// ע��ģ��
				System.out.println("�����͸���ϵͳ��ע�᡿");
				String registerContinue = null;
				do {
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
						// �û�����������8λ
						if (name.length() > 8 || name.length() == 0) {
							System.out.println("�û����ĳ��ȱ�����1~8λ֮�䣬���������룡");
						} else {
							// �û������ظ�,����ʹ��,�����ɲ��ظ��������Ա����
							int randNum = 0;
							while (true) {
								boolean IdNumIsExist = false;// ���費�����ظ�
								randNum = 1000 + (int) (Math.random() * 9000);// 1000-10000
								for (int i = 0; i < dbSize; i++) {
									if (IdNums[i] == 0) {
										break;
									}
									if (randNum == IdNums[i]) {
										IdNumIsExist = true;
										break;
									}
								}
								// ����������ظ������������ѭ��������ʹ�øû�Ա�ţ�����һֱ�����������ֱ�����ظ�Ϊֹ
								if (!IdNumIsExist) {
									break;
								}
							}
							// ���û���,����ͻ�Ա����������Ӧ�������в���ӡע����Ϣ
							names[index] = name;
							pwds[index] = pwd;
							IdNums[index] = randNum;
							System.out.println("ע��ɹ�,���ס���Ļ�Ա����,���ע����Ϣ����:");
							System.out.println("�û���\t����\t��Ա����");
							System.out.println(name + "\t" + pwd + "\t"
									+ randNum);
						}
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
				System.out.println("�����͸���ϵͳ����¼��");
				String loginContinue = null;
				int count = 3;// 3������������
				do {
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
						while (true) {
							int codeNum = 1000 + (int) (Math.random() * 9000);// 1000-10000
							System.out.println("��֤����:" + codeNum);
							System.out.print("��������֤��:");
							int codeNumInput = sc.nextInt();
							if (codeNumInput != codeNum) {
								System.out.println("��֤�벻һ�£����������룡");
							} else {
								// ��֤����֤,����֤��ͨ��ʱ,�������¼��break����ѭ��
								System.out.println("��ӭ" + nameInput
										+ ",���Ѿ���¼��!");
								isLogin = true;
								loginName = nameInput;
								break;
							}
						}
						// ��¼�ɹ���,break����������¼��ѭ�����ص��˵�����
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
						// loginIndex��ʾ�ѵ�¼�û����������е�����,������ȡ�ѵ�¼�û����Ļ�Ա����
						if (idNumInput != IdNums[loginIndex]) {
							System.out.println("������Ļ�Ա�����û�����ƥ��,����������!");
						} else {
							if (!isCome) {
								System.out.println("��Ա��ƥ��ɹ�," + loginName
										+ "��ʼ�齱��!");
								isCome = true;
								// �������������Ա����,����������������ȣ��ͼ������������֪�������
								int r1 = 0, r2 = 0;
								// ��ע������Ϊ1��ʱ�����ܽ��г齱����Ϊ���˿���������
								if (index == 1) {
									System.out.println("ע������̫�٣����ܽ��г齱!");
									break menu;
								}
								while (r1 == r2) {
									r1 = (int) (Math.random() * index);
									r2 = (int) (Math.random() * index);
								}
								System.out.println("���յ������������Ϊ:" + IdNums[r1]
										+ "\t" + IdNums[r2]);
								boolean isChecked = false;// û�н�
								for (int i = 0; i < IdNums.length; i++) {
									if (idNumInput == IdNums[r1]
											|| idNumInput == IdNums[r2]) {
										isChecked = true;
										break;
									}
								}
								if (isChecked) {
									System.out.println("��ϲ��Ա��Ϊ:" + idNumInput
											+ "�Ļ�Ա�����н���!");
								} else {
									System.out.println("��Ǹ����Ļ�Ա��" + idNumInput
											+ "���Ǳ��յ����˻�Ա!");
								}
								break;
							} else {
								System.out.println("ÿ���û�ֻ�ܳ�һ��,���Ѿ����һ������");
								break;
							}
						}
					}
				} else {
					System.out.println("����û�е�¼,���ȵ�¼��");
				}
				break;
			case 4:// �޸�����ģ��
				System.out.println("�����͸���ϵͳ���޸����롿");
				if (isLogin) {
					String updateContinue = null;
					System.out.println("��ӭ" + loginName + "�����޸�����ģ��!");
					do {
						System.out.print("������ԭ����:");
						String oldPwd = sc.next();
						if (oldPwd.equals(pwds[loginIndex])) {
							System.out.println("�������ԭ����ƥ��ɹ�!");
							System.out.print("������������:");
							String newPwd = sc.next();
							System.out.print("��ȷ��һ��������:");
							String confirmNewPwd = sc.next();
							if (confirmNewPwd.equals(newPwd)) {
								pwds[loginIndex] = newPwd;
								System.out.println("�޸�����ɹ�,����ȥ��¼����");
								break;
							} else {
								System.out.println("��������������벻һ�£�������ȷ�ϣ�");
							}
						} else {
							System.out.println("�������ԭ�������,����������!");
						}
						System.out.print("���Ƿ�����޸����룿(y/n):");
						updateContinue = sc.next();
					} while (updateContinue.equalsIgnoreCase("y"));
				} else {
					System.out.println("����û�е�¼,���ܽ����޸��������!");
				}
				break;
			case 5:// ע����¼������ģ��
				System.out.println("�����͸���ϵͳ��ע����¼��������");
				System.out.println("����������ע����¼���ǽ�����������(0����ע����¼,1��������),�����ѡ��:");
				int operate = sc.nextInt();
				if (operate == 0) {
					// ע����¼
					System.out.println("�����͸���ϵͳ��ע����������ע����¼��");
					if (isLogin) {
						System.out.println("�𾴵�" + loginName + "��Ա,�����ڴ��ڵ�¼״̬!");
						while (true) {
							System.out.print("��ȷ��Ҫ����ע����¼����(y/n):");
							String cancelLogin = sc.next();
							if (cancelLogin.equalsIgnoreCase("y")) {
								System.out.println("ע���ɹ�����������δ��¼״̬��");
								isLogin = false;
								break;
							} else {
								System.out.println("���Ѿ�ȡ��ע�������ǵ�¼״̬��");
							}
						}
					} else {
						System.out.println("��û���û����ڵ�¼״̬,����ע����¼,���ȵ�¼��");
					}
				}
				if (operate == 1) {
					// ����
					System.out.println("�����͸���ϵͳ��ע����������������");
					System.out.print("��ȷ��Ҫ������������(�������㽫Ҫ����ע��)(y/n):");
					String isCancel = sc.next();
					if (isCancel.equalsIgnoreCase("y")) {
						System.out.print("��������Ҫ�������û�����:");
						String deleteName = sc.next();
						// �����û���������
						boolean deleteNameIsExit = false;
						int deleteNameIndex = 0;
						for (int j = 0; j < names.length; j++) {
							if (deleteName.equalsIgnoreCase(names[j])) {
								deleteNameIsExit = true;
								deleteNameIndex = j;
								break;
							}
						}
						if (deleteNameIsExit) {
							// �û����ڣ��ٽ�������������������������գ��洢λ������-1
							names[deleteNameIndex] = null;
							pwds[deleteNameIndex] = null;
							IdNums[deleteNameIndex] = 0;
							if (deleteName.equals(loginName)) {
								isLogin = false;
							}
							index--;
							System.out.println("�����ɹ������ز˵�������");
							break menu;
						} else {
							System.out.println("��Ҫ�������û���������,��ȷ�ϣ�");
						}
					} else {
						System.out.println("���Ѿ�ȡ������������,����˻����ڣ�");
					}
				}
				break;
			case 6:// ��ӡ�û���Ϣģ��
				System.out.println("�����͸���ϵͳ����ӡ�û���Ϣ��");
				System.out.println("���д����û�����Ϣ����:");
				System.out.println("�û���\t����\t��Ա����");
				for (int i = 0; i < index; i++) {
					System.out.println(names[i] + "\t" + pwds[i] + "\t"
							+ IdNums[i]);
				}
				break;
			default:
				System.out.println("�������,��ѡ����ȷ�Ĳ˵�ѡ��!");
				break;
			}
			System.out.print("���Ƿ��������ϵͳ�˵���(y/n):");
			answer = sc.next();
		} while (answer.equals("y"));
		System.out.println("ϵͳ�˳�,ллʹ��!");
		sc.close();
		System.exit(1);
	}
}
