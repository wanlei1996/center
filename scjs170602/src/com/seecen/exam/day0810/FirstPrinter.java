package com.seecen.exam.day0810;

/**
 * ��һ̨��ӡ��,�̳��˳������ӡ��
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��10��
 */
public class FirstPrinter extends Printer {

	@Override
	public void printer(IInkBox inkBox, IPaper paper, String data) {
		System.out.println("��һ̨��ӡ�������� " + inkBox.getColor() + " ��ī��," + paper.getSize() + "ֽ��ӡ�ˡ�"
				+ data + "��!");
	}

}
