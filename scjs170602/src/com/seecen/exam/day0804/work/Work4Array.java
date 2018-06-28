package com.seecen.exam.day0804.work;

import java.util.Scanner;

/**
 * ������
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��4��
 */
public class Work4Array {
	/**
	 * ��ָ�������飬ָ����λ���ϲ���ָ��������
	 * 
	 * @param nums
	 *            ����
	 * @param index
	 *            �����λ��
	 * @param data
	 *            ���������
	 * @return ����һ�����������ݵ�������
	 */
	public static int[] insertData(int[] nums, int index, int data) {
		// ����������Ҫ�����λ��index֮�������ȫ��������һ��λ��,�Ӻ��濪ʼ��
		for (int i = nums.length - 1; i > index; i--) {
			nums[i] = nums[i - 1];
		}
		// ��������
		nums[index] = data;
		return nums;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = { 25, 36, 89, 56, 75, 0, 0, 0, 0, 0 };
		System.out.println("����ǰ������Ϊ:");
		for (int i : nums) {
			System.out.print(i + "  ");
		}
		System.out.println();
		System.out.print("��������Ҫ�����λ��:");
		int indexNum = sc.nextInt();
		System.out.print("��������Ҫ���������:");
		int dataNum = sc.nextInt();

		int[] newNums = insertData(nums, indexNum, dataNum);
		System.out.println("����������Ϊ:");
		for (int i : newNums) {
			System.out.print(i + "  ");
		}
		sc.close();
	}
}
