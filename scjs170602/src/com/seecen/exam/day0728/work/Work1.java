package com.seecen.exam.day0728.work;

import java.util.Scanner;
/**
 * Myshopping����ϵͳ-ѡ��˵����ж�
 * @author Administrator
 */
public class Work1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ӭʹ��MyShopping����ϵͳ");
		System.out.println("**********************************");
		System.out.println("\t1.�ͻ���Ϣ����");
		System.out.println("\t2.�������");
		System.out.println("\t3.�������");
		System.out.println("\t4.ע����¼");
		System.out.println("**********************************");
		System.out.println("��ѡ����������:");
		int num = sc.nextInt();
		while(num>=5||num==0){
			if(num>=5||num==0){
				System.out.println("���������������������:");
				num = sc.nextInt();
			}else{
				switch (num) {
				case 1:
					System.out.println("ִ�пͻ���Ϣ����");
					break;
				case 2:
					System.out.println("ִ�й������");
					break;
				case 3:
					System.out.println("ִ���������");
					break;
				case 4:
					System.out.println("ִ��ע����¼");
					break;
				default:
					break;
				}
			}
		}
		switch (num) {
		case 1:
			System.out.println("ִ�пͻ���Ϣ����");
			break;
		case 2:
			System.out.println("ִ�й������");
			break;
		case 3:
			System.out.println("ִ���������");
			break;
		case 4:
			System.out.println("ִ��ע����¼");
			break;
		default:
			break;
		}
		System.out.println("�������");
		System.exit(1);
		sc.close();
	}
}
