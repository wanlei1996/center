package com.seecen.exam.day0808.work;
/**
 * ���ʵ���࣬���̳�Petʵ���࣬���Ƿ���ͬһ����
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��8��
 */
public class Penguin {

	public static void main(String[] args) {
		//��ͬһ���У��ܷ���public����,protect����,Ĭ��friendly����
		Pet pet1 = new Pet();
		pet1.age = 25;
		pet1.weight = 32.23;
		pet1.speed = 32.12;
		
		
		//��ͬһ���У��ܷ���public����,protect����,Ĭ��friendly����
		Pet pet = new Pet("Q��",15,10.25,32.23);
		pet.show();
		pet.look();
		pet.move();
	}

}
