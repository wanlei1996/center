package com.seecen.exam.day0729.work;

import java.util.Scanner;
/**
 * ��ԭ�л��ֽ��б��ݣ�Ȼ������ÿλ��Ա500���֣������
 * @author Administrator
 */
public class Work1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������5λ��Ա�Ļ���");
		int[] oldPrices = new int[5];
		int[] newPrices = new int[5];
		for (int i = 0; i < oldPrices.length; i++) {
			System.out.print("��"+(i+1)+"λ��Ա�Ļ���:");
			oldPrices[i] = sc.nextInt();
			newPrices[i] = oldPrices[i] + 500 ;
		}
		System.out.println("���\t��ʷ����\t�»���");
		for (int i = 0; i < oldPrices.length; i++) {
			System.out.println((i+1)+"\t"+oldPrices[i]+"\t"+newPrices[i]);
		}
		sc.close();
	}
}
