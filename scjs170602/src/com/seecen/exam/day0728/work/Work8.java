package com.seecen.exam.day0728.work;

import java.util.Scanner;
/**
 * ��������������ʾ��Ӧ��Ӣ�����ڵ�����
 * @author Administrator
 */
public class Work8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true){
			System.out.print("������һ������1-7(����0����):");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("������\t Monday");
				break;
			case 2:
				System.out.println("������\t Tuesday");
				break;
			case 3:
				System.out.println("������\t Wednesday");
				break;
			case 4:
				System.out.println("������\t Thurday");
				break;
			case 5:
				System.out.println("������\t Friday");
				break;
			case 6:
				System.out.println("������\t Saturday");
				break;
			case 7:
				System.out.println("������\t Sunday");
				break;
			default:
				break;
			}
			if(num == 0){
				System.out.println("���������");
				break;
			}
		}
		sc.close();
	}
}
