package com.seecen.exam.day0812;

/**
 * �����ַ�����23743298������λ�ĺͣ�ż��λ�ĺ�
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��12��
 */
public class CalStringSum {

	public static void main(String[] args) {
		String str = "23743298";
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 0; i < str.length(); i++) {
			// ���ַ��ȱ���ַ���,�ٵ���Integer.parseInt()�������ַ���תΪint
			int stringNum = Integer.parseInt(str.charAt(i) + "");
			if ((i + 1) % 2 == 0) {
				//ż��λ
				evenSum += stringNum;
			} else {
				//����λ
				oddSum += stringNum;
			}
		}
		System.out.println(str + "�ַ���ż��λ�ĺ�Ϊ:" + evenSum);
		System.out.println(str + "�ַ�������λ�ĺ�Ϊ:" + oddSum);
	}

}
