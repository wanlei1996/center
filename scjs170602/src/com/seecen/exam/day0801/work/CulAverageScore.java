package com.seecen.exam.day0801.work;

import java.util.Scanner;

/**
 * �����������ѧԱƽ���ּ��ɼ�Ϊ85�����ϵ�ѧԱ����
 * @author ����
 */
public class CulAverageScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int classCount = 3;
		int[] scores = new int[4];
		int count = 0;//����85�����ϵ�ѧԱ����
		for (int i = 1; i <= classCount; i++) {
			//ÿ��ѭ����sum��0
			double sum = 0;
			System.out.println("�������" + i +"���༶�ĳɼ�");
			for (int j = 0; j < scores.length; j++) {
				System.out.print("��" + (j+1) + "��ѧԱ�ĳɼ�:");
				scores[i] = sc.nextInt();
				sum += scores[i];
				if(scores[i]>=85){
					count++;
				}
			}
			System.out.println("��"+i+"���༶����ѧԱ��ƽ����Ϊ:" + sum/scores.length);
			System.out.println();
		}
		System.out.println("�ɼ�Ϊ85�����ϵ�ѧԱ����Ϊ" + count);
		sc.close();
	}
}
