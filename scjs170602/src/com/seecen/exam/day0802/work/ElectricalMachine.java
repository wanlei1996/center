package com.seecen.exam.day0802.work;
/**
 * �����û�����ļ۸�,�͵�����ʵ�ļ۸���бȽ�,�´������Ӧ����ʾ,(ֻ���Ĵλ���),�¶Խ���
 * @author Administrator
 */
public class ElectricalMachine {
	String name;
	int price;
	int guessPrice;

	public String Guess() {
		if (guessPrice > price) {
			return "��С��!";
		} else if (guessPrice < price) {
			return "�ٴ��!";
		} else {
			return "�¶���!";
		}
	}

	public String printMenu(int count) {
		if (count == 4) {
			return "��²�" + name + "�ļ۸�:";
		} else {
			return "�ٲ�һ�ΰ�:";
		}
	}
}
