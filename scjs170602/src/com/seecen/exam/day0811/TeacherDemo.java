package com.seecen.exam.day0811;

/**
 * ���Խ�ʦ��
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��11��
 */
public class TeacherDemo {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * ����object���е�==��equals()�������Ǳ��ڴ��ַ��,Ҫʹ==�ȵ�ַ,equals()����������,����һ��Ҫ��д�����equals()������hashCode()����(String�������д��)
		 */
		Teacher t1 = new Teacher("����", "�����", 20);
		Teacher t2 = new Teacher("��", "�����", 20);
		Teacher t3 = new Teacher();
		try {
			t3 = (Teacher) t1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		System.out.println(t3.toString());
		Thread.sleep(3000);
		t3 = null;
		System.gc();
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
