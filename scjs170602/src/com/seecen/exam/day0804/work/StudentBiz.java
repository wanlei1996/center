package com.seecen.exam.day0804.work;

/**
 * ѧ��ҵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��4��
 */
public class StudentBiz {
	/**
	 * ����ѧ�����������������ߵ�ͬѧ
	 * 
	 * @param stus
	 *            ѧ����������
	 * @return �ҵ��˾ͷ���������ͬѧ�����������
	 */
	public int findMaxHeight(Student[] stus) {
		// �Ƚ����ֵ��Ϊ��һ��ѧ�������
		float max = stus[0].getHeight();
		int index = 0;
		//ѭ��Ӧ�ӵڶ���ѧ����ʼ
		for (int i = 1; i < stus.length; i++) {
			if (stus[i].getHeight() > max) {
				max = stus[i].getHeight();
				//����������ͬѧ������
				index = i;
			}
		}
		return index;
	}

	/**
	 * ����ѧ��������
	 * 
	 * @param stus
	 *            ѧ����������
	 * @param name
	 *            ѧ����
	 * @return �ҵ�����ѧ�����ڵ�����ֵ�����򷵻�-1
	 */
	public int findByName(Student[] stus, String name) {
		for (int i = 0; i < stus.length; i++) {
			if (name.equals(stus[i].getName())) {
				return i;
			}
		}
		return -1;
	}
}
