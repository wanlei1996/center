package com.seecen.exam.day0727.work;

import java.util.Scanner;

/**
 * �Żݻ����-switch��
 * @author Administrator
 *
 */
public class Work2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���������ѽ�");
		int price = sc.nextInt();
		int money = 0;
		System.out.println("�Ƿ�μ��Żݻ������");
		System.out.println("1:��50Ԫ����2Ԫ�������¿���1ƿ");
		System.out.println("2:��100Ԫ����3Ԫ����500ML����1ƿ");
		System.out.println("3:��100Ԫ����10Ԫ����5������� ");
		System.out.println("4:��200Ԫ����10Ԫ�ɻ���1���ղ������˹�");
		System.out.println("5:��200Ԫ����20Ԫ����ŷ����ˬ��ˮһƿ");
		System.out.println("0:������");
		System.out.println("��ѡ��");
		int num = sc.nextInt();
		String tip = null;
		switch (num) {
		case 0:
			money = price;
			tip  = "������";
			break;
		case 1:
			if(price>=50){
				money = price + 2;
				tip = "�ɹ����������¿���1ƿ";
			}
			break;
		case 2:
			if(price>=100){
				money = price + 10;
				tip = "�ɹ�������500ML����1ƿ";
			}
			break;
		case 3:
			if(price>=100){
				money = price + 10;
				tip = "�ɹ�������5�������";
			}
			break;
		case 4:
			if(price>=200){
				money = price + 20;
				tip = "�ɹ�������1���ղ������˹�";
			}
			break;
		case 5:
			if(price>=200){
				money = price + 3;
				tip = "�ɹ�������ŷ����ˬ��ˮһƿ";
			}
			break;
		default:
			money = price;
			tip  = "�����㻻��������";
			break;
		}
		System.out.println("���������ܽ�" + money);
		System.out.println(tip);
		sc.close();
	}
}
