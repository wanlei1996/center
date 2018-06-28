package com.seecen.exam.day0808;

/**
 * ����ʵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��10��
 */
public class Master {
	private String name;
	private int age;

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
	 * ���Ƴ���ķ���
	 * ����ֵС��50������
	 * @param pet
	 *            �������
	 */
	public void Cure(Pet pet) {
		if (pet.getHealthy() < 50) {
			pet.toHospital();
		}
	}

	/**
	 * ι������ķ���
	 * 
	 * @param pet
	 *            �������
	 */
	public void feed(Pet pet) {
		pet.eat();
	}

	/**
	 * �ͳ�����ķ��� 
	 * ���ݴ������ĸ������Pet�ж������ͣ���Dog�͵��ù��ķ���,��Penguin�͵������ķ���
	 * @param pet
	 *            �������
	 */
	public void play(Pet pet) {
		if (pet instanceof Dog) {
			Dog dog = (Dog) pet;
			dog.catchFlyDisc();
		}
		if (pet instanceof Penguin) {
			Penguin penguin = (Penguin) pet;
			penguin.swimming();
		}
	}
}
