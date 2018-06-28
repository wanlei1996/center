package com.seecen.exam.day0803.work;

import java.util.Scanner;
/**
 * ����ATMSystemϵͳ
 * ģ��ATM��������¹��ܣ� 1. ���������¼������3���Զ��˿� 2. ��� 3. ȡ�� (����ѭ���Ƿ����������n�˿�)4.ע����¼ 5.��ѯ��� 6.�ֶ��˿�
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��3��
 */
public class ATMSystemDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATMSystem as = new ATMSystem();
		
		//��ʼ�����п�����
		System.out.print("���ʼ��������п�����:");
		String pwd = sc.next();
		//�û��˻����
		long accountMoney = 0 ;
		//��ʼΪδ��¼״̬
		boolean isLogin = false;
		
		String answer = null; 
		do{
			as.printMenu();
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("����ӭ����ģ��ATM��ϵͳ>��¼��");
				isLogin = as.login(pwd , sc , isLogin);
				break;
			case 2:
				System.out.println("����ӭ����ģ��ATM��ϵͳ>��");
				accountMoney = as.saveMoney(isLogin,accountMoney,sc);
				break;
			case 3:
				System.out.println("����ӭ����ģ��ATM��ϵͳ>ȡ�");
				accountMoney = as.drawMoney(isLogin,accountMoney,sc);
				break;
			case 4:
				System.out.println("����ӭ����ģ��ATM��ϵͳ>ע����¼��");
				isLogin = as.logOff(sc , isLogin);
				break;
			case 5:
				System.out.println("����ӭ����ģ��ATM��ϵͳ>��ѯ��");
				accountMoney = as.queryMoney(accountMoney,isLogin);
				break;
			case 6:
				System.out.println("����ӭ����ģ��ATM��ϵͳ>�˿� ��");
				as.exitSystem(sc);
				break;
			default:
				System.out.println("��ѡ����ȷ�Ĳ˵�ѡ��!");
				break;
			}
			System.out.print("�Ƿ����(y/n):");
			answer = sc.next();
		}while("y".equals(answer));
		System.out.println("�����˿�,ллʹ�ã�");
		System.exit(1);
		sc.close();
	}
}
