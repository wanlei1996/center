package com.seecen.exam.day0804;

public class StudentBiz {
	/**
	 * ����ѧ����ƽ���߶�
	 * 
	 * @param stus
	 *            student��������
	 * @return ƽ���߶�
	 */
	public float getAvgHeight(Student[] stus) {
		float sum = 0;
		//�������ѧ������(Ϊ0������)
		int count = 0;
		for (int i = 0 ; i < stus.length; i++) {
			if (stus[i].height != 0) {
				sum += stus[i].height;
				count++;
			}
		}
		return sum / count;
	}
}
