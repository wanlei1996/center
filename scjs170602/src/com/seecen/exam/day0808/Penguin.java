package com.seecen.exam.day0808;

/**
 * ���ʵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��8��
 */
public class Penguin extends Pet {
	final String SEX_MEN = "��";
	final String SEX_FEMAL = "��";
	private String sex;// �Ա�

	public Penguin() {
		super();
	}

	public Penguin(String name, int healthy, int lover) {
		super(name, healthy, lover);
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * �����Ӿ����(�Լ��ķ���)
	 */
	public void swimming() {
		this.setHealthy(this.getHealthy() - 5);
		this.setLover(this.getLover() + 8);
		System.out.println(getName() + "����Ӿ��Ϸ!");
	}

	/**
	 * ����԰׷���(��д����ĳ��󷽷�)
	 */
	@Override
	public void show() {
		System.out.println("�ҵ����ֽ�:\"" + this.getName() + "\",�ҵĽ���ֵ��:"
				+ this.getHealthy() + ",�Һ������˵����̶ܳ���:" + this.getLover()
				+ ",�ҵ��Ա���:" + this.getSex());
	}

	/**
	 * ���ȥҽԺ����(��д����ĳ��󷽷�)
	 */
	@Override
	public void toHospital() {
		this.setHealthy(this.getHealthy() + 20);
		System.out.println(getName() + "��ҩ,����!");
	}

	/**
	 * ���Է�����(��д����ĳ��󷽷�)
	 */
	@Override
	public void eat() {
		System.out.println(getName() + "ϲ���Դ��׷�!");
	}
}
