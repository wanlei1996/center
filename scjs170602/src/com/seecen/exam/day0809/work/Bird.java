package com.seecen.exam.day0809.work;

/**
 * ��ʵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��9��
 */
public class Bird extends Animal {
	private String color;// ��ɫ

	public Bird(){
		super();
	}

	public Bird(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		System.out.println("����һֻ" + getColor() + "ɫ��" + getName() + "!");
		System.out.println("����" + getAge() + "����!");
	}

}
