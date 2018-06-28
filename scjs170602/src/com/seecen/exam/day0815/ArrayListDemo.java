package com.seecen.exam.day0815;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ����ArrayList ArrayList����һ�� ����Ψһ�����򡱵ļ��ϣ��������洢���ڴ�ṹ���丸�ӿ�ΪList�ӿ�
 * �����ٶȿ죬���м�λ�õ�����ɾ�ٶ���
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��15��
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		Penguin pen1 = new Penguin("fdsf", "��");
		Penguin pen2 = new Penguin("aghg", "Ů");
		Penguin pen3 = new Penguin("errr", "Ů");
		Penguin pen4 = new Penguin("zbcb", "��");
		List<Penguin> pens = new ArrayList<Penguin>();
		pens.add(pen1);
		pens.add(pen2);
		pens.add(pen3);
		pens.add(pen4);
		System.out.println("��СΪ:" + pens.size());
		// ��һ�ֱ�������:forһ��ѭ��
		for (int i = 0; i < pens.size(); i++) {
			System.out.print(pens.get(i).getName() + "-" + pens.get(i).getSex()
					+ "  ");
		}
		System.out.println();
		pens.remove(1);
		// �ڶ��ֱ�������:forEachѭ��(��ǿforѭ��)
		for (Penguin penguin : pens) {
			System.out.print(penguin.getName() + "-" + penguin.getSex() + "  ");
		}
		System.out.println();
		pens.set(0, pen4);
		// �����ֱ�������:�õ���������ѭ��
		Iterator<Penguin> itor = pens.iterator();
		while (itor.hasNext()) {
			Penguin pen = itor.next();
			System.out.print(pen.getName() + "-" + pen.getSex() + "  ");
		}
		System.out.println();
		System.out.println("�Ƿ����" + pen1.getName() + ":" + pens.contains(pen1));
	}

}
