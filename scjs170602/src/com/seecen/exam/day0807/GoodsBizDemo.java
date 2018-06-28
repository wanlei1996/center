package com.seecen.exam.day0807;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * ������Ʒҵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��7��
 */
public class GoodsBizDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GoodsBiz gb = new GoodsBiz();
		UserBiz ub = new UserBiz();
		
		// ����һ���û��������鲢�����вεĹ��췽�����г�ʼ��(ģ�����ݿ�)
		User[] users = {new User("wanlei","123456"),new User("admin","admin"),new User("xiaole","123"),
				new User("ok","ok")};
		// ����һ����Ʒ�������鲢�����вεĹ��췽�����г�ʼ��(ģ�����ݿ�)
		Goods[] gds = {new Goods(1,"�����",124.23),new Goods(2,"ϴ�»�",4500.0),new Goods(3,"���ӻ�",8800.9),
				new Goods(4,"����",5000.88),new Goods(5,"�յ���",4456.0),new Goods(6,"ɨ�ػ�",1256.56)};
		
		System.out.print("�������û���:");
		String name = sc.next();
		System.out.print("����������:");
		String pwd = sc.next();
		boolean isLogin = ub.login(users, name, pwd);
		if (isLogin) {
			System.out.println("��ӭ"+name+",��¼�ɹ�!");
			System.out.println("********��ӭ������Ʒ������***********");
			gb.showAll(gds);
			System.out.println("*********************************");
			System.out.print("��������Ҫ��������Ʒ���:");
			int index = sc.nextInt();
			System.out.print("����������������:");
			int num = sc.nextInt();
			double sumPrice = gb.buyGoods(gds, index, num);
			DecimalFormat df = new DecimalFormat("#,###.####");
			System.out.println("����Ҫ����:" + df.format(sumPrice));
		} else {
			System.out.println("��¼ʧ��!");
		}
		sc.close();
	}
}
