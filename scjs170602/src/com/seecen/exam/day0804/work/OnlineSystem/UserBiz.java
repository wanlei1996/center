package com.seecen.exam.day0804.work.OnlineSystem;

import java.util.Scanner;

/**
 * VIPҵ���� (ע�ᣬ��¼�����˳齱���޸����룬ע����¼����������ӡ���л�Ա��Ϣ)
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��4��
 */
public class UserBiz {

	/**
	 * �˵�1:�û�ע��
	 * 
	 * @param vips
	 *            ��Ա��������
	 * @param sc
	 *            ����̨������
	 * @param index
	 *            ��ǰ�洢λ�õ�����
	 * @return index ��ǰ�洢λ�õ�����
	 */
	public int register(User[] vips, int index, Scanner sc) {
		String registerContinue = null;
		do {
			System.out.println("����д����ע����Ϣ:");
			System.out.print("�û���:");
			String name = sc.next();
			System.out.print("����:");
			String pwd = sc.next();
			// ���û�������ɸѡ(�����ظ�)��ɸѡ������������
			boolean isNotExit = true;// �ȼ��費�����ظ�
			for (int i = 0; i < vips.length; i++) {
				if (vips[i].getName() == null) {
					break;
				}
				if (name.equals(vips[i].getName())) {
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
						for (int i = 0; i < vips.length; i++) {
							if (vips[i].getIdNum() == 0) {
								break;
							}
							if (randNum == vips[i].getIdNum()) {
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
					vips[index].setName(name);
					vips[index].setPwd(pwd);
					vips[index].setIdNum(randNum);
					System.out.println("ע��ɹ�,���ס���Ļ�Ա����,���ע����Ϣ����:");
					System.out.println("�û���\t����\t��Ա����");
					System.out.println(name + "\t" + pwd + "\t" + randNum);
				}
				index++;
				// ��index�Ĵ�С�������ݿ�Ĵ�С����ʾ����
				if (index > vips.length) {
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
	 * @param vips
	 *            ��Ա��������
	 * @param index
	 *            ��ǰ�洢λ�õ�����
	 * @param lv
	 *            ��ǰ��¼��Ա
	 * @param sc
	 *            ����̨������
	 * @return ��ǰ��¼��Ա
	 */
	public LoginedUser login(User[] vips, int index, LoginedUser lv, Scanner sc) {
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
				if (nameInput.equals(vips[i].getName())) {
					// �ҵ��˸��û���
					isExit1 = true;
					if (pwdInput.equals(vips[i].getPwd())) {
						// �ҵ��˸�����
						lv.setLoginIndex(i);
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
						lv.setLogin(true);
						lv.setLoginName(nameInput);
						break;
					}
				}
				// ��¼�ɹ���,break����������¼��ѭ�����ص��˵�����
				break;
			}
			System.out.print("���Ƿ������¼��(y/n):");
			loginContinue = sc.next();
		} while (loginContinue.equals("y"));
		return lv;
	}

	/**
	 * �˵�3:���˳齱�ķ���
	 * 
	 * @param lv
	 *            ��ǰ��¼��Ա
	 * @param vips
	 *            ��Ա��������
	 * @param sc
	 *            ����̨������
	 * @param isCome
	 *            ��ǰ��¼�û��Ƿ������齱����
	 * @param index
	 *            ��ǰ�洢λ�õ�����
	 * @return isCome(boolean) ��ǰ��¼�û��Ƿ������齱����
	 */
	public boolean luckyDraw(User[] vips, LoginedUser lv, boolean isCome,
			int index, Scanner sc) {
		if (lv.isLogin()) {
			System.out.println("��ӭ�����齱����,���Ѿ���¼����" + lv.getLoginName()
					+ ",�����Խ��г齱��");
			while (true) {
				System.out.print("���������Ļ�Ա��:");
				int idNumInput = sc.nextInt();
				if (idNumInput == 0) {
					System.out.println("��������ȷ����λ��Ա��!");
					break;
				}
				// loginIndex��ʾ�ѵ�¼�û����������е�����,������ȡ�ѵ�¼�û����Ļ�Ա����
				if (idNumInput != vips[lv.getLoginIndex()].getIdNum()) {
					System.out.println("������Ļ�Ա�����û�����ƥ��,����������!");
				} else {
					if (!isCome) {
						System.out.println("��Ա��ƥ��ɹ�," + lv.getLoginName()
								+ "��ʼ�齱��!");
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
						System.out.println("���յ������������Ϊ:" + vips[r1].getIdNum()
								+ "\t" + vips[r2].getIdNum());
						boolean isChecked = false;// û�н�
						for (int i = 0; i < vips.length; i++) {
							if (idNumInput == vips[r1].getIdNum()
									|| idNumInput == vips[r2].getIdNum()) {
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
	 * @param lv
	 *            ��ǰ��¼��Ա
	 * @param sc
	 *            ����̨������
	 * @param vips
	 *            ��Ա��������
	 */
	public void updatePwd(User[] vips, LoginedUser lv, Scanner sc) {
		if (lv.isLogin()) {
			String updateContinue = null;
			System.out.println("��ӭ" + lv.getLoginName() + "�����޸�����ģ��!");
			do {
				System.out.print("������ԭ����:");
				String oldPwd = sc.next();
				if (oldPwd.equals(vips[lv.getLoginIndex()].getPwd())) {
					System.out.println("�������ԭ����ƥ��ɹ�!");
					System.out.print("������������:");
					String newPwd = sc.next();
					System.out.print("��ȷ��һ��������:");
					String confirmNewPwd = sc.next();
					if (confirmNewPwd.equals(newPwd)) {
						vips[lv.getLoginIndex()].setPwd(newPwd);
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
	 * @param lv
	 *            ��ǰ��¼��Ա
	 * @param sc
	 *            ����̨������
	 * @param vips
	 *            ��Ա��������
	 * @param index
	 *            ��ǰ�洢λ�õ�����
	 * @return ��ǰ��¼��Ա
	 */
	public LoginedUser logOff(User[] vips, LoginedUser lv, int index, Scanner sc) {
		System.out.println("����������ע����¼���ǽ�����������(0����ע����¼,1��������),�����ѡ��:");
		int operate = sc.nextInt();
		if (operate == 0) {
			// ע����¼
			System.out.println("�����͸���ϵͳ��ע����������ע����¼��");
			if (lv.isLogin()) {
				System.out.println("�𾴵�" + lv.getLoginName() + "��Ա,�����ڴ��ڵ�¼״̬!");
				while (true) {
					System.out.print("��ȷ��Ҫ����ע����¼����(y/n):");
					String cancelLogin = sc.next();
					if (cancelLogin.equalsIgnoreCase("y")) {
						System.out.println("ע���ɹ�����������δ��¼״̬��");
						lv.setLogin(false);
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
				for (int j = 0; j < vips.length; j++) {
					if (deleteName.equalsIgnoreCase(vips[j].getName())) {
						deleteNameIsExit = true;
						deleteNameIndex = j;
						break;
					}
				}
				if (deleteNameIsExit) {
					// �û����ڣ��ٽ�������������������������գ��洢λ������-1
					vips[deleteNameIndex].setName(null);
					vips[deleteNameIndex].setPwd(null);
					vips[deleteNameIndex].setIdNum(0);
					if (deleteName.equals(lv.getLoginName())) {
						lv.setLogin(false);
					}
					System.out.println("�����ɹ������ز˵�������");
				} else {
					System.out.println("��Ҫ�������û���������,��ȷ�ϣ�");
				}
			} else {
				System.out.println("���Ѿ�ȡ������������,����˻����ڣ�");
			}
		}
		return lv;
	}

	/**
	 * �˵�6:��ӡ���л�Ա��Ϣ�ķ���
	 * 
	 * @param vips
	 *            ��Ա��������
	 * @param index
	 *            ��ǰ�洢λ�õ�����
	 */
	public void printAll(User[] vips, int index) {
		System.out.println("���д����û�����Ϣ����:");
		System.out.println("�û���\t����\t��Ա����");
		for (int i = 0; i < index; i++) {
			System.out.println(vips[i].getName() + "\t" + vips[i].getPwd()
					+ "\t" + vips[i].getIdNum());
		}
	}
}
