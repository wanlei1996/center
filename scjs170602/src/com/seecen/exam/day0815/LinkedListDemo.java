package com.seecen.exam.day0815;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * ����LinkedList LinkedList(����)����һ�� ����Ψһ�����򡱵ļ���,�Ƿ�����(��ʽ)�洢���ڴ�ṹ���丸�ӿ�ΪList�ӿ�
 * ��ѯ�ٶ��������м�λ�õ�����ɾ�ٶȿ�
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��15��
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		// ���巺��String������ֻ�ܴ洢String���͵�����
		LinkedList<String> heros = new LinkedList<String>();
		heros.addFirst("С��");
		heros.add("ʯͷ��");
		heros.add("����");
		heros.add("���");
		heros.addLast("Ϲ��");
		heros.set(1, "��ʥ");// set�����޸�ֵ
		// ��һ�ֱ�������:forһ��ѭ��
		for (int i = 0; i < heros.size(); i++) {
			System.out.print(heros.get(i) + " ");
		}
		System.out.println();
		System.out.println("--------------");
		// ɾ����һ�������һ��
		heros.removeFirst();
		heros.removeLast();
		// �ڶ��ֱ�������:forEachѭ��(��ǿforѭ��)
		for (Object o : heros) {
			System.out.print(o + " ");
		}
		System.out.println();
		System.out.println("--------------");
		// ��ȡ��һ�������һ��
		System.out.println(heros.getFirst() + " " + heros.getLast());
		System.out.println("--------------");
		LinkedList<Penguin> pens = new LinkedList<Penguin>();
		pens.add(new Penguin("dfsd","��"));
		pens.add(new Penguin("ewrw","Ů"));
		pens.add(new Penguin("afgh","��"));
		// �����ֱ�������:�õ���������ѭ��
		Iterator<Penguin> penItor = pens.iterator();
		while (penItor.hasNext()) {
			Penguin pen = penItor.next();
			System.out.print(pen.getName() + "-" + pen.getSex() + "  ");
		}
	}

}
