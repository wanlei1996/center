package com.seecen.exam.day0808;

/**
 * ����ʵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��8��
 */
public abstract class Pet {
	private String name;// ����
	private int healthy = 60;// ����ֵ
	private int lover = 20;// ����ֵ

	public Pet() {
		super();
	}

	public Pet(String name, int healthy, int lover) {
		super();
		this.name = name;
		this.healthy = healthy;
		this.lover = lover;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		if (healthy >= 0 && healthy <= 100) {
			this.healthy = healthy;
		} else {
			System.out.println("����ֵӦ����0-100֮�䣬Ĭ��ֵ��60");
		}
	}

	public int getLover() {
		return lover;
	}

	public void setLover(int lover) {
		this.lover = lover;
	}
	/**
	 * �԰׵ĳ��󷽷���������ȥ����ʵ��
	 */
	public abstract void show();
	/**
	 * ȥҽԺ�ĳ��󷽷���������ȥ����ʵ��
	 */
	public abstract void toHospital();
	/**
	 * �Է��ĳ��󷽷���������ȥ����ʵ��
	 */
	public abstract void eat();
}
