package com.seecen.exam.day0726.work;

import java.util.Scanner;

/**
 *  ����һ�������¶ȣ� ��������¶�
	��ʽ���� = (��F - 32) / 1.8
 * @author Administrator
 *
 */
public class Work4 {
	public static void main(String[] args) {
		System.out.println("������һ�������¶ȣ�");
		Scanner sc = new Scanner(System.in);
		double oF = sc.nextDouble();
		double tem = (oF-32)/1.8;
		System.out.println("�����������¶�Ϊ��" + tem);
		sc.close();
	}
}
