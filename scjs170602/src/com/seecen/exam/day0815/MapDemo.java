package com.seecen.exam.day0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * ����Map Map����һ�� ��Key-value"(��ֵ��)��ʽ�ļ��Ͻӿ�,��ʵ����HashMap(����������)��TreeMap(��������),�������ظ���
 * HashMapͨ����TreeMap��һ��,�����ʹ��HashMap,����Ҫ�����Mapʱ�����TreeMap��
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��15��
 */
public class MapDemo {

	public static void main(String[] args) {
		// HashMap���ᰴ������
		Map<String, String> countries = new HashMap<String, String>();
		countries.put("jp", "�ձ�");
		countries.put("ch", "�й�");
		countries.put("uk", "Ӣ��");
		countries.put("fr", "����");
		countries.remove("jp");

		// ��һ�ֱ���Map�ķ�����ͨ��get()��������ͨ��keySet()������ȡ����set���ϣ���key����ȡvalueֵ
		Set<String> keys = countries.keySet();
		// forEachѭ��(��ǿforѭ��)
		for (String key : keys) {
			System.out.print(key + ":" + countries.get(key) + "  ");
		}
		System.out.println();
		// �õ���������ѭ��
		Iterator<String> itor = keys.iterator();
		while (itor.hasNext()) {
			String key = itor.next();
			System.out.print(key + ":" + countries.get(key) + "  ");
		}
		System.out.println();
		System.out.println("--------------------");

		// �ڶ��ֱ���Map�ķ���,ͨ��entrySet()������ȡʵ��entry��set���ϣ���ͨ��ʵ���get()�����õ�key��value
		Set<Entry<String, String>> sets = countries.entrySet();
		// forEachѭ��(��ǿforѭ��)
		for (Entry<String, String> entry : sets) {
			System.out.print(entry.getKey() + ":" + entry.getValue() + "  ");
		}
		System.out.println();
		// �õ���������ѭ��
		Iterator<Entry<String, String>> itor2 = sets.iterator();
		while (itor2.hasNext()) {
			Entry<String, String> temp = itor2.next();
			System.out.print(temp.getKey() + ":" + temp.getValue() + "  ");
		}
		System.out.println();
		System.out.println("--------------------");

		// TreeMap�ᰴ����������������Σ�����С�����������String,��Ascall��ֵ����
		Map<String, String> countries1 = new TreeMap<String, String>();
		countries1.put("jp", "�ձ�");
		countries1.put("ch", "�й�");
		countries1.put("uk", "Ӣ��");
		countries1.put("fr", "����");
		Set<String> keys1 = countries1.keySet();
		Iterator<String> itor1 = keys1.iterator();
		while (itor1.hasNext()) {
			String key = itor1.next();
			System.out.print(key + ":" + countries1.get(key) + "  ");
		}
		System.out.println();
		System.out.print(countries.containsKey("cn") + "  ");
		System.out.println(countries.containsValue("�й�"));
		System.out.println("***************��ϰһ**************************");
		// ʹ��TreeMap<Integer, Student>���ȳ�ʼ�������ٱ�����ӡ�������
		Student[] stus = new Student[4];
		// key��ѧ��,value�������ĸ�ѧ���Ķ���
		Map<Integer, Student> stuList = new TreeMap<Integer, Student>();
		for (int i = 0; i < stus.length; i++) {
			// �������������
			Random random = new Random();
			// ����һ��1000-9999֮��������,nextInt(9000)����һ��0-8999֮�����
			int stuNo = random.nextInt(9000) + 1000;
			stus[i] = new Student("С��" + (i + 1), 18 + i, stuNo);
			// ��4��student���󷽷�Map��
			stuList.put(stuNo, stus[i]);
		}
		Set<Integer> stuKeys = stuList.keySet();
		Iterator<Integer> ator2 = stuKeys.iterator();
		while (ator2.hasNext()) {
			int key = ator2.next();
			// ֵ��Student��������
			Student stu = stuList.get(key);
			// ����student�����е�toString������ӡ���
			System.out.println(stu.toString());
		}
		System.out.println("***************��ϰ��**************************");
		Map<String, Penguin> penList = new HashMap<String, Penguin>();
		penList.put("001", new Penguin("fdsaf", "��"));
		penList.put("002", new Penguin("rrtsa", "Ů"));
		penList.put("003", new Penguin("terte", "Ů"));
		penList.put("004", new Penguin("dgsdf", "��"));
		Set<String> penKeys = penList.keySet();
		for (String penKey : penKeys) {
			System.out.print(penList.get(penKey).getName() + "-"
					+ penList.get(penKey).getSex() + "  ");
		}
		System.out.println();
		System.out.println(penList.containsKey("005") ? "�ҵ���" : "û�ҵ�");
		System.out.println("-------------------------");
		// �����Լ���װ�ķ���
		MapDemo md = new MapDemo();
		System.out.println(md.findByKey(penList, "002").getName());

	}

	/**
	 * ����key����Map<String, Penguin>�е�������
	 * 
	 * @param penList
	 *            map����
	 * @param str
	 *            keyֵ
	 * @return �鵽����һ��Penguin����,���򷵻�null
	 */
	public Penguin findByKey(Map<String, Penguin> penList, String str) {
		Set<String> penKeys = penList.keySet();
		boolean isExit = false;
		for (String key : penKeys) {
			if (str.equals(key)) {
				isExit = true;
				break;
			}
		}
		if (isExit) {
			System.out.println("��������!");
			return penList.get(str);
		} else {
			System.out.println("����첻����!");
			return null;
		}
	}

}
