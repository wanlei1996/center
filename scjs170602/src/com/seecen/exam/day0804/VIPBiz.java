package com.seecen.exam.day0804;

public class VIPBiz {
	/**
	 * ��ʾ���л�Ա��Ϣ
	 */
	public void showAll(VIP[] vips) {
		System.out.println("***��Ա�б�***");
		System.out.println("���\t����");
		for (VIP v : vips) {
			System.out.println(v.num + "\t" + v.score);
		}
	}

	/**
	 * ���ݻ�Ա��Ų��һ�Ա
	 * 
	 * @param num
	 *            ��Ա���
	 * @param vips
	 *            Ҫ���ҵ�VIP��������
	 * @return �ҵ����ظ�VIP�����򷵻�null
	 */
	public VIP findByNum(VIP[] vips, String num) {
		//����ѭ��������
		/*for (int i = 0; i < vips.length; i++) {
			if (num.equals(vips[i].num)) {
				return vips[i];
			}
		}*/
		for (VIP vip : vips) {
			if(vip.num!=null&&vip.num.equals(num)){
				return vip;
			}
		}
		return null;
	}
}
