package com.seecen.exam.day0802.work;

import java.util.Scanner;

public class ComputerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Computer c = new Computer();
		System.out.print("�������������:");
		c.name = sc.next();
		System.out.print("��������Գߴ�:");
		c.size = sc.nextDouble();
		System.out.print("��������Լ۸�:");
		c.price = sc.nextDouble();
		System.out.println("���ĵ�����Ϣ����:");
		System.out.println(c.toString());
		sc.close();
	}

}
