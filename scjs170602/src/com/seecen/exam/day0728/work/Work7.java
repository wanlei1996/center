package com.seecen.exam.day0728.work;

import java.util.Scanner;
/**
 * ���һ�������е����ֵ����Сֵ
 * @author Administrator
 */
public class Work7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0,max = 0,min = 0;
		do{
			System.out.print("������һ������(����0����):");
			num = sc.nextInt();
			if(num>max){
				max=num;
			}
			if(num>0){
				//������һ��ֵ��ǰ��һ��ֵ������Сֵ�Ƚ�
				if(num<min||min==0){
					min=num;
				}
			}
		}while(num!=0);		
		System.out.print("���ֵΪ:" + max +"\t��СֵΪ:" + min);
		sc.close();
	}
}
