package com.seecen.exam.day0805;

import java.util.Scanner;

/**
 * ������������,������Ǻ�����+,-,*,/֮��Ľ��
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��5��
 */
public class Work1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ������:");
		int num1 = sc.nextInt();
		System.out.print("������ڶ�������:");
		int num2 = sc.nextInt();
		System.out.println("num1 = " + num1 + " , num2 = " + num2);
		System.out.println("num1 + num2 =" + (num1 + num2));
		System.out.println("num1 - num2 =" + (num1 - num2));
		System.out.println("num1 * num2 =" + (num1 * num2));
		System.out.println("num1 / num2 =" + (num1 / num2));
		sc.close();
	}

}
