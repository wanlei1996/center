package com.seecen.exam.day0812;

/**
 * ����ʵ����,�̳���ʵ����,ʵ�ָ��׽ӿں�ĸ�׽ӿ�
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��12��
 */
public class Son extends Person implements IEat, IPlay {

	public Son() {
		super();
	}

	public Son(String name, int age) {
		super(name, age);
	}

	public void swim() {
		System.out.println("�һ���Ӿ!");
	}

	@Override
	public void eat() {
		System.out.println(getName() + "�ڳԷ�!");
	}

	@Override
	public void play() {
		System.out.println(getName() + "����!");

	}

	@Override
	public void show() {
		System.out.println("���Ƕ���,�ҵ�������:" + getName() + ",�ҵ�������:" + getAge()
				+ ",�ҵ��Ա���:" + Person.SEX_MEN);

	}

}
