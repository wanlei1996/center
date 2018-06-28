package com.seecen.exam.day0929;
/**
 * ʵ������������������������̰߳�ȫ������,�����������:
 * 1. �������printerʵ�������Խ�������������ڴ渺�������Ƽ�ʹ��
 * 2. ����ʱ��Ч�ʣ���֤��ȫ����ͬ�������synchronized(����)
 * 3. ʹ�þֲ��������������̰߳�ȫ���⣬�Ƽ�ʹ��
 * @author wanlei
 * �ؼ���synchronized���÷�:
 * 1.����ʵ�������������ʵ��������ȫ�����ݶ�ͬ������������Ϊthis(��ǰ����)
 * 2.��Ϊͬ������飬��������Ϊ����Ψһ�Ķ��󼴿ɣ�������ڵ�����ͬ��
 * 3.���ξ�̬static����������þ�̬������ȫ�����ݶ�ͬ������������Ϊ��ǰ����ֽ����ļ�������ǰ����.class�������һ����Ψһ�ı�ʶ
 */
public class TestNameThread {
	/*
	 * �������һ:�������printerʵ��
	 * public static void main(String[] args) {
			Printer printer1 = new Printer();
			Printer printer2 = new Printer();
			Runnable r1 = new NameThread(printer1, "xizhiying");
			Runnable r2 = new NameThread(printer2, "yanjunwei");
			Thread t1 = new Thread(r1);
			Thread t2 = new Thread(r2);
			t1.start();
			t2.start();
		}
	 */
	public static void main(String[] args) {
		Printer printer = new Printer();
		Runnable r1 = new NameThread(printer, "xizhiying");
		Runnable r2 = new NameThread(printer, "yanjunwei");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
