package com.seecen.exam.day0803;

/**
 * ѧԱ����ϵͳ��
 * 
 * @author ����
 */
public class StudentManageSystem {
	String[] names = new String[100];

	/**
	 * ��ӡ�˵�
	 */
	public void printMenu() {
		System.out.println("*******��ӭ����ѧԱ����ϵͳ*******");
		System.out.println("\t1.���ѧԱ");
		System.out.println("\t2.ɾ��ѧԱ");
		System.out.println("\t3.�޸�ѧԱ");
		System.out.println("\t4.ȫ�ֲ���ѧԱ");
		System.out.println("\t5.��������ѧԱ");
		System.out.println("\t6.��ʾ����ѧԱ");
		System.out.println("*****************************");
	}

	/**
	 * ���ѧԱ
	 * 
	 * @param name
	 *            ѧԱ��
	 * @return ��ӳɹ�����true��ʧ�ܷ���false
	 */
	public boolean add(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				return true;
			}
		}
		return false;
	}

	/**
	 * ����ѧԱ������
	 * 
	 * @param name
	 *            ѧԱ��
	 * @return �鵽�˷����������ڵ�����ֵ�����򷵻�-1
	 */
	public int findByName(String name) {
		for (int i = 0; i < names.length; i++) {
			if (name.equalsIgnoreCase(names[i])) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * �ڿ�ʼ�����ͽ�������֮��,����ѧԱ������
	 * @param startIndex ��ʼ����
	 * @param endIndex ��������
	 * @param name ѧԱ��
	 * @return �鵽�˷����������ڵ�����ֵ�����򷵻�-1
	 */
	public int findByIndex(int startIndex,int endIndex,String name){
		for (int i = startIndex - 1; i < endIndex; i++) {
			if (name.equalsIgnoreCase(names[i])) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * ��������ɾ��ѧԱ��Ϣ
	 * 
	 * @param name
	 *            ѧԱ��
	 * @return ɾ���ɹ�����true�����򷵻�false
	 */
	public boolean deleteName(String name) {
		if (findByName(name) == -1) {
			return false;
		} else {
			// �������в��ҵõ�������ֵ��λ�����
			names[findByName(name)] = null;
			return true;
		}
	}

	/**
	 * �����������޸ľ�����,������������ھ��޸ģ������޸�
	 * 
	 * @param oldName
	 *            ������
	 * @param newName
	 *            ������
	 * @return �޸ĳɹ�����true�����򷵻�false
	 */
	public boolean updateName(String oldName, String newName) {
		if (findByName(oldName) == -1) {
			return false;
		} else {
			names[findByName(oldName)] = newName;
			return true;
		}
	}

	/**
	 * ��ʾ����ѧԱ����Ϣ
	 */
	public void showAll() {
		for (String str : names) {
			System.out.print(str == null ? "" : str + "  ");
		}
	}
}
