package com.seecen.exam.day0812;

/**
 * ��ʵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��12��
 */
public abstract class Person {
	/**
	 * �Ա���
	 */
	public static final String SEX_MEN = "��";
	/**
	 * �Ա�Ů
	 */
	public static final String SEX_WOMEN = "Ů";
	
	private String name;//����
	private int age;//����

	public Person(){
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * �԰׵ĳ��󷽷�
	 */
	public abstract void show();
}
