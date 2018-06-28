package com.seecen.exam.day0807.work;

import java.util.Scanner;

/**
 * ��һ���ַ����в���ָ���ַ���λ��
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��7��
 */
public class Work1FindString {
	/**
	 * �����ַ�������ָ���ַ���λ��
	 * 
	 * @param str
	 *            �ַ���
	 * @param findStr
	 *            ָ���ַ���
	 * @return ���λ������������,���һ����ų��ֵĴ���
	 */
	public int[] findString(String str, String findStr) {
		int index = str.indexOf(findStr);
		// ���ֵĴ���
		int count = 0;
		// ���λ������������
		int[] results = new int[str.length()];
		while (index != -1) {
			results[count++] = index;
			index = str.indexOf(findStr, index + 1);
		}
		//�����ִ��������������һ��λ�ã��������ȡ������
		results[str.length() - 1] = count;
		return results;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Work1FindString fs = new Work1FindString();
		System.out.println("������һ���ַ�:");
		String str = sc.next();
		System.out.println("������Ҫ���ҵ��ַ���:");
		String findStr = sc.next();
		int[] results = fs.findString(str, findStr);
		System.out.print(findStr + "���ֵ�λ����:");
		for (int i = 0; i < results[str.length() - 1]; i++) {
			System.out.print(results[i] + " ");
		}
		sc.close();
	}

}
