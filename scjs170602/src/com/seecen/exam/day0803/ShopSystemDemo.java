package com.seecen.exam.day0803;

import java.util.Scanner;

public class ShopSystemDemo {

	public static void main(String[] args) {
		ShopSystem ss = new ShopSystem();
		Scanner sc = new Scanner(System.in);
		ss.printHeader();
		System.out.print("��ѡ��,��������:");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			String answer = null;
			do{
				ss.printMainMenu();
				System.out.print("��ѡ��,��������(0������һ���˵�):");
				int menu = sc.nextInt();
				if(menu==1){
					ss.customerManage();
				}
				if(menu==2){
					ss.tureFeedback();
				}
				if(menu==0){
					ss.printHeader();
				}
				System.out.print("�Ƿ����(y/n):");
				answer = sc.next();
			}while(answer.equals("y"));
			break;
		case 2:
			System.out.println("ϵͳ�˳�,ллʹ�ã�");
			System.exit(1);
			break;
		default:
			System.out.println("��������ȷ��ѡ�");
			break;
		}
		sc.close();
	}
}
