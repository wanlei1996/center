package com.seecen.exam.day0804.work;

import java.util.Scanner;

/**
 * ������
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��4��
 */
public class Work2Array {
	// ������űȽ�������ֵ����Сֵ�Ľ�����飬����ΪstaticΪ�����������ʹ��
	static int[] results = new int[2];

	/**
	 * ����һ�������е����ֵ����Сֵ
	 * 
	 * @param nums
	 *            ����
	 * @return ���ֵ����Сֵ��ŵĽ������(0λ��Ϊ���ֵ,1λ��Ϊ��Сֵ)
	 */
	public static int[] findMinAndMax(int[] nums) {
		// �Ƚ����ֵ����Сֵ��Ϊ�����һ����ֵ��ѭ��������ĵڶ�����ֵ��ʼ
		int min = nums[0];
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		results[0] = max;
		results[1] = min;
		return results;
	}

	/**
	 * ����������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			System.out.print("�������" + (i + 1) + "������:");
			nums[i] = sc.nextInt();
		}
		System.out.println("����������ֵΪ:" + findMinAndMax(nums)[0]);
		System.out.println("���������СֵΪ:" + findMinAndMax(nums)[1]);
		sc.close();
	}
}
