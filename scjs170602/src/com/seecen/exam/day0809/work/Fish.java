package com.seecen.exam.day0809.work;

/**
 * ��ʵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��9��
 */
public class Fish extends Animal {
	private int weight;// ����

	public Fish(){
		super();
	}
	public Fish(String name, int age, int weight) {
		super(name, age);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void show() {
		System.out.println("����һֻ" + getWeight() + "���ص�" + getName() + "!");
		System.out.println("����" + getAge() + "����!");

	}

}
