package com.seecen.exam.day0803.work;

import java.util.Scanner;

/**
 * ATMSystemģ��ATM��ϵͳ��(�����߸�����,6���˵�ѡ��)
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��3��
 */
public class ATMSystem {
	/**
	 * ��ӡģ��ATM��ϵͳ�Ĳ˵�
	 */
	public void printMenu(){
		System.out.println("*****��ӭ����ģ��ATM��ϵͳ*****");
		System.out.println("\t1.��¼");
		System.out.println("\t2.���");
		System.out.println("\t3.ȡ��");
		System.out.println("\t4.ע����¼");
		System.out.println("\t5.��ѯ���");
		System.out.println("\t6.�˿�");
		System.out.println("****************************");
		System.out.print("��ѡ��˵���");
	}
	/**
	 * �û���¼
	 * @param pwd ���п���ʼ����
	 * @param sc  ����̨������
	 * @param isLogin ��¼״̬
	 * @return ��¼״̬(�Ƿ��¼),true��ʾ�ѵ�¼,false��ʾδ��¼
	 */
	public boolean login(String pwd, Scanner sc,boolean isLogin){
		while(true){
			//3������������
			int count = 3 ;
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
		return isLogin;
	}
	/**
	 * �û����(�����ȵ�¼)
	 * @param isLogin ��¼״̬
	 * @param accountMoney �˻����
	 * @param sc ����̨������
	 * @return �˻����
	 */
	public long saveMoney(boolean isLogin, long accountMoney, Scanner sc){
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
		return accountMoney;
	}
	/**
	 * �û�ȡ��(�����ȵ�¼)
	 * @param isLogin ��¼״̬
	 * @param accountMoney �˻����
	 * @param sc ����̨������
	 * @return �˻����
	 */
	public long drawMoney(boolean isLogin, long accountMoney, Scanner sc){
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
		return accountMoney;
	}
	/**
	 * ע����¼
	 * @param sc ����̨������
	 * @param isLogin ��¼״̬
	 * @return ��¼״̬(�Ƿ��¼),true��ʾ�ѵ�¼,false��ʾδ��¼
	 */
	public boolean logOff(Scanner sc, boolean isLogin){
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
		return isLogin;
	}
	/**
	 * ��ѯ�˻����
	 * @param accountMoney �˻����
	 * @param isLogin ��¼״̬
	 * @return �˻����
	 */
	public long queryMoney(long accountMoney, boolean isLogin){
		if(isLogin){
			System.out.println("�����˻����Ϊ:" + accountMoney);
		}else{
			System.out.println("�㻹û��¼����ȥ��¼!");
		}
		return accountMoney;
	}
	/**
	 * �ֶ��˿�
	 * @param sc
	 */
	public void exitSystem(Scanner sc){
		System.out.print("��ȷ���˿�(y/n):");
		String isOut = sc.next();
		if(isOut.equals("y")){
			System.out.println("�����˿�,ллʹ�ã�");
			System.exit(1);
		}
	}
}
