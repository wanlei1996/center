package com.seecen.exam.day0811.work;
/**
 * ��������һά�ַ�������a��b��Ҫ���ȥa�а���b��Ԫ�ص���õ�����c��˵����a��b�ж����ܴ���Ϊnull��Ԫ�ء�
 * ��ͨ��
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��11��
 */
public class CompareArray {
	public static void main(String[] args) {
		String a[] = new String[] { "a", "b", null, "c", null, "d", "f", "f" };
		String b[] = new String[] { "a", "c", "d", null };
		String[] c = new String[a.length];
		CompareArray ca = new CompareArray();
		String[] d = ca.compareArrays(a, b, c);
		ca.show(d);
	}
	/**
	 * չʾ�������
	 * @param strs �������
	 */
	public void show(String[] strs){
		System.out.print("���Ϊ:");
		for (String string : strs) {
			System.out.print(string + " ");
		}
	}
	/**
	 * ��ȥa�����а���b��Ԫ�ص������һ��������
	 * @param a a����
	 * @param b b����
	 * @param c �м���ʱ����
	 * @return ������
	 */
	public String[] compareArrays(String[] a, String[] b, String[] c) {
		// ����ȵĸ���������
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			boolean isTure = true;// �ȼ���true�����в����
			if (a[i] == null) {
				for (int j = 0; j < b.length; j++) {
					if (b[j] == null) {
						isTure = false;
						break;
					}
				}
			} else {
				for (int j = 0; j < b.length; j++) {
					if (a[i].equals(b[j])) {
						isTure = false;
						break;
					}
				}
			}
			if (isTure) {
				c[index] = a[i];
				index++;
			}
		}
		// ����������
		String d[] = new String[index];
		for (int i = 0; i < index; i++) {
			d[i] = c[i];
		}
		return d;
	}
}
