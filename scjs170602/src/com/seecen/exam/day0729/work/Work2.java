package com.seecen.exam.day0729.work;

import java.util.Scanner;
/**
 * ����5�仰�������������
 * @author Administrator
 */
public class Work2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������5�仰");
		String[] Word = new String[5];
		for (int i = 0; i < Word.length; i++) {
			System.out.print("��"+(i+1)+"�仰:");
			Word[i] = sc.next();
		}
		System.out.println("�������5�仰Ϊ:");
		for (int i = Word.length - 1; i >= 0; i--) {
			System.out.println(Word[i]);
		}
		sc.close();
	}
}
