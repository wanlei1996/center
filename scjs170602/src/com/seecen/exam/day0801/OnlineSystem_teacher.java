package com.seecen.exam.day0801;

import java.util.Scanner;
/**
 * С�͵ļ������߽��͸���ϵͳ(��ϵͳ��ע�ᣬ��¼���齱���޸����룬ע����¼������,��ӡ�û���Ϣ�ȹ���)
 * ��ʦ�汾��
 * @author Administrator
 */
public class OnlineSystem_teacher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "y"; // �Ƿ��������
		// ���ݴ洢����
		int size = 5;
		String[] accounts = new String[size];
		String[] passwords = new String[size];
		int[] cards = new int[size];
		boolean[] joinLuck = new boolean[size];// �Ƿ������齱
		int loginIndex = -1; // ��¼�˺ŵ�λ��,-1����δ��¼
		do {
			printMenu();	// ��ӡ�˵�
			int choose = sc.nextInt();
			if(loginIndex < 0 && (choose == 3 || choose == 4 || choose == 5)) {
				System.out.println("���ȵ�¼��");
				continue;
			}
			switch(choose) {
				case 1:
					register(accounts, passwords, cards ,sc);
					break;
				case 2:
					loginIndex = login(accounts, passwords,sc);
					break;
				case 3:
					luckDraw(loginIndex, cards, joinLuck,sc);
					break;
				case 4:
					updatePassword(loginIndex,passwords,sc);
					break;
				case 5:
					loginIndex = logOff(loginIndex, accounts, passwords, cards, joinLuck,sc);
					break;
				case 6:
					printAll(accounts);
					break;
				default:
					break;
			}
			System.out.print("������(y/n):");
			answer = sc.next();
		} while("y".equals(answer));
		System.out.println("\r\nϵͳ�˳���");
	}
	

	public static void printAll(String[] accounts) {
		for (String str : accounts) {
			System.out.print((str == null ? "" : str) + "  ");
		}
		System.out.println();
	}


	public static int logOff(int loginIndex, String[] accounts, String[] passwords, int[] cards, boolean[] joinLuck, Scanner sc) {
		for(int i = loginIndex; i < accounts.length - 1; i++) {
			accounts[i] = accounts[i + 1];
			passwords[i] = passwords[i + 1];
			cards[i] = cards[i + 1];
			joinLuck[i] = joinLuck[i + 1];
		}
		accounts[accounts.length - 1] = null;
		passwords[passwords.length - 1] = null;
		cards[cards.length - 1] = 0;
		joinLuck[joinLuck.length - 1] = false;
		System.out.println("ע���ɹ���");
		return -1;
	}


	public static void updatePassword(int loginIndex, String[] passwords, Scanner sc) {
		while(true) {
			System.out.print("���������룺");
			String password1 = sc.next();
			if(password1.equals("0")) {
				return;
			}
			System.out.print("�ٴ����������룺");
			String password2 = sc.next();
			if(!password1.equals(password2)) {
				System.out.println("������������벻һ�£����������(��0ȡ��)");
			} else {
				passwords[loginIndex] = password1;
				System.out.println("�������޸ĳɹ�");
				break;
			}
		}
		
	}

	public static void luckDraw(int loginIndex,int[] cards,boolean[] joinLuck, Scanner sc) {
		System.out.print("�����Ա�ţ�");
		int inputCard = sc.nextInt();
		while(inputCard != cards[loginIndex]) {
			System.out.print("����Ļ�Ա�Ų���ȷ��������¼�루��0�˳�����");
			inputCard = sc.nextInt();
			if(inputCard == 0) return;
		}
		if(joinLuck[loginIndex]) {
			System.out.println("��ĳ齱�����Ѻľ���");
			return;
		}
		// ��ʼ�齱
		// ����2�����������
		int index1 = 0;
		int index2 = 0;
		while(index1 == index2) {
			index1 = (int)(Math.random() * cards.length);
			index2 = (int)(Math.random() * cards.length);
		}
		String str = cards[index1] == 0 ? "лл����" : cards[index1] + "";
		str += "   " + (cards[index2] == 0 ? "лл����" : cards[index2] + "");
		System.out.println("��������˻�Ա��Ϊ��" + str);
		if(inputCard == cards[index1] || 
				inputCard == cards[index2]) {
			System.out.println("��ϲ�н���");
		} else {
			System.out.println("��Ǹ��û���н�");
		}
		joinLuck[loginIndex] = true;	
	}

	public static int login(String[] accounts, String[] passwords, Scanner sc) {
		System.out.print("�û�����");
		String account = sc.next();
		System.out.print("���룺");
		String password = sc.next();
		int code = (int)(Math.random() * 9000) + 1000;
		System.out.print("������֤��[" + code + "]:" );
		int inputCode = sc.nextInt();
		// �ж���֤���Ƿ�ƥ��
		if(code == inputCode) {
			// ��֤��Ե�����£������û����������Ƿ�ƥ��
			for(int i = 0; i < accounts.length; i++) {
				if(accounts[i] != null && 
						accounts[i].equals(account) && 
						passwords[i].equals(password)) {
					System.out.println("��¼�ɹ���");
					// ƥ�䵽�ͷ��ض�Ӧ�����е�λ��
					return i;
				} 
			}
			// �����ܹ�ִ�е��⣬����û��ƥ����û���������
			System.out.println("�û������������");
		} else {
			System.out.println("��֤�����");
		}
		return -1;
	}

	public static void register(String[] accounts, String[] passwords, int[] cards, Scanner sc) {
		System.out.print("�û�����");
		String account = sc.next();
		System.out.print("���룺");
		String password = sc.next();
		// ����Ƿ����ظ����û���
		boolean isExist = false;
		int i = 0;
		for (; i < accounts.length; i++) {
			// �����ǰλ��Ϊ�գ�������Դ洢
			if(accounts[i] == null) {
				break;
			} else if(accounts[i].equals(account)) {
				isExist = true; // �Ѵ���
				break;
			}
		}
		// ���i�ӵ���length�ĳ��ȣ���������
		if(i == accounts.length) {
			System.out.println("�û��ѱ������ݲ�����ע�ᣡ");
		} else if(isExist) {
			System.out.println("�û����Ѿ����ڣ��������");
		} else {
			accounts[i] = account;
			passwords[i] = password;
			int card = 0;
			// ���ɻ�Ա����
			while(true) {
				card = (int)(Math.random() * 9000) + 1000;
				boolean cardExist = false;
				for(int j = 0; j < i; j++) {
					if(cards[j] == card) {
						cardExist = true;
						/*���ظ��Ŀ�������ȥ��
						��������һ��������������*/
						break;
					}
				}
				/*���Ϊfalse������û���ظ��ģ�
				������ſ����ã��ʽ���ѭ��*/
				if(!cardExist) break;
			}
			cards[i] = card;
			System.out.println("ע��ɹ������Ļ�Ա��ϢΪ��");
			System.out.println(account + "\t" + password + "\t" + card);
		}
	}

	public static void printMenu() {
		System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
		System.out.println("\t1.ע��");
		System.out.println("\t2.��¼");
		System.out.println("\t3.�齱");
		System.out.println("\t4.�޸�����");
		System.out.println("\t5.ע��������");
		System.out.println("\t6.��ӡ�û���Ϣ");
		System.out.println("****************************");
		System.out.print("��ѡ��˵���");
	}
}
