package com.seecen.exam.day0727.work;

import java.util.Scanner;
/**
 * �������ع������ϵͳ-if...else��
 * @author Administrator
 */
public class updateWork1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("1.��¼ϵͳ");
		System.out.println("2.�˳�ϵͳ");
		System.out.println("��ѡ���������֣�");
		int menu1 = sc.nextInt();
		if(menu1 == 1){
			System.out.println("1.�ͻ���Ϣ����");
			System.out.println("2.�������");
			System.out.println("3.�������");
			System.out.println("4.ע����¼");
			System.out.println("��ѡ���������֣�");
			int menu2 = sc.nextInt();
			if(menu2==1){
				System.out.println("�������ϵͳ>�ͻ���Ϣ����");
				System.out.println("1.�����ʾ���пͻ�");
				System.out.println("2.��ӿͻ���Ϣ");
				System.out.println("3.�޸Ŀͻ���Ϣ");
				System.out.println("4.��ѯ�ͻ���Ϣ");
			}else if(menu2==2){
				System.out.println("�������ϵͳ>�������");
				System.out.println("1.�����ܽ��");
				System.out.println("2.�����嵥");
			}else if(menu2==3){
				System.out.println("�������ϵͳ>�������");
				System.out.println("1.���˴����");
				System.out.println("2.���˳齱");
				System.out.println("3.�����ʺ�");
			}else if(menu2==4){
				System.out.println("�������ϵͳ>ע����¼");
				System.out.println("���Ѿ�ע����¼��");
			}
		}else{
			System.out.println("�˳�ϵͳ��");
			System.exit(1);
		}
		sc.close();
	}
}
