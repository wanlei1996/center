package com.seecen.exam.day0810.work2;

/**
 * �����̵���
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��10��
 */
public class Store {
	/**
	 * �û�������
	 * 
	 * @param type
	 *            �û�ѡ�������
	 * @return ��������
	 */
	public IAnimal getAnimal(String type) {
		if (type.equalsIgnoreCase("dog")) {
			return new Dog();
		} else if (type.equalsIgnoreCase("pig")) {
			return new Pig();
		} else {
			return new Cat();
		}
	}
}
