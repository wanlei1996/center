package com.seecen.exam.day0810.work2;

/**
 * ���Զ����̵���
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��10��
 */
public class StoreDemo {

	public static void main(String[] args) {
		Store s = new Store();
		s.getAnimal("dog").shout();
		s.getAnimal("pig").shout();
		s.getAnimal("cat").shout();
	}

}
