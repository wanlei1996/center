package com.seecen.exam.day0802;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone iphone = new Phone();
		/*
		    Cell samsungCell = new Cell();
			samsungCell.pinPai = "����";
			//��ֵ��iphone�е�cell���ԣ�����Ϊ��
			iphone.cell = samsungCell;
		 */
		iphone.cell = new Cell("����");
		System.out.println(iphone.downloadMusic());
		System.out.println(iphone.playMusic());
		System.out.println(iphone.chongDian());
	}

}
