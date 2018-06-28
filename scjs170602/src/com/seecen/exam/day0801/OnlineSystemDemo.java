package com.seecen.exam.day0801;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ���Խ��͸���ϵͳ(��������) 
 * С�͵ļ������߽��͸���ϵͳ(��ϵͳ��ע�ᣬ��¼���齱���޸����룬ע����¼������,��ӡ�û���Ϣ�ȹ���)
 * ��������:��ϵͳ������ע�ᣬ�ٽ��е�¼�������ȵ�¼���ٽ��г齱,�����ȵ�¼,�ſ����޸ĸ��û���������
 * �����ȵ�¼������ע����¼���������û��������룬��Ա���Ų����ڵģ�
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��4��
 */
public class OnlineSystemDemo {
	public static void main(String[] args) {
		OnlineSystem os = new OnlineSystem();
		Scanner sc = new Scanner(System.in);
		// �����������������û���,����ͻ�Ա����(��ʱ���ݿ�)
		int dbSize = 100;
		String[] names = new String[dbSize];
		String[] pwds = new String[dbSize];
		int[] idNums = new int[dbSize];
		String answer = null;
		// �û��Ƿ��¼,Ĭ��Ϊδ��¼״̬
		boolean isLogin = false;
		String loginName = "";
		int loginIndex = 0;
		// �����齱����
		boolean isCome = false;
		// ��ǰ�洢λ��
		int index = 0;
		do {
			os.printMenu();
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case 1:
				System.out.println("�����͸���ϵͳ��ע�᡿");
				index = os.register(names, pwds, idNums, index, sc);
				break;
			case 2:
				System.out.println("�����͸���ϵͳ����¼��");
				ArrayList<Object> loginValue = os.login(names, pwds, index,
						isLogin, loginName, loginIndex, sc);
				isLogin = (boolean) loginValue.get(0);
				loginIndex = (int) loginValue.get(1);
				loginName = (String) loginValue.get(2);
				break;
			case 3:
				System.out.println("�����͸���ϵͳ�����˳齱��");
				isCome = os.luckyDraw(idNums, isLogin, loginName, isCome,
						loginIndex, index, sc);
				break;
			case 4:
				System.out.println("�����͸���ϵͳ���޸����롿");
				os.updatePwd(names, pwds, isLogin, loginName, loginIndex, sc);
				break;
			case 5:
				System.out.println("�����͸���ϵͳ��ע����¼��������");
				isLogin = os.logOff(names, pwds, idNums, isLogin, loginName,
						index, sc);
				break;
			case 6:
				System.out.println("�����͸���ϵͳ����ӡ�û���Ϣ��");
				os.printAll(names, pwds, idNums, index);
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
