package com.seecen.exam.day0807;

import com.seecen.exam.day0808.work.Pet;
/**
 * ����ʵ���࣬�븸��Pet�಻��ͬһ����
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��8��
 */
public class Dog extends Pet {

	public Dog() {
		super();
	}

	public Dog(String name, int age, double weight, double speed) {
		super(name, age, weight, speed);
	}

	public static void main(String[] args) {
		// ����͸��಻��ͬһ���У�ֻ�ܵ���protect��public������
		Dog dog1 = new Dog();
		dog1.weight = 53.23;
		dog1.speed = 56.26;
		
		// ����͸��಻��ͬһ���У�ֻ�ܵ���protect��public�ķ���
		Dog dog = new Dog("��ʿ��", 20, 55.2, 50.5);
		dog.look();
		dog.move();
	}
}
