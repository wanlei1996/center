package com.seecen.exam.day0809.work;
/**
 * ���Զ���ʵ����
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��9��
 */
public class AnimalDemo {
	/**
	 * ���ݹؼ���instanceof���ж�һ���������͵ľ���Ƿ�Ϊ��������Ƿ���true�����򷵻�false
	 * @param animal ����Animal���
	 */
	public static void judgeType(Animal animal){
		if(animal instanceof Fish){
			Fish fish = (Fish) animal;
			fish.setWeight(6);
			fish.setAge(3);
			fish.setName("����");
		}
		if(animal instanceof Bird){
			Bird bird = (Bird) animal;
			bird.setColor("��");
			bird.setAge(8);
			bird.setName("èͷӥ");
		}
	}
	
	public static void main(String[] args) {
		Animal bird = new Bird("С��",4,"��");
		bird.show();
		
		Animal fish = new Fish("����",2,5);
		fish.show();
		
		System.out.println("--------------");
		
		Animal b = new Bird();
		judgeType(b);
		b.show();

		Animal f = new Fish();
		judgeType(f);
		f.show();
	}
	
}
