package com.seecen.exam.day0807;

import com.seecen.exam.day0808.work.Pet;
/**
 * ��ʵ����,��Petʵ���಻��ͬһ����
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��8��
 */
public class Pig {

	public static void main(String[] args) {
		//����ͬһ���У�ֻ�ܷ���public����
		Pet pet1 = new Pet();
		pet1.speed = 10.25;
		
		//����ͬһ���У�ֻ�ܷ���public����
		Pet pet = new Pet("ĸ��",26,100.25,10.23);
		pet.move();
	}

}
