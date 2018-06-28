package com.seecen.exam.day0803;

import java.util.Scanner;

/**
 * ��һ����Ʒ�����ǵļ۸����ѡ��һ����Ʒ���о���(һ��4�λ���),�´�����Ӧ����ʾ���¶��н�
 * @author Administrator
 */
public class Guess {
	String goods;
	int price;

	/**
	 * ��ʼ�����ݵķ���
	 */
	public void init() {
		String[] goodses = { "��ά����", "С��MI6", "���Ʊ���", "34���ʵ�", "���۱ʼǱ�", "ϴ�»�" };
		int[] prices = { 3500, 3000, 5000, 4500, 6800, 3800 };
		// ��������������ﵽ���������Ʒ��Ч��
		int index = (int)(Math.random() * goodses.length);
		goods = goodses[index];
		price = prices[index];
	}

	/**
	 * ���·���
	 * @return �¶Է���true���´���false
	 */
	public boolean guessPrice() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��²�" + goods + "�ļ۸�:");
		for (int i = 3; i >= 0; i--) {
			int moneyInput = sc.nextInt();
			//���û����һ��û���еĻ���ֱ������ѭ��
			if (i == 0 && moneyInput != price) {
				break;
			}
			if (moneyInput > price) {
				System.out.print("��С��,�����:");
			} else if (moneyInput < price) {
				System.out.print("�ٴ��,�����:");
			} else {
				sc.close();
				return true;
			}
		}
		sc.close();
		return false;
	}
}
