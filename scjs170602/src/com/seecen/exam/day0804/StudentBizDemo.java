package com.seecen.exam.day0804;

import java.util.Scanner;

public class StudentBizDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����student�������飬������ʵ������5��student���󣬽������������
		Student[] stus = new Student[5];
		for (int i = 0; i < stus.length; i++) {
			System.out.print("�������" + (i + 1) + "��ͬѧ�����(cm):");
			// �Ƚ�����ʵ�����ŵ��������棬ֻ���Ƚ�����new���������ܶ������Խ��в���
			stus[i] = new Student();
			stus[i].height = sc.nextFloat();
		}
		StudentBiz sb = new StudentBiz();
		System.out.println("��5��ѧ����ƽ�����Ϊ:" + sb.getAvgHeight(stus) + "cm");
		sc.close();
	}

}
