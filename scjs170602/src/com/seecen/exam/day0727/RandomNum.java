package com.seecen.exam.day0727;

import java.util.Random;
import java.util.Scanner;
/**
 * ����������ķ���
 * @author Administrator
 */
public class RandomNum {
	public static void main(String[] args) {
		/*
		 * ��һ�ַ��������������
		 *  //Math.random()����һ��0~1֮������С��
		 *	double randomNum = Math.random();
		 *	System.out.println((int)(randomNum * 100));
		 * �ڶ��ַ��������������
		 *  //rd.nextInt(bound)��bound��ʾ�߽磬��0��ʼ
		 *	Random rd = new Random();
		 *	System.out.println(rd.nextInt(100));
		 */
		//�������һ��0~9֮�������
		Random rd = new Random();
		int randomNum = rd.nextInt(10);
//		System.out.println(randomNum);
		System.out.println("�������ع������ϵͳ>���˳齱");
		System.out.println("������4λ��Ա�ţ�");
		Scanner sc = new Scanner(System.in);
		int IdNum = sc.nextInt();
		int IdNum2 = IdNum/10%10 ;//��λ����
		if(IdNum2 == randomNum) {
			System.out.println(IdNum+"�ſͻ������˿ͻ�����þ���Mp3һ����");
		}else{
			System.out.println("���ź�����û�н���");
		}
		System.out.println("--------------------------------------");
		System.out.println("���������Ƿ��ǻ�Ա ���ǣ�y��,�������ַ���");
		String isVip = sc.next();
		System.out.println("�����빺���");
		double money = sc.nextDouble();
		double sum;
		if(isVip.equals("y")){
			//�ǻ�Ա
			if(money>=200){
				sum  = money * 0.75;
			}else{
				sum  = money * 0.8;
			}
		}else{
			//���ǻ�Ա
			if(money>=100){
				sum  = money * 0.9;
			}else{
				sum  = money * 1.0;
			}
		}
		System.out.println("ʵ��֧����"+ sum);
		sc.close();
	}
}
