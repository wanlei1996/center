package com.seecen.exam.day0810;
/**
 * �ҵļ���,ʵ�ּ���ӿ�
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��10��
 */
public class MyHomeLetter implements IHomeLetter {

	@Override
	public void title() {
		System.out.println("�װ��İְ�,����:");
	}

	@Override
	public void greet() {
		System.out.println("    ����������ú���?");
	}

	@Override
	public void content() {
		System.out.println("\t��������ͦ�õģ����ǲ���̫�����ң�����������ʶ�˺ö�����!");
		System.out.println("\t���������ú�ѧϰ,�Ѿ�ѧ����Java OPP�����������!");
		System.out.println("\t���Ƕ��ϱ�������,���õ��Ķ��ӣ����Ѿ�������,���չ˺��Լ�!");
	}

	@Override
	public void wish() {
		System.out.println("    ����");
		System.out.println("����");
	}

	@Override
	public void end() {
		System.out.println("\t\t\t\t\t�������װ��Ķ���");
		System.out.println("\t\t\t\t\t2017��8��10��");
	}
	
	public static void main(String[] args) {
		MyHomeLetter mhl = new MyHomeLetter();
		mhl.title();
		mhl.greet();
		mhl.content();
		mhl.wish();
		mhl.end();
	}
}
