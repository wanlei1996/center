package com.seecen.exam.day0808;

import java.util.Scanner;

public class MasterDemo {

	public static void main(String[] args) {
		Master m = new Master();

		Pet pet1 = new Dog("����", 30, 10);
		m.Cure(pet1);
		System.out.println(pet1.getName() + "���ƺ�Ľ���ֵΪ:" + pet1.getHealthy());
		m.feed(pet1);
		Pet pet2 = new Penguin("Q��", 40, 20);
		m.Cure(pet2);
		System.out.println(pet2.getName() + "���ƺ�Ľ���ֵΪ:" + pet2.getHealthy());
		m.feed(pet2);
		System.out.println("----------------");
		Pet pet3 = new Dog("С��", 60, 30);
		m.play(pet3);
		System.out.println(pet3.getName() + "����֮�������ֵΪ:" + "����ֵ:"
				+ pet3.getHealthy() + ",���ܶ�:" + pet3.getLover());
		Pet pet4 = new Penguin("Q��", 70, 10);
		m.play(pet4);
		System.out.println(pet4.getName() + "����֮�������ֵΪ:" + "����ֵ:"
				+ pet4.getHealthy() + ",���ܶ�:" + pet4.getLover());

		Scanner sc = new Scanner(System.in);
		System.out.println("******��ӭ���������*********");
		System.out.print("������Ҫ�����ĳ�������:");
		String name = sc.next();
		System.out.print("��ѡ��Ҫ�����ĳ�������(1.����  2.���):");
		int num = sc.nextInt();
		if (num == 1) {
			// ����
			Dog dog = new Dog();
			dog.setName(name);
			System.out.print("�����빷����Ʒ��(1.��������������Ȯ 2.����ѩ����):");
			if (sc.nextInt() == 1) {
				dog.setType("��������������Ȯ");
			} else {
				dog.setType("����ѩ����");
			}
			System.out.print("�����빷���Ľ���ֵ(1-100֮��):");
			int health = sc.nextInt();
			dog.setHealthy(health);
			System.out.println("�������԰�:");
			dog.show();
		} else {
			// ���
			Penguin pen = new Penguin();
			pen.setName(name);
			System.out.print("����������Ʒ��(1.Q�� 2.Q��):");
			if (sc.nextInt() == 1) {
				pen.setSex(pen.SEX_MEN);
			} else {
				pen.setSex(pen.SEX_FEMAL);
			}
			System.out.print("���������Ľ���ֵ(1-100֮��):");
			int health = sc.nextInt();
			pen.setHealthy(health);
			System.out.println("��������չʾ:");
			pen.show();
		}
		sc.close();
	}

}
