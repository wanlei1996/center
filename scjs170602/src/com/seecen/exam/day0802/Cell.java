package com.seecen.exam.day0802;

public class Cell {
	String pinPai;
	
	public Cell(){
		super();
	}
	public Cell(String pinPai) {
		super();
		this.pinPai = pinPai;
	}

	public String xuDian() {
		return "����Ϊ" + pinPai + "�ĵ�����";
	}
}
