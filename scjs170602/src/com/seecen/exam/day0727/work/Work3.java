package com.seecen.exam.day0727.work;

import java.util.Scanner;
/**
 * switch��ʹ�ú�if..else if�Ƚṹ��ʹ��
 * @author Administrator
 */
public class Work3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������Ա�ɽ�ĳɼ���");
		int score = sc.nextInt();
		if(score==100){
			System.out.println("�ְָ�����������");
		}else if(score>=90&&score<100){
			System.out.println("���������MP4��");
		}else if(score>=60&&score<90){
			System.out.println("��������򱾲ο��飡");
		}else{
			System.out.println("ʲô������");
		}
		System.out.println("------------------------------");
		System.out.println("����Ϊ�����ֻ��趨���Զ����ţ�����������(1,2,3,4)��");
		int  num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("��"+num+"�����ְֵĺ�");
			break;
		case 2:
			System.out.println("��"+num+"��������ĺ�");
			break;
		case 3:
			System.out.println("��"+num+"����үү�ĺ�");
			break;
		case 4:
			System.out.println("��"+num+"�������̵ĺ�");
			break;
		default:
			System.out.println("��������ȷ��ѡ�");
			break;
		}
		sc.close();
	}
}
