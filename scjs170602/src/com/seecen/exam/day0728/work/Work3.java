package com.seecen.exam.day0728.work;

import java.util.Scanner;
/**
 * ʹ��do..whileѭ��СС�Ĳ���
 * @author Administrator
 *
 */
public class Work3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = null;
		do{
			System.out.println("�ϻ���д����!");
			System.out.println("��ϸ�����(y/n)��");
			answer = sc.next();
		}while(answer.equals("n"));
		System.out.println("��ϲ��ͨ���˲���!");
		sc.close();
	}
}
