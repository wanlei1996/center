package com.seecen.exam.day0810.work3;

/**
 * �����,�̳г��������
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��10��
 */
public class Penguin extends Pet implements IEat, ISwimming {
	private String sex = "Q��";

	public Penguin() {
		super();
	}

	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void show() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + getName() + "���ҵĽ���ֵ��"
				+ getHealth() + "���Һ����˵����̶ܳ���" + getLove() + ",�ҵ��Ա���" + getSex()
				+ "��");
	}

	@Override
	public void eat() {
		super.setHealth(super.getHealth() + 5);
		System.out.println("���" + super.getName() + "�Ա���������ֵ����5��");
	}

	@Override
	public void swim() {
		System.out.println("���" + super.getName() + "������Ӿ��");
		super.setHealth(super.getHealth() - 10);
		super.setLove(super.getLove() + 5);
	}
}
