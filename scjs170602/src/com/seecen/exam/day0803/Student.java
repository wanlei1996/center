package com.seecen.exam.day0803;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ѧԱ��
 * 
 * @author ����
 */
public class Student {
	private String[] stus = new String[5];

	/**
	 * ���� ¼��5λѧԱ����Ϣ
	 */
	public void addName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������¼��5λѧԱ������:");
		for (int i = 0; i < stus.length; i++) {
			stus[i] = sc.next();
		}
		System.out.println("¼����Ϣ���!");
		sc.close();
	}

	/**
	 * ѧԱ���鱻˽�л��ˣ���ͨ�����з�������ȡѧԱ����
	 * 
	 * @return ѧԱ����
	 */
	public String[] getStus() {
		return stus;
	}
	/**
	 * ������,����ʾ����ѧԱ����Ϣ
	 */
	public void showAll(){
		Arrays.sort(stus);
		for (int i = 0; i < stus.length; i++) {
			System.out.print(stus[i] + "  ");
		}
	}
}
