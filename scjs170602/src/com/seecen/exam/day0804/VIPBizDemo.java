package com.seecen.exam.day0804;

import java.util.Scanner;

public class VIPBizDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VIP[] vips = new VIP[5];
		VIPBiz vb = new VIPBiz();
		//��ӡ���л�Ա��Ϣ
		for (int i = 0; i < vips.length; i++) {
			vips[i] = new VIP();
			System.out.print("�����Ա���:");
			vips[i].num = sc.next();
			System.out.print("�����Ա����:");
			vips[i].score = sc.nextInt();
		}
		vb.showAll(vips);
		//���ݻ�Ա��Ų��һ�Ա
		System.out.print("��������Ҫ���ҵĻ�Ա���:");
		String findNum = sc.next();
		if(vb.findByNum(vips, findNum) == null){
			System.out.println("������Ļ�Ա��Ų�����!");
		}else{
			System.out.println("��Ա���Ϊ:" +findNum+"�Ļ�Ա�����Ļ�����:"+vb.findByNum(vips, findNum).score);
		}
		
		sc.close();
	}
}
