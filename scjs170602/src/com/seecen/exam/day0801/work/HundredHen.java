package com.seecen.exam.day0801.work;
/**
 *  ��Ǯ��ټ�  100��Ǯ�����򷨿�����100ֻ��
 *  1ֻ����5��  1ֻĸ��3��  3ֻС��1��
 * @author Administrator
 */
public class HundredHen {
	public static void main(String[] args) {
		System.out.println("100��Ǯ��100ֻ����������:");
		// ��������(���20��ѭ��20��)
		for (int cock = 0; cock < 20; cock++) {
			// ĸ������(���33)
			for (int hen = 0; hen < 33; hen++) {
				// С������(һ����3�ı���)
				int chicks = 100 - cock - hen;
				//���м��ļ۸��ܺ�
				int price = cock * 5 + hen * 3 + chicks / 3;
				if (price == 100 && chicks % 3 == 0) {
					System.out.println("������ֻ����" + cock + "," + "ĸ����ֻ����" + hen
							+ "," + "С����ֻ����" + chicks);
				}
			}
		}
	}
}
