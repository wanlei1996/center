package com.seecen.exam.day0812;

/**
 * ����ʵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��12��
 */
public class Father extends Person {

	public Father() {
		super();
	}

	public Father(String name, int age) {
		super(name, age);
	}

	@Override
	public void show() {
		System.out.println("���ǰְ�,�ҵ�������:" + getName() + ",�ҵ�������:" + getAge()
				+ ",�ҵ��Ա���:" + Person.SEX_MEN);
	}

}
