package com.seecen.exam.day0802.work;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		String answer = null ;
		System.out.println("**��ӭ����С�ͼ�����ϵͳ**");
		do{
			System.out.print("�������һ��������:");
			c.num1 = sc.nextDouble();
			System.out.print("������ڶ���������:");
			c.num2 = sc.nextDouble();
			System.out.print("�����������(+,-,*,/,%):");
			String operator = sc.next();
			
			//����Calculator��ķ�����������
			System.out.println(c.calculate(operator));
			
			System.out.print("�Ƿ��������(y/n):");
			answer = sc.next();
		}while(answer.equals("y"));
		
		sc.close();
	}
}
