package com.seecen.exam.day0729;

import java.util.Arrays;
import java.util.Scanner;
/**
 * ����Ľ��ܼ�ʹ��
 * @author Administrator
 */
public class TestArray {
	public static void main(String[] args) {
		 /*
		   	1)��һ�ִ�������ķ���
			int[] nums = new int[3];
			nums[0] = 1 ;
			nums[1] = 2 ;
			nums[2] = 3 ;
			2)�ڶ��д�������ķ�������Ҫ�����������һ��ʹ�ã����򱨴�50����Ӷ��Ų�Ӱ�����鳤��
			int[] nums2 = {10,20,30,40,50};
			3)�����ִ�������ķ��������������治�ܼӳ���
			int[] nums3 = new int[]{10,20,30,40,50,60};
			nums3 = new int[]{1,2,3,4,5};//�����¸������鸳ֵ
			1)���5λͬѧ�ĳɼ��������ֺܷ�ƽ����
			Scanner sc = new Scanner(System.in);
			int[] scores = new int[5];
			double sum = 0;
			for (int i = 0; i < scores.length; i++) {
				System.out.print("�������"+(i+1)+"ͬѧ�ĳɼ�:");
				scores[i] = sc.nextInt();
				sum += scores[i];
			}
			System.out.println("�ܷ�Ϊ:"+ sum);
			System.out.println("ƽ����Ϊ:" + sum / scores.length);
			2)����һ�����֣��������в��ң��ҵ�����������ֵ������û���ҵ�
			Scanner sc = new Scanner(System.in);
			int[] nums = { 8, 4, 2, 1, 23, 344, 12 };
			System.out.println("��������Ҫ���ҵ�����:");
			int num = sc.nextInt();
			boolean flag = true;
			for (int i = 0; i < nums.length; i++) {
				if (num == nums[i]) {
					flag = false;
					System.out.print("����" + num + "�ڸ�����ĵ�" + (i + 1) + "��λ��");
					break;
				}
			}
			// ��flag��Ϊtrueʱ����˵���ҵ������֣���֮
			if (flag) {
				System.out.println("�Բ���û���ҵ������֣��������������!");
			}
			3)�������ѽ����������У������������ӡ����
			Scanner sc = new Scanner(System.in);
			double[] prices = new double[5];
			for (int i = 0; i < prices.length; i++) {
				System.out.print("�������" + (i + 1) + "�����ѵĽ��:");
				// ��ÿ�����ѵĽ�����������
				prices[i] = sc.nextDouble();
			}
			System.out.println("���\t���(Ԫ)");
			// ��������ȡ�������
			for (int i = 0; i < prices.length; i++) {
				System.out.println((i + 1) + "\t" + prices[i]);
			}
			4)����һ���ַ����飬����������򼰽������
			char[] charNums = {'a','c','u','b','e','p','f','z'};
			System.out.print("ԭ�ַ�����:");
			for (int i = 0; i < charNums.length; i++) {
				System.out.print(charNums[i]+" ");
			}
			//�������򣬿��Խ���Arrays�������е�sort������������
			Arrays.sort(charNums);
			System.out.println("");
			System.out.print("���������:");
			for (int i = 0; i < charNums.length; i++) {
				System.out.print(charNums[i]+" ");
			}
			System.out.println("");
			System.out.print("���������:");
			for (int i = charNums.length - 1; i >=0; i--) {
				System.out.print(charNums[i]+" ");
			}
			5)����n�ҵ�ļ۸񣬽�������ͼ۸����߼۸�Ĵ�ӡ����
			Scanner sc = new Scanner(System.in);
			System.out.print("�������ļ���:");
			int num = sc.nextInt();
			int[] prices = new int[num];
			for (int i = 0; i < prices.length; i++) {
				System.out.print("��"+(i+1)+"�ҵ�ļ۸�:");
				prices[i] = sc.nextInt();
			}
			Arrays.sort(prices);//��������
			System.out.println("��ͼ۸���:" + prices[0]);
			System.out.println("��߼۸���:" + prices[prices.length-1]);
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�������ļ���:");
		int num = sc.nextInt();
		int[] prices = new int[num];
		for (int i = 0; i < prices.length; i++) {
			System.out.print("��"+(i+1)+"�ҵ�ļ۸�:");
			prices[i] = sc.nextInt();
		}
		Arrays.sort(prices);//��������
		System.out.println("��ͼ۸���:" + prices[0]);
		System.out.println("��߼۸���:" + prices[prices.length-1]);
		sc.close();
	}
}
