package com.seecen.exam.day0731.work;

import java.util.Scanner;

/**
 * ����3���࣬ÿ����4��ѧԱ��ƽ����
 * 
 * @author Administrator
 */
public class CountScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[4];
		double sum = 0;
		for (int j = 0; j < 3; j++) {
			System.out.println("----��¼���" + (j + 1) + "����ĳɼ�----");
			for (int i = 0; i < scores.length; i++) {
				System.out.print("�������" + (i + 1) + "��ѧԱ�ĳɼ�:");
				scores[i] = sc.nextInt();
				sum += scores[i];
			}
			System.out.println("��" + (j + 1) + "�����ƽ����Ϊ:"
					+ (sum / scores.length));
		}
		sc.close();
	}
}
