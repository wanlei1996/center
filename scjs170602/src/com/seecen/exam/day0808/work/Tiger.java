package com.seecen.exam.day0808.work;

/**
 * �ϻ�ʵ���࣬����Pet�����࣬��ͬһ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��8��
 */
public class Tiger extends Pet {

	public Tiger() {
		super();
	}

	public Tiger(String name, int age, double weight, double speed) {
		super(name, age, weight, speed);
	}

	public static void main(String[] args) {
		//����͸�����ͬһ���У����Լ̳��������ԣ�������ʹ��private����
		Tiger tiger1 = new Tiger();
		tiger1.age = 23;
		tiger1.weight = 56.12;
		tiger1.speed = 78.63;
		
		//����͸�����ͬһ���У����Լ̳����з����������ܵ���private����
		Tiger tiger = new Tiger("�ϻ�",36,56.45,64.53);
		tiger.show();
		tiger.look();
		tiger.move();
	}

}
