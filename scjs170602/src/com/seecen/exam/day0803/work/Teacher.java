package com.seecen.exam.day0803.work;

/**
 * ��ʦ����ϵͳ��(��7������,6���˵�����)
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��3��
 */
public class Teacher {
	String[] names = new String[100];

	/**
	 * ��ӡ�˵�
	 */
	public void printMenu() {
		System.out.println("*******��ӭ������ʦ����ϵͳ*******");
		System.out.println("\t1.�����ʦ");
		System.out.println("\t2.ɾ����ʦ");
		System.out.println("\t3.�޸���ʦ");
		System.out.println("\t4.ȫ�ֲ�����ʦ");
		System.out.println("\t5.����������ʦ");
		System.out.println("\t6.��ʾ������ʦ");
		System.out.println("*****************************");
	}

	/**
	 * �����ʦ
	 * 
	 * @param name
	 *            ��ʦ��
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
	 * ������ʦ��(��ĸ���Դ�Сд)����
	 * 
	 * @param name
	 *            ��ʦ��
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
	 * �ڿ�ʼ�����ͽ�������֮��,������ʦ��(��ĸ���Դ�Сд)����
	 * @param startIndex ��ʼ����
	 * @param endIndex ��������
	 * @param name ��ʦ��
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
	 * ��������ɾ����ʦ��Ϣ
	 * 
	 * @param name
	 *            ��ʦ��
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
	 * ��ʾ������ʦ����Ϣ
	 */
	public void showAll() {
		for (String str : names) {
			System.out.print(str == null ? "" : str + "  ");
		}
	}
}
