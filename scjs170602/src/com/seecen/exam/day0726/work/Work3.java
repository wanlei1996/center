package com.seecen.exam.day0726.work;

/**
 *  ����2������ num1=10,num2=20. 
	��������Ϊ  num1 = 20   num2 =10
 * @author Administrator
 *
 */
public class Work3 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println("����ǰΪ��"+num1 +"-"+ num2);
		int mid;
		mid = num1;
		num1 = num2;
		num2 = mid;
		System.out.println("������Ϊ��"+num1 +"-"+ num2);
	}
}
