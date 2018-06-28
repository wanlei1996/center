package com.seecen.exam.day0814.work;

/**
 * �ַ���������
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��14��
 */
public class StringList {
	int index = 0;// �ַ����ĸ���

	/**
	 * ������������ַ���
	 * 
	 * @param strs
	 *            �ַ�������
	 * @param str
	 *            Ҫ��ӵ��ַ���
	 * @return �µ��ַ�������
	 */
	public String[] addStringToList(String[] strs, String str) {
		if (index == strs.length - 1) {
			// ��������2������������
			String[] newStrs = new String[strs.length * 2];
			System.arraycopy(strs, 0, newStrs, 0, strs.length);
			newStrs[index++] = str;
			return newStrs;
		} else {
			// ����ַ���������
			strs[index++] = str;
			return strs;
		}
	}

	/**
	 * ���ַ����������Ƴ��ַ���
	 * 
	 * @param strs
	 *            �ַ�������
	 * @param index
	 *            Ҫ�Ƴ�������
	 * @return �Ƴ����������
	 * @throws ArrayIndexOutOfBoundsException
	 *             ������Խ��ʱ����������Խ���쳣
	 */
	public String[] removeStringInList(String[] strs, int index)
			throws ArrayIndexOutOfBoundsException {
		if (index < 0 || index >= getListSize(strs)) {
			throw new ArrayIndexOutOfBoundsException("��Ҫɾ�������������ڣ�");
		} else {
			// ���������ڵ�λ�����ݸ�ֵΪnull
			for (int i = 0; i < strs.length; i++) {
				strs[index] = null;
			}
			// ����index�Ժ������ȫ����ǰ��һ��λ��
			for (int i = index; i < strs.length - 1; i++) {
				strs[i] = strs[i + 1];
			}
			return strs;
		}
	}
	/**
	 * ���ַ����������Ƴ��ַ���
	 * @param strs
	 * @param str
	 * @return
	 */
	public String[] removeStringInList(String[] strs, String str) {
		if (str == null) {
			throw new NullPointerException("��Ҫɾ�����ַ�������Ϊ��!");
		} else {
			for (int i = 0; i < getListSize(strs); i++) {
				if (str.equals(strs[i])) {
					strs[i] = null;
				}
				for (int j = i; j < strs.length - 1; j++) {
					strs[j] = strs[j + 1];
				}
			}
			return strs;
		}
	}

	/**
	 * �����ַ�������
	 * 
	 * @param strs
	 *            �ַ�������
	 * @param str
	 *            Ҫ���ҵ��ַ���
	 * @return �鵽�˷���������,���򷵻�-1
	 * @throws NullPointerException
	 *             Ҫ���ҵ��ַ���Ϊ��ʱ�׳���ָ���쳣
	 */
	public int findStringByIndex(String[] strs, String str)
			throws NullPointerException {
		if (str == null) {
			throw new NullPointerException("���ҵ��ַ�������Ϊ��!");
		} else {
			for (int i = 0; i < strs.length; i++) {
				if (str.equals(strs[i])) {
					return i;
				}
			}
			return -1;
		}
	}

	/**
	 * �����������ݵĴ�С(�ַ����ĸ���)
	 * 
	 * @param strs
	 *            �ַ�������
	 * @return �ַ����ĸ����ĸ���
	 */
	public int getListSize(String[] strs) {
		int count = 0;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i] != null) {
				count++;
			}
		}
		return count;
	}

	/**
	 * �������������ַ������������
	 * 
	 * @param strs
	 *            �ַ�������
	 * @param index
	 *            ����
	 * @return �鵽���ظ�����������,�����׳�����Խ���쳣
	 * @throws ArrayIndexOutOfBoundsException
	 *             ������Խ��ʱ����������Խ���쳣
	 */
	public String getByIndex(String[] strs, int index)
			throws ArrayIndexOutOfBoundsException {
		if (index < 0 || index >= getListSize(strs)) {
			throw new ArrayIndexOutOfBoundsException("����ҵ���������Խ�磡");
		} else {
			return strs[index];
		}
	}

	/**
	 * ��ʾ���������������
	 * 
	 * @param strs
	 *            �ַ�������
	 */
	public void showList(String[] strs) {
		for (int i = 0; i < getListSize(strs); i++) {
			System.out.print(strs[i] + " ");
		}
		System.out.println();
	}

	/**
	 * ��ӡ�˵�
	 */
	public void printMenu() {
		System.out.println("*****��ӭ�����ַ�������Ĳ�������*****");
		System.out.println("\t1.����ַ���");
		System.out.println("\t2.ɾ���ַ���");
		System.out.println("\t3.�����ַ���");
		System.out.println("\t4.��ʾ�����ַ���");
		System.out.println("*******************************");
	}
}
