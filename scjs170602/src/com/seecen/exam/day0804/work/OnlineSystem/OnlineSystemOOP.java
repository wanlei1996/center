package com.seecen.exam.day0804.work.OnlineSystem;

import java.util.Scanner;

/**
 * С�͵ļ������߽��͸���ϵͳ(��������) (��ϵͳ��ע�ᣬ��¼���齱���޸����룬ע����¼������,��ӡ�û���Ϣ�ȹ���)
 * ��������:��ϵͳ������ע�ᣬ�ٽ��е�¼�������ȵ�¼���ٽ��г齱,�����ȵ�¼,�ſ����޸ĸ��û���������
 * �����ȵ�¼������ע����¼���������û��������룬��Ա���Ų����ڵģ�
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��4��
 */
public class OnlineSystemOOP {
	public static void main(String[] args) {
		double a = 89.5;
		int b = (int)a + 10;
		System.out.println(b);
		Scanner sc = new Scanner(System.in);
		// ����һ����Ա��������
		User[] vips = new User[10];
		// ����Ա�����������VIP���󣬳�ʼ��ʵ��
		for (int i = 0; i < vips.length; i++) {
			vips[i] = new User();
		}
		//����һ��VIPҵ��ʵ������
		UserBiz vb = new UserBiz();

		// ��ʼ����ǰ��¼��Աʵ����,��ʼ״̬Ϊδ��¼״̬
		LoginedUser lv = new LoginedUser();
		lv.setLogin(false);
		lv.setLoginName("");
		lv.setLoginIndex(0);

		// �����齱����
		boolean isCome = false;
		// ��ǰ�洢λ��
		int index = 0;

		String answer = null;
		do {
			System.out.println("******��ӭ���뽱�͸���ϵͳ******");
			System.out.println("\t1.�û�ע��");
			System.out.println("\t2.�û���¼");
			System.out.println("\t3.���˳齱");
			System.out.println("\t4.�޸�����");
			System.out.println("\t5.ע����¼������");
			System.out.println("\t6.��ӡ�û���Ϣ");
			System.out.println("***************************");
			System.out.print("��ѡ��˵�(����):");
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case 1:
				System.out.println("�����͸���ϵͳ��ע�᡿");
				index = vb.register(vips, index, sc);
				break;
			case 2:
				System.out.println("�����͸���ϵͳ����¼��");
				lv = vb.login(vips, index, lv, sc);
				break;
			case 3:
				System.out.println("�����͸���ϵͳ�����˳齱��");
				isCome = vb.luckyDraw(vips, lv, isCome, index, sc);
				break;
			case 4:
				System.out.println("�����͸���ϵͳ���޸����롿");
				vb.updatePwd(vips, lv, sc);
				break;
			case 5:
				System.out.println("�����͸���ϵͳ��ע����¼��������");
				lv = vb.logOff(vips, lv, index, sc);
				break;
			case 6:
				System.out.println("�����͸���ϵͳ����ӡ�û���Ϣ��");
				vb.printAll(vips, index);
				break;
			default:
				System.out.println("��������ȷ�Ĳ˵�ѡ��!");
				break;
			}
			System.out.print("���Ƿ�ص��˵���(y/n):");
			answer = sc.next();
		} while (answer.equals("y"));
		System.out.println("ϵͳ�˳�,ллʹ��!");
		sc.close();
		System.exit(1);
	}
}
