package com.seecen.exam.day0727.work;

import java.util.Scanner;
/**
 * ��Ʊ�������Żݣ�switchǶ�װ�
 *  С��Ҫ���ɻ�ȥ��������Ʊԭ��Ϊ1000
	ϵͳ��ʾ����Ҫ�ɵ��·ݣ�1-12����
	5,6,7,8,9,10Ϊ����
	�����·�Ϊ����
	ϵͳ��ʾ����Ҫ��ͷ�Ȳջ��Ǿ��ò�
	����ͷ�Ȳռ۸�9��
	�������òռ۸�7.5��
	����ͷ�Ȳռ۸�6��
	�������òռ۸�5��
 * @author Administrator
 */
public class updateWork4 {
	public static void main(String[] args) {
		int price = 1000;//��Ʊԭ��1000Ԫ
		double discount = 1.0;//��ʼΪ������
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ�ɵ��·�(1-12):");
		int  month = sc.nextInt();
		System.out.println("������Ҫ��ͷ�Ȳջ��Ǿ��òգ�");
		String str = sc.next();
		switch (month) {
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			switch (str) {
			case "ͷ�Ȳ�":
				discount = 0.9;
				break;
			default:
				discount = 0.75;
				break;
			}
			break;
		default:
			switch (str) {
			case "ͷ�Ȳ�":
				discount = 0.6;
				break;
			default:
				discount = 0.5;
				break;
			}
			break;
		}
		System.out.println("��Ʊ��ϢΪ��"+month+"�µ�"+str);
		System.out.println("����ۺ���ܽ��Ϊ��"+ price * discount);
		sc.close();
	}
}
