package com.seecen.exam.day0812;
/**
 * ������ʵ����
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��12��
 */
public class TestPerson {
	public static void main(String[] args) {
		Son son = new Son("С��",20);
		son.eat();
		son.play();
		son.swim();
		son.show();
		Father t = new Father("С������",37);
		t.show();
		Mother m = new Mother("С������",35);
		m.show();
	}
}
