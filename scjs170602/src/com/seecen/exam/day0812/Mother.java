package com.seecen.exam.day0812;

/**
 * ĸ��ʵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��12��
 */
public class Mother extends Person {
	
	public Mother() {
		super();
	}

	public Mother(String name, int age) {
		super(name, age);
	}

	@Override
	public void show() {
		System.out.println("��������,�ҵ�������:" + getName() + ",�ҵ�������:" + getAge()
				+ ",�ҵ��Ա���:" + Person.SEX_WOMEN);
	}
}
