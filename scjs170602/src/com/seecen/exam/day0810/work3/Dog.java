package com.seecen.exam.day0810.work3;

/**
 * ����,�̳г��������
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��10��
 */
public class Dog extends Pet implements IFlyingDisc,IEat{
	private String strain = "ѩ����";

	public Dog() {
		super();
	}

	public Dog(String name, String strain) {
		super(name);
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	@Override
	public void show() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + getName() + "���ҵĽ���ֵ��"
				+ getHealth() + "���Һ����˵����̶ܳ���" + getLove() + "��");
	}
	@Override
	public void eat() {
		super.setHealth(super.getHealth() + 3);
		System.out.println("����" + super.getName() + "�Ա���������ֵ����3��");
	}
	@Override
	public void catchingFlyDisc() {
		System.out.println("����" + super.getName() + "���ڽӷ��̡�");
		super.setHealth(super.getHealth() - 10);
		super.setLove(super.getLove() + 5);
	}
}
