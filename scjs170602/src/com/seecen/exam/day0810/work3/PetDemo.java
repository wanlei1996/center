package com.seecen.exam.day0810.work3;

/**
 * ���Գ�����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��10��
 */
public class PetDemo {

	public static void main(String[] args) {
		Dog dog = new Dog("ŷŷ", "��������Ȯ");
		dog.eat();
		dog.catchingFlyDisc();
		dog.show();

		Penguin penguin = new Penguin("����", "Q��");
		penguin.eat();
		penguin.swim();
		penguin.show();
	}

}
