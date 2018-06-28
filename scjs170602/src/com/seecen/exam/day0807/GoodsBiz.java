package com.seecen.exam.day0807;

import java.text.DecimalFormat;

/**
 * ��Ʒҵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��7��
 */
public class GoodsBiz {
	/**
	 * ��ʾ���е���Ʒ��Ϣ
	 * 
	 * @param gds
	 *            ��Ʒ��������
	 */
	public void showAll(Goods[] gds) {
		System.out.println("���\t��Ʒ\t�۸�");
		DecimalFormat df = new DecimalFormat("#,###.####");
		for (int i = 0; i < gds.length; i++) {
			System.out.println(gds[i].getId() + "\t" + gds[i].getName() + "\t"
					+ df.format(gds[i].getPrice()));
		}
	}

	/**
	 * ����id������Ʒ
	 * 
	 * @param gds
	 *            ��Ʒ��������
	 * @param id
	 *            ��Ʒid
	 * @return ��Ʒ����
	 */
	public Goods findGoodById(Goods[] gds, int id) {
		for (int i = 0; i < gds.length; i++) {
			if (id == gds[i].getId()) {
				return gds[i];
			}
		}
		return null;
	}

	/**
	 * ������Ʒ��Ź������Ʒ
	 * 
	 * @param gds
	 *            ��Ʒ��������
	 * @param id
	 *            ��Ʒid
	 * @param num
	 *            ��������
	 * @return �����ܽ��
	 */
	public double buyGoods(Goods[] gds, int id, int num) {
		double sum = 0;
		Goods gd = findGoodById(gds, id);
		sum += gd.getPrice() * num;
		return sum;
	}
}
