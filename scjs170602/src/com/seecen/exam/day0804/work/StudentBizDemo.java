package com.seecen.exam.day0804.work;

import java.util.Scanner;

public class StudentBizDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����student��������
		Student[] stus = new Student[10];
		//�����ȸ�ѧ�����������ʼ��
		for (int i = 0; i < stus.length; i++) {
			// �Ƚ�����ʵ�����ŵ��������棬ֻ���Ƚ�����new���������ܶ������Խ��в���
			stus[i] = new Student();
			System.out.print("�������" + (i + 1) + "��ͬѧ������:");
			stus[i].setName(sc.next());
			System.out.print("�������" + (i + 1) + "��ͬѧ�����(cm):");
			stus[i].setHeight(sc.nextFloat());
		}
		StudentBiz sb = new StudentBiz();
		//����������
		int index1 = sb.findMaxHeight(stus);
		System.out.println("�ð��" + (index1 + 1)+ "����ѧ��������,Ϊ" + stus[index1].getHeight());
		//������������
		System.out.print("��������Ҫ���ҵ�����:");
		String findName = sc.next();
		int index2 = sb.findByName(stus, findName);
		if(index2==-1){
			System.out.println("�����������������!");
		}else{
			System.out.println("�����������:"+findName+",�ҵ���,��λ��������ĵ�" + (index2+1) + "��λ����!");
		}
		sc.close();
	}

}
