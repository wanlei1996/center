package com.seecen.exam.day0807.work;

import java.util.Scanner;

/**
 * ��֤��Ա���պ�����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��7��
 */
public class Work2Validate {
	/**
	 * ��֤����
	 * 
	 * @param pwd
	 *            ����
	 * @return ������������true�����򷵻�false
	 */
	public boolean checkPwd(String pwd) {
		//���볤��Ϊ6~10λ
		if (pwd.length() < 6 || pwd.length() > 10) {
			return false;
		}
		return true;
	}

	/**
	 * ��֤����
	 * 
	 * @param birth
	 *            ����
	 * @return ������������true�����򷵻�false
	 */
	public boolean checkBirth(String birth) {
		String[] strs = birth.split("/");
		String preStr = strs[0];
		String nextStr = strs[1];
		// ǰ���泤�ȱ���Ϊ2
		if (preStr.length() != 2 || nextStr.length() != 2) {
			return false;
		}
		// ǰ�������Ϊ������(0~9)
		for (int i = 0; i < preStr.length(); i++) {
			if (!(preStr.charAt(i) >= '0' && preStr.charAt(i) <= '9')) {
				return false;
			}
			if (!(nextStr.charAt(i) >= '0' && nextStr.charAt(i) <= '9')) {
				return false;
			}
		}
		// ת��Ϊ���֣��ж��䷶Χ
		int preNum = Integer.parseInt(preStr);
		int nextNum = Integer.parseInt(nextStr);
		if (!(preNum >= 1 && preNum <= 12)) {
			return false;
		}
		if (!(nextNum >= 1 && nextNum <= 31)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Work2Validate wv = new Work2Validate();
		while (true) {
			boolean istrue1 = false;
			boolean istrue2 = false;

			System.out.print("�������Ա����<��/��>:");
			String birthInput = sc.next();
			if (wv.checkBirth(birthInput)) {
				System.out.println("���ո�ʽ��ȷ,�û�Ա��������:" + birthInput);
				istrue1 = true;
			} else {
				System.out.println("����������ո�ʽ����!");
			}

			System.out.print("�������Ա����<6~10λ>:");
			String pwdInput = sc.next();
			if (wv.checkPwd(pwdInput)) {
				System.out.println("�����ʽ��ȷ,������:" + pwdInput);
				istrue2 = true;
			} else {
				System.out.println("��������������!");
			}
			// �����պ�����ͬʱͨ��������ѭ��
			if (istrue1 && istrue2)
				break;
		}
		sc.close();
	}

}
