package com.seecen.exam.day0802;

import java.util.Scanner;

public class CalScoreDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalScore cs = new CalScore();
		System.out.print("������Java�ɼ�:");
		cs.javaScore = sc.nextDouble();
		System.out.print("������C#�ɼ�:");
		cs.CShapeScore = sc.nextDouble();
		System.out.print("������DB�ɼ�:");
		cs.DBScore = sc.nextDouble();

		System.out.println("�ܳɼ���:" + cs.sumScore());
		System.out.println("ƽ������:" + cs.avgScore());
		sc.close();
	}

}
