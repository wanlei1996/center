package com.seecen.exam.day0803;

public class GuessDemo {
	public static void main(String[] args) {
		Guess gs = new Guess();
		gs.init();
		if(gs.guessPrice()){
			System.out.println("��ϲ��¶���!");
		}else{
			System.out.println("�Բ�����4�ζ�û�¶�,�´���Ŭ����!");
		}
	}
}
