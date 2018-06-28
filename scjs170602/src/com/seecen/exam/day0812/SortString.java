package com.seecen.exam.day0812;

import java.util.Arrays;

/**
 * �Լ���д���뽫�ַ���String s=��11.1,56.1,2.9,34.3,1.03,24.2�����մ�С������������Ľ������ double
 * []������
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��12��
 */
public class SortString {

	public static void main(String[] args) {
		String s = "11.1,56.1,2.9,34.3,1.03,24.2";
		SortString ss = new SortString();
		double[] results = ss.sortString(s);
		System.out.println("������double����Ϊ:");
		for (double d : results) {
			System.out.print(d + " ");
		}
	}

	/**
	 * �ַ�������
	 * 
	 * @param str
	 *            Ҫ������ַ���
	 * @return �����귵�ص�����
	 */
	public double[] sortString(String str) {
		String[] strs = str.split(",");
		double[] newStrs = new double[strs.length];
		for (int i = 0; i < strs.length; i++) {
			// ����Double.parseDouble�������ַ���תΪdouble
			double strNum = Double.parseDouble(strs[i]);
			// �ٽ�ת�����double���ַ���һ���µ�double������
			newStrs[i] = strNum;
		}
		// ���µ�double�����������
		Arrays.sort(newStrs);
		return newStrs;
	}
}
