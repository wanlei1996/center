package com.seecen.exam.day0808;

/**
 * ��ʵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��8��
 */
public class Dog extends Pet {
	private String type;// ����

	public Dog() {
		super();
	}

	public Dog(String name, int healthy, int lover) {
		super(name, healthy, lover);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * ������̵ķ���(�Լ��ķ���)
	 */
	public void catchFlyDisc() {
		this.setHealthy(this.getHealthy() - 10);
		this.setLover(this.getLover() + 5);
		System.out.println(getName() + "�������Ϸ!");
	}

	/**
	 * ���԰׷���(��д����ĳ��󷽷�)
	 */
	@Override
	public void show() {
		System.out.println("�ҵ����ֽ�:\"" + this.getName() + "\",�ҵĽ���ֵ��:"
				+ this.getHealthy() + ",�Һ������˵����̶ܳ���:" + this.getLover()
				+ ",�ҵ�������:" + this.getType());
	}

	/**
	 * ��ȥҽԺ����(��д����ĳ��󷽷�)
	 */
	@Override
	public void toHospital() {
		this.setHealthy(this.getHealthy() + 10);
		System.out.println(getName() + "����,��ҩ!");
	}

	/**
	 * ���Է�����(��д����ĳ��󷽷�)
	 */
	@Override
	public void eat() {
		System.out.println(getName() + "���ó��Ź�!");
	}
}
