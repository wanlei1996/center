package com.seecen.exam.day0811.work;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������һά�ַ�������a��b��Ҫ���ȥa�а���b��Ԫ�ص���õ�����c��˵����a��b�ж����ܴ���Ϊnull��Ԫ�ء�
 * ArrayList�汾��
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��11��
 */
public class Work2 {

	public static void main(String[] args) {
		String[] a = new String[] { "a", "b", "c", null, null, "d", "f", "e",
				"f" };
		String[] b = new String[] { "a", "c", "d" };
		Work2 w = new Work2();
		w.getArray(a, b);
	}

	/**
	 * ��ȥa�а���b��Ԫ�ص���õ�����c
	 * 
	 * @param a
	 *            ����a
	 * @param b
	 *            ����b
	 */
	public void getArray(String[] a, String[] b) {
		List<String> list = new ArrayList<String>();
		// �Ȱ�����a�е�Ԫ�ض���������list��
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		// ȥ������b�е�Ԫ��������list��Ԫ����ͬ�Ĳ���
		for (int i = 0; i < b.length; i++) {
			if (b[i] == null) {
				// ��b�����Ԫ�ص���Null��ʱ�򣬱���a����,��a���������null�Ƴ�
				for (int j = 0; j < list.size(); j++) {
					if (a[j] == null) {
						list.remove(a[j]);
					}
				}
			} else {
				// ��b�������Ԫ�ز�����Null��ʱ�򣬱���a����,��a��������ĵ���b[i]�Ƴ�
				for (int j = 0; j < list.size(); j++) {
					if (b[i].equals(a[j])) {
						list.remove(a[j]);
					}
				}
			}
		}
		showArray(list);
	}

	/**
	 * չʾ�������ķ���
	 * 
	 * @param arr
	 */
	public void showArray(List<String> c) {
		System.out.println("����c�е�Ԫ��չʾ���£�");
		for (String string : c) {
			System.out.print(string + " ");
		}
	}
}
