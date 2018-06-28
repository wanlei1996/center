package com.seecen.exam.day0801;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ���͸���ϵͳ�� (7������,6��ϵͳ���ܲ˵�)
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��4��
 */
public class OnlineSystem {
	/**
	 * ��ӡ�˵��ķ���
	 */
	public void printMenu() {
		System.out.println("******��ӭ���뽱�͸���ϵͳ******");
		System.out.println("\t1.�û�ע��");
		System.out.println("\t2.�û���¼");
		System.out.println("\t3.���˳齱");
		System.out.println("\t4.�޸�����");
		System.out.println("\t5.ע����¼������");
		System.out.println("\t6.��ӡ�û���Ϣ");
		System.out.println("***************************");
		System.out.print("��ѡ��˵�(����):");
	}

	/**
	 * �˵�1:�û�ע��ķ���
	 * 
	 * @param idNums
	 *            ��Ա����
	 * @param pwds
	 *            ��������
	 * @param names
	 *            �û�������
	 * @param sc
	 *            ����̨������
	 * @return index ��ǰ�洢λ�õ�����
	 */
	public int register(String[] names, String[] pwds, int[] idNums, int index,
			Scanner sc) {
		String registerContinue = null;
		do {
			System.out.println("����д����ע����Ϣ:");
			System.out.print("�û���:");
			String name = sc.next();
			System.out.print("����:");
			String pwd = sc.next();
			// ���û�������ɸѡ(�����ظ�)��ɸѡ������������
			boolean isNotExit = true;// �ȼ��費�����ظ�
			for (int i = 0; i < names.length; i++) {
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
						for (int i = 0; i < names.length; i++) {
							if (idNums[i] == 0) {
								break;
							}
							if (randNum == idNums[i]) {
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
					idNums[index] = randNum;
					System.out.println("ע��ɹ�,���ס���Ļ�Ա����,���ע����Ϣ����:");
					System.out.println("�û���\t����\t��Ա����");
					System.out.println(name + "\t" + pwd + "\t" + randNum);
				}
				index++;
				// ��index�Ĵ�С�������ݿ�Ĵ�С����ʾ����
				if (index > names.length) {
					System.out.println("ϵͳ�û��������ݲ�����ע��!");
				}
			}
			System.out.print("���Ƿ����ע�᣿(y/n):");
			registerContinue = sc.next();
		} while (registerContinue.equals("y"));
		System.out.println("ע�����,���˳�!");
		return index;
	}

	/**
	 * �˵�2:�û���¼�ķ���
	 * 
	 * @param idNums
	 *            ��Ա����
	 * @param pwds
	 *            ��������
	 * @param names
	 *            �û�������
	 * @param sc
	 *            ����̨������
	 * @param loginIndex
	 *            ��ǰ�ѵ�¼������
	 * @param loginName
	 *            ��ǰ�ѵ�¼���û���
	 * @param isLogin
	 *            ��¼״̬
	 * @return index ��ǰ�洢λ�õ�����
	 * @return ArrayList<Object>���ض����ͬ���͵ķ���ֵ
	 */
	public ArrayList<Object> login(String[] names, String[] pwds, int index,
			boolean isLogin, String loginName, int loginIndex, Scanner sc) {
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
						System.out.println("��ӭ" + nameInput + ",���Ѿ���¼��!");
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
		ArrayList<Object> returnValue = new ArrayList<Object>();
		returnValue.add(isLogin);
		returnValue.add(loginIndex);
		returnValue.add(loginName);
		return returnValue;
	}

	/**
	 * �˵�3:���˳齱�ķ���
	 * 
	 * @param idNums
	 *            ��Ա����
	 * @param sc
	 *            ����̨������
	 * @param loginIndex
	 *            ��ǰ�ѵ�¼������
	 * @param loginName
	 *            ��ǰ�ѵ�¼���û���
	 * @param isLogin
	 *            ��¼״̬
	 * @param isCome
	 *            ��ǰ��¼�û��Ƿ������齱����
	 * @param index
	 *            ��ǰ�洢λ�õ�����
	 * @return isCome(boolean) ��ǰ��¼�û��Ƿ������齱����
	 */
	public boolean luckyDraw(int[] idNums, boolean isLogin, String loginName,
			boolean isCome, int loginIndex, int index, Scanner sc) {
		if (isLogin) {
			System.out.println("��ӭ�����齱����,���Ѿ���¼����" + loginName + ",�����Խ��г齱��");
			while (true) {
				System.out.print("���������Ļ�Ա��:");
				int idNumInput = sc.nextInt();
				if (idNumInput == 0) {
					System.out.println("��������ȷ����λ��Ա��!");
					break;
				}
				// loginIndex��ʾ�ѵ�¼�û����������е�����,������ȡ�ѵ�¼�û����Ļ�Ա����
				if (idNumInput != idNums[loginIndex]) {
					System.out.println("������Ļ�Ա�����û�����ƥ��,����������!");
				} else {
					if (!isCome) {
						System.out.println("��Ա��ƥ��ɹ�," + loginName + "��ʼ�齱��!");
						isCome = true;
						// �������������Ա����,����������������ȣ��ͼ������������֪�������
						int r1 = 0, r2 = 0;
						// ��ע������Ϊ1��ʱ�����ܽ��г齱����Ϊ���˿���������
						if (index == 1) {
							System.out.println("ע������̫�٣����ܽ��г齱!");
							break;
						}
						while (r1 == r2) {
							r1 = (int) (Math.random() * index);
							r2 = (int) (Math.random() * index);
						}
						System.out.println("���յ������������Ϊ:" + idNums[r1] + "\t"
								+ idNums[r2]);
						boolean isChecked = false;// û�н�
						for (int i = 0; i < idNums.length; i++) {
							if (idNumInput == idNums[r1]
									|| idNumInput == idNums[r2]) {
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
		return isCome;
	}

	/**
	 * �˵�4:�޸�����ķ���
	 * 
	 * @param sc
	 *            ����̨������
	 * @param loginIndex
	 *            ��ǰ�ѵ�¼������
	 * @param loginName
	 *            ��ǰ�ѵ�¼���û���
	 * @param isLogin
	 *            ��¼״̬
	 * @param pwds
	 *            ��������
	 * @param names
	 *            �û�������
	 */
	public void updatePwd(String[] names, String[] pwds, boolean isLogin,
			String loginName, int loginIndex, Scanner sc) {
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
	}

	/**
	 * �˵�5:ע����¼�������ķ���
	 * 
	 * @param sc
	 *            ����̨������
	 * @param loginName
	 *            ��ǰ�ѵ�¼���û���
	 * @param isLogin
	 *            ��¼״̬
	 * @param pwds
	 *            ��������
	 * @param names
	 *            �û�������
	 * @param index
	 *            ��ǰ�洢λ�õ�����
	 * @param idNums
	 *            ��Ա������
	 * @return isLogin(boolean) ��¼״̬
	 */
	public boolean logOff(String[] names, String[] pwds, int[] idNums,
			boolean isLogin, String loginName, int index, Scanner sc) {
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
					idNums[deleteNameIndex] = 0;
					if (deleteName.equals(loginName)) {
						isLogin = false;
					}
					System.out.println("�����ɹ������ز˵�������");
				} else {
					System.out.println("��Ҫ�������û���������,��ȷ�ϣ�");
				}
			} else {
				System.out.println("���Ѿ�ȡ������������,����˻����ڣ�");
			}
		}
		return isLogin;
	}

	/**
	 * �˵�6:��ӡ���л�Ա��Ϣ�ķ���
	 * 
	 * @param pwds
	 *            ��������
	 * @param names
	 *            �û�������
	 * @param index
	 *            ��ǰ�洢λ�õ�����
	 * @param idNums
	 *            ��Ա������
	 */
	public void printAll(String[] names, String[] pwds, int[] idNums, int index) {
		System.out.println("���д����û�����Ϣ����:");
		System.out.println("�û���\t����\t��Ա����");
		for (int i = 0; i < index; i++) {
			System.out.println(names[i] + "\t" + pwds[i] + "\t" + idNums[i]);
		}
	}
}
