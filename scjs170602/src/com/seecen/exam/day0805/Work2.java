package com.seecen.exam.day0805;

import java.util.Scanner;

/**
 * ����һ����λ������������ĸ�λ����֮��
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��5��
 */
public class Work2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ����λ����:");
		int num = sc.nextInt();
		int sum = 0;
		sum += num % 10 + num / 10 % 10 + num / 100 % 10 + num / 1000 % 10;
		System.out.println(num + "��λ����֮��Ϊ:" + sum);
		sc.close();
	}

}
