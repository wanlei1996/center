package com.seecen.exam.day0726.work;

import java.util.Scanner;

/**
 *  �û��������ʹ������
	2.25%//����1������
	2.7/100;//����2������
	3.24/100;//����3������
	3.6/100;//����5������
 * @author Administrator
 *
 */
public class Work5 {
	public static void main(String[] args) {
		System.out.println("��������");
		Scanner sc = new Scanner(System.in);
		double money = sc.nextDouble();
		System.out.println("������������(1,2,3,5)��");
		int year = sc.nextInt();
		switch (year) {
		case 1:
			money += money * (2.25/100);
			break;
		case 2:
			money += money * (2.7/100);
			break;
		case 3:
			money += money * (3.24/100);
			break;
		case 5:
			money += money * (3.6/100);
			break;
		default :
			System.out.println("��������ȷ������!");
			break;
		}
		System.out.println("���"+year+"�����ܽ��Ϊ��" + money);
		sc.close();
	}
}
