package com.seecen.exam.day0729.work;

/**
 * һ������18,25,7,36,13,2,89,63,�ҳ���С��������λ��
 * @author Administrator
 */
public class Work3 {
	public static void main(String[] args) {
		int[] nums = {18,25,7,36,13,2,89,63};
		int min = nums[0];
		int i = 1,j = 0;
		for (; i < nums.length; i++) {
			if(min>=nums[i]){
				min = nums[i];
				j = i;
			}
		}
		System.out.println("��С��Ϊ: " + min +",������λ��Ϊ:��" + (j+1) + "��");
	}
}
