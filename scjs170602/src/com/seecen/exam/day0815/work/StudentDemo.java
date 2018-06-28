package com.seecen.exam.day0815.work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.junit.Test;

/**
 * ����ѧ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��15��
 */
public class StudentDemo {
	@Test
	public void testStudent(){
		Scanner sc = new Scanner(System.in);
		List<Student> stuList = new ArrayList<Student>();
		Map<String, Student> stuMap = new HashMap<String, Student>();
		String answer = null;
		do {
			System.out.println("**********************************");
			System.out.println("\t1.���ѧԱ");
			System.out.println("\t2.����ѧԱ");
			System.out.println("**********************************");
			System.out.print("��ѡ��,��������:");
			int num = sc.nextInt();
			if (num == 1) {
				// ���ѧԱ
				System.out.print("������ѧԱ����:");
				String nameInput = sc.next();
				System.out.print("������ѧԱ����:");
				int ageInput = sc.nextInt();
				stuList.add(new Student(nameInput, ageInput));
				stuMap.put(nameInput, new Student(nameInput, ageInput));
				System.out.println("ѧԱ�б�����:");
				System.out.println("���\t����\t����");
				for (int i = 0; i < stuList.size(); i++) {
					System.out.println((i + 1) + "\t"
							+ stuList.get(i).getName() + "\t"
							+ stuList.get(i).getAge());
				}
			} else if (num == 2) {
				// ����ѧԱ
				StudentDemo sd = new StudentDemo();
				System.out.print("��������Ҫ���ҵ�ѧԱ����:");
				String findName = sc.next();
				Student stu = sd.findStuByName(stuMap, findName);
				if (stu == null) {
					System.out.println("�Բ���,��Ҫ���ҵ�ѧԱ������!");
				} else {
					System.out.println("�ҵ���,��ѧԱ��Ϣ����:");
					System.out.println("����\t����");
					System.out.println(stu.getName() + "\t" + stu.getAge());
				}
			} else {
				System.out.println("��������ȷ�Ĳ˵�ѡ��!");
			}
			System.out.print("�Ƿ����(y/n):");
			answer = sc.next();
		} while (answer.equals("y"));
		System.out.println("ллʹ��!");
		sc.close();
	}
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> stuList = new ArrayList<Student>();
		Map<String, Student> stuMap = new HashMap<String, Student>();
		String answer = null;
		do {
			System.out.println("**********************************");
			System.out.println("\t1.���ѧԱ");
			System.out.println("\t2.����ѧԱ");
			System.out.println("**********************************");
			System.out.print("��ѡ��,��������:");
			int num = sc.nextInt();
			if (num == 1) {
				// ���ѧԱ
				System.out.print("������ѧԱ����:");
				String nameInput = sc.next();
				System.out.print("������ѧԱ����:");
				int ageInput = sc.nextInt();
				stuList.add(new Student(nameInput, ageInput));
				stuMap.put(nameInput, new Student(nameInput, ageInput));
				System.out.println("ѧԱ�б�����:");
				System.out.println("���\t����\t����");
				for (int i = 0; i < stuList.size(); i++) {
					System.out.println((i + 1) + "\t"
							+ stuList.get(i).getName() + "\t"
							+ stuList.get(i).getAge());
				}
			} else if (num == 2) {
				// ����ѧԱ
				StudentDemo sd = new StudentDemo();
				System.out.print("��������Ҫ���ҵ�ѧԱ����:");
				String findName = sc.next();
				Student stu = sd.findStuByName(stuMap, findName);
				if (stu == null) {
					System.out.println("�Բ���,��Ҫ���ҵ�ѧԱ������!");
				} else {
					System.out.println("�ҵ���,��ѧԱ��Ϣ����:");
					System.out.println("����\t����");
					System.out.println(stu.getName() + "\t" + stu.getAge());
				}
			} else {
				System.out.println("��������ȷ�Ĳ˵�ѡ��!");
			}
			System.out.print("�Ƿ����(y/n):");
			answer = sc.next();
		} while (answer.equals("y"));
		System.out.println("ллʹ��!");
		sc.close();
	}*/

	/**
	 * �������ֲ���ѧԱ
	 * 
	 * @param stuMap
	 *            Map<String, Student>ѧԱMap����
	 * @param name
	 *            Ҫ���ҵ�����
	 * @return �鵽���ظ�ѧԱ����,���򷵻�NUll
	 */
	public Student findStuByName(Map<String, Student> stuMap, String name) {
		Set<String> stuKeys = stuMap.keySet();
		for (String string : stuKeys) {
			if (name.equals(string)) {
				return stuMap.get(name);
			}
		}
		return null;
	}
}
