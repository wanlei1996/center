package com.seecen.exam.day0802;

/**
 * �������Admin���󣬿���ʹ�ö����������ʵ����
 * @author Administrator
 *
 */
public class AdminDemo {
	public static void main(String[] args) {
			//������һ����������
			Admin[] admins = new Admin[3];
			for (int i = 0; i < admins.length; i++) {
				//ѭ������������ʵ����
				admins[i] = new Admin();
				admins[i].name  = "admin"+ (i+1);
				admins[i].pwd  = "1"+ (i+1);
				admins[i].show();
			}
	}
}
