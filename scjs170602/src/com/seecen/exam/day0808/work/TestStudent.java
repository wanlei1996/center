package com.seecen.exam.day0808.work;

import java.util.Scanner;

/**
 * ����studentʵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��8��
 */
public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.print("��¼��ѧ������:");
		String nameInput = sc.next();
		s.setName(nameInput);
		System.out.print("��¼��ѧ������:");
		int ageInput = sc.nextInt();
		s.setAge(ageInput);
		System.out.print("��¼��ѧ���Ա�:");
		String sexInput = sc.next();
		s.setSex(sexInput);
		s.setPro(Student.MAJOR_COMPUTER);
		System.out.println("�������Ϣ����:");
		s.show();
		System.out.println("---------------------------------------------");
		Student s1 = new Student("����", 20, "��", Student.MAJOR_ENGINEER);
		Student s2 = new Student("С��", 18, "Ů", Student.MAJOR_SALES);
		System.out.println("����show�������ص���Ϣ����:");
		s1.show(3);
		s2.show(true);
		sc.close();
	}

}
