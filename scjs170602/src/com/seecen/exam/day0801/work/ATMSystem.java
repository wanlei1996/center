package com.seecen.exam.day0801.work;

import java.util.Scanner;

/**
 * 	1. ģ��ATM��������¹��ܣ�
    1. ���������¼������3���Զ��˿�
    2. ���
    3. ȡ��
	����ѭ���Ƿ����������n�˿�
 * @author Administrator
 */
public class ATMSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ʼ��������п�����:");
		String pwd = sc.next();
		int count = 3 ;//3������������
		long accountMoney = 0 ;//�û��˻����
		boolean isLogin = false;//��ʼΪδ��¼״̬
		String answer = null; 
		do{
			System.out.println("*****��ӭ����ģ��ATM��ϵͳ*****");
			System.out.println("\t1.��¼");
			System.out.println("\t2.���");
			System.out.println("\t3.ȡ��");
			System.out.println("\t4.ע����¼");
			System.out.println("\t5.��ѯ���");
			System.out.println("\t6.�˿�");
			System.out.println("****************************");
			System.out.print("��ѡ��˵���");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("����ӭ����ģ��ATM��ϵͳ>��¼��");
				while(true){
					boolean pwdCheck = true ;
					System.out.print("���������п�����(6λ����):");
					String pwdInput = sc.next();
					//�ж����볤�ȱ���Ϊ6λ
					if (pwdInput.length() != 6) {
						pwdCheck = false ;
					}
					//�ж��������Ϊ����(0~9)
					for (int i = 0; i <= pwdInput.length()-1; i++) {
						if (!(pwdInput.charAt(i) >= '0' && pwdInput.charAt(i) <= '9')) {
							pwdCheck = false ;
							break;
						}
					}
					if(pwdCheck){
						if(!pwdInput.equals(pwd)){
							System.out.println("����������п����벻��ȷ!");
							count--;
							if(count == 0){
								System.out.println("�����˿�,ллʹ�ã�");
								System.exit(1);
							}else{
								System.out.println("�㻹��" + count + "�λ��ᣡ");
							}
						}else{
							System.out.println("��¼�ɹ�!");
							isLogin = true;
							break;
						}
					}else{
						System.out.println("���п��������Ϊ6λ����!");
					}
				}
				break;
			case 2:
				System.out.println("����ӭ����ģ��ATM��ϵͳ>��");
				if(isLogin){
					while(true){
						System.out.print("����������:");
						int saveMoney = sc.nextInt();
						if(saveMoney % 50 != 0 && saveMoney > 0){
							System.out.println("�������Ǵ���0����50�ı���!");
						}else{
							accountMoney += saveMoney ;
							System.out.println("���Ե�,���ڴ�Ǯ!");
							break;
						}
					}
					System.out.println("��Ǯ�ɹ�,�����˻����Ϊ:" + accountMoney);
				}else{
					System.out.println("�㻹û��¼����ȥ��¼!");
				}
				break;
			case 3:
				System.out.println("����ӭ����ģ��ATM��ϵͳ>ȡ�");
				if(isLogin){
					if(accountMoney == 0){
						System.out.println("���˻����Ϊ:0,��ȥ���Ǯ�ɣ�");
					}else{
						while(true){
							System.out.print("������ȡ����:");
							int drawMoney = sc.nextInt();
							if(drawMoney % 50 != 0 && drawMoney > 0){
								System.out.println("�������Ǵ���0����50�ı���!");
							}else if(drawMoney>accountMoney){
								System.out.println("�Բ��������˻���û����ô��Ǯ!");
							}else{
								accountMoney -= drawMoney;
								System.out.println("���Ե�,����ȡǮ!");
								break;
							}
						}
						System.out.println("ȡǮ�ɹ�,�����˻����Ϊ:" + accountMoney);
					}
				}else{
					System.out.println("�㻹û��¼����ȥ��¼!");
				}
				break;
			case 4:
				System.out.println("����ӭ����ģ��ATM��ϵͳ>ע����¼��");
				if(isLogin){
					System.out.print("��ȷ��ע����¼(y/n):");
					String cancelLogin = sc.next();
					if(cancelLogin.equals("y")){
						isLogin = false ;
						System.out.println("ע���ɹ���");
					}else{
						System.out.println("���Ѿ�ȡ��ע����!");
					}
				}else{
					System.out.println("�㻹û��¼����ȥ��¼!");
				}
				break;
			case 5:
				System.out.println("����ӭ����ģ��ATM��ϵͳ>��ѯ��");
				if(isLogin){
					System.out.println("�����˻����Ϊ:" + accountMoney);
				}else{
					System.out.println("�㻹û��¼����ȥ��¼!");
				}
				break;
			case 6:
				System.out.println("����ӭ����ģ��ATM��ϵͳ>ע����¼�˿� ��");
				System.out.print("��ȷ���˿�(y/n):");
				String isOut = sc.next();
				if(isOut.equals("y")){
					System.out.println("�����˿�,ллʹ�ã�");
					System.exit(1);
				}
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
