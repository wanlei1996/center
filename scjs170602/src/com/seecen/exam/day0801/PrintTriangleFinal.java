package com.seecen.exam.day0801;

import java.util.Scanner;
/**
 * ��ӡ�������ռ���(ʵ�����κͿ�������)
 * @author Administrator
 */
public class PrintTriangleFinal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������������");
		int num = sc.nextInt();
		//���ѭ��һ�δ���һ�У��ڲ�ѭ����ʾһ��Ҫ��ӡ�Ķ���
		for (int i = 1; i <= num; i++) {
			// ����ո���("/t"��ʾһ����λ�ո�," "��ʾһ���ַ��ո�)
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			// ���#
			for (int j = 0; j < (2 * i - 1); j++) {
				System.out.print("#");
			}
			//����
			System.out.println();
		}
		//�������:ֻҪ���ѭ���Ӻ���ǰѭ��,�ڲ�ѭ��һ��
		for (int i = num; i > 0; i--) {
			// ����ո���("/t"��ʾһ����λ�ո�," "��ʾһ���ַ��ո�)
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			// ���#
			for (int j = 0; j < (2 * i - 1); j++) {
				System.out.print("#");
			}
			//����
			System.out.println();
		}
		System.out.println("-----------------------");
		System.out.print("������������");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			// ����ո���("/t"��ʾһ����λ�ո�," "��ʾһ���ַ��ո�)
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			// ���#
			for (int j = 0; j < (2 * i - 1); j++) {
				//�����һ��λ�û�����2 * i - 2��λ�þʹ�ӡ#��������λ�ÿո�
				if (j == 0 || j == (2 * i - 2)) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			//����
			System.out.println();
		}
		for (int i = n; i > 0; i--) {
			// ����ո���("/t"��ʾһ����λ�ո�," "��ʾһ���ַ��ո�)
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			// ���#
			for (int j = 0; j < (2 * i - 1); j++) {
				//�����һ��λ�û�����2 * i - 2��λ�þʹ�ӡ#��������λ�ÿո�
				if (j == 0 || j == (2 * i - 2)) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			//����
			System.out.println();
		}
		sc.close();
	}
}
