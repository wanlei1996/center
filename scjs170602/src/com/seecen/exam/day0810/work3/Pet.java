package com.seecen.exam.day0810.work3;

/**
 * ���������
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��10��
 */
public abstract class Pet {
	private String name = "������";// �ǳ�
	private int health = 100;// ����ֵ
	private int love = 20;// ���ܶ�

	public Pet() {
		super();
	}

	public Pet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public abstract void show();
}
