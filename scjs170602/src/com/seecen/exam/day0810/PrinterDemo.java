package com.seecen.exam.day0810;

import java.util.Scanner;

/**
 * ���Դ�ӡ��
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��10��
 */
public class PrinterDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer first = new FirstPrinter();
		IInkBox colorBox = new ColorInkBox();
		IInkBox blackBox = new BlackInkBox();
		IPaper a4Paper = new A4Paper();
		IPaper b5Paper = new B5Paper();
		System.out.print("��������Ҫ��ӡ���ַ���:");
		String data = sc.next();
		System.out.println("******��ӡ�������*******");
		first.printer(colorBox, b5Paper, data);
		first.printer(blackBox, a4Paper, data);
		sc.close();
	}

}
