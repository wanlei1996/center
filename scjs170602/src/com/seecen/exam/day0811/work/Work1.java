package com.seecen.exam.day0811.work;

/**
 * ���ʵ�����1+2-3+4+5-6����-99+100�Ľ��(1684)
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��11��
 */
public class Work1 {
	public static void main(String[] args) {
		int sum = 0;
		int j = 0;
		for (int i = 1; i <= 100; i++) {
//			����3�ı�����,��j��ֵΪ-i,����j��ֵΪi
			if (i % 3 == 0) {
				j = -i;
			} else {
				j = i;
			}
			sum += j;
		}
		System.out.println("���Ϊ:" + sum);
	}

}
