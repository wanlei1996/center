package com.seecen.exam.day0726;

import java.util.Scanner;

/**
 * ���׵Ĺ������ϵͳ
 * 
 * @author Administrator
 */
public class ShopManageSystem {
	public static void main(String[] args) {
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("1.��¼ϵͳ");
		System.out.println("2.�˳�ϵͳ");
		System.out.println("��ѡ���������֣�");
		Scanner sc = new Scanner(System.in);
		int index1 = sc.nextInt();
		if (index1 == 1) {
			System.out.println("��ӭ�㣬��¼�ɹ���");
		} else {
			System.out.println("���Ѿ��˳�ϵͳ��");
		}
		System.out.println("***************************************");
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("1.�ͻ���Ϣ����");
		System.out.println("2.�������");
		System.out.println("3.�������");
		System.out.println("4.ע����¼");
		System.out.println("��ѡ���������֣�");
		int index2 = sc.nextInt();
		switch (index2) {
		case 1:
			System.out.println("�ͻ���Ϣ���£�");
			break;
		case 2:
			System.out.println("����������£�");
			break;
		case 3:
			System.out.println("���������");
			break;
		default:
			System.out.println("���Ѿ�ע����¼�ˣ�");
			break;
		}
		sc.close();
	}
}
