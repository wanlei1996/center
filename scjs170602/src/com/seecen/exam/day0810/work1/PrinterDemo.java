package com.seecen.exam.day0810.work1;

/**
 * ���Դ�ӡ��
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��10��
 */
public class PrinterDemo {

	public static void main(String[] args) {
		Printer[] printers = { new LaserPrinter(), new DotMatrixPrinter(),
				new InkpetPrinter() };
		printerAll(printers);
	}

	public static void printerAll(Printer[] printers) {
		for (int i = 0; i < printers.length; i++) {
			printers[i].printer();
		}
	}
}
