package com.seecen.exam.day0807;

import java.util.Scanner;

public class RegisterBizDemo {

	public static void main(String[] args) {
		/*
			Scanner sc = new Scanner(System.in);
			System.out.print("������һ���ַ���:");
			String str = sc.next();
			System.out.print("��������Ҫ�����ַ�:");
			String findStr = sc.next();
			��һ��:
			char[] chars = str.toCharArray();
			int count = 0;
			//�����ַ����飬��Ҫ���ҵ��ַ��Ƚ�
			for (int i = 0; i < chars.length; i++) {
				if(findStr.charAt(0)==chars[i]){
					count++;
				}
			}
			System.out.println("\""+str+"\""+"�а���"+ count+"��"+"\""+findStr+"\"");
			�ڶ���:
			int count = 0;
			int index = str.indexOf(findStr);
			//���Ҳ�����һ��ʱ����ѭ��
			while(index!=-1){
				count++;
				index = str.indexOf(findStr,index+1);
			}
			System.out.println("\""+str+"\""+"�а���"+ count+"��"+"\""+findStr+"\"");
			sc.close();
			System.out.println(------------------------);
			StringBuilder sbd = new StringBuilder("a");
			sbd.append("b");
			sbd.append("c");
			System.out.println(sbd);
			System.out.println(------------------------);
			Scanner sc = new Scanner(System.in);
			System.out.print("������һ������:");
			String nums = sc.next();
			StringBuffer str = new StringBuffer(nums);
			for (int i = str.length() - 3; i > 0; i = i - 3) {
				str.insert(i, ",");
			}
			System.out.println(str);
		 */
		Scanner sc = new Scanner(System.in);
		// �������ݶ���
		Register register = new Register();
		// ����ҵ�������
		RegisterBiz rb = new RegisterBiz();
		System.out.print("���������֤��");
		register.setIdCard(sc.next());
		System.out.print("�������ֻ��ţ�");
		register.setPhone(sc.next());
		System.out.print("�����������ţ�");
		register.setTel(sc.next());
		
		int result = rb.checkInput(register);
		if(result == 1) {
			System.out.println("����ע�ᣡ");
		} else if(result == 2) {
			System.out.println("���֤�������16λ��18λ");
		} else if(result == 3) {
			System.out.println("�ֻ����������11λ");
		} else {
			System.out.println("�����������ű�����4λ���绰���������8λ��");
		}
		sc.close();
	}

}
