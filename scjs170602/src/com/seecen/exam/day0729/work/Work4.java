package com.seecen.exam.day0729.work;

import java.util.Scanner;
/**
 * ����10�������������ɸѡ
 * @author Administrator
 */
public class Work4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������10����");
		int[] nums = new int[10];
		int[] counts = new int[]{0,0,0,0};
		for (int i = 0; i < nums.length; i++) {
			System.out.print("�������"+(i+1)+"����:");
			nums[i] = sc.nextInt();
			if(nums[i] == 1)	counts[0]++;
			else if(nums[i] == 2)	counts[1]++;
			else if(nums[i] == 3)	counts[2]++;
			else	counts[3]++;
		}
		System.out.println("���� 1 �ĸ���Ϊ:" + counts[0]);
		System.out.println("���� 2 �ĸ���Ϊ:" + counts[1]);
		System.out.println("���� 3 �ĸ���Ϊ:" + counts[2]);
		System.out.println("�Ƿ����ֵĸ���Ϊ:" + counts[3]);
		sc.close();
	}
}
