package com.seecen.exam.day0815;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * ����Set���Ͻӿ� Set����һ�� ��Ψһ������(����˳��)���ļ��Ͻӿڣ��丸��ΪCollection����ʵ����HashSet��TreeSet
 * 1��TreeSet �Ƕ�����ʵ�ֵ�,Treeset�е��������Զ��ź���ģ����������nullֵ�� 2��HashSet
 * �ǹ�ϣ��ʵ�ֵ�,HashSet�е�����������ģ����Է���null����ֻ�ܷ���һ��null�������е�ֵ�������ظ����������ݿ���ΨһԼ����
 * 3��HashSetҪ�����Ķ������ʵ��HashCode()����������Ķ�������hashcode����Ϊ��ʶ�ģ���������ͬ���ݵ�
 * String����hashcode��һ�������Է�������ݲ����ظ�������ͬһ����Ķ�����Է��벻ͬ��ʵ�� ��
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��15��
 */
public class SetDemo {

	public static void main(String[] args) {
		// HashSet�÷�
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(6);
		set1.add(3);
		set1.add(4);
		set1.add(2);
		// �õ���������ѭ��
		Iterator<Integer> itor1 = set1.iterator();
		while (itor1.hasNext()) {
			System.out.print(itor1.next() + " ");
		}
		System.out.println();
		System.out.println("��set���ϵĹ�ϣ��ֵ:" + set1.hashCode());
		System.out.println("��set���ϵ�size : " + set1.size());
		System.out.println("--------------------");
		// TreeSet�÷�
		Set<Integer> set2 = new TreeSet<Integer>();
		set2.add(6);
		set2.add(3);
		set2.add(4);
		set2.add(1);
		// forEachѭ��(��ǿforѭ��)
		for (Integer integer : set2) {
			System.out.print(integer + " ");
		}
		System.out.println();
		System.out.println("��set���ϵĹ�ϣ��ֵ:" + set2.hashCode());
		System.out.println("��set���ϵ�size : " + set2.size());
	}

}
