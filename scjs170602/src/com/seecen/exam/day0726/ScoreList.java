package com.seecen.exam.day0726;

import java.util.Scanner;
/**
 * �ɼ�ͳ���嵥
 * @author Administrator
 */
public class ScoreList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���������ĳɼ���");
		int chinese=sc.nextInt();
		System.out.println("��������ѧ�ɼ���");
		int math=sc.nextInt();
		System.out.println("������Java�ɼ���");
		int java=sc.nextInt();
		System.out.println("-----------------------");
		System.out.println("��ĳɼ��б����£�");
		System.out.println("��Ŀ\t�ɼ�");
		System.out.println("����\t" + chinese);
		System.out.println("��ѧ\t" + math);
		System.out.println("Java\t" + java);
		System.out.println("-----------------------");
		int sum = chinese + math + java;
		double averge = sum / 3;
		int max = 0;
		if (chinese >= math){
			max = chinese;
		}else{
			max = math;
		}
		if(max <= java){
			max = java;
		}
		System.out.println("�����߷��ǣ�" + max + "��");
		System.out.println("����ܷ��ǣ�" + sum + "��");
		System.out.println("���ƽ�����ǣ�" + averge + "��");
		sc.close();
	}
}
