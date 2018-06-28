package com.seecen.exam.day0814;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;
/**
 * �����Զ����쳣
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��14��
 */
public class TestMyException {
	private static Logger log = Logger.getLogger(TestMyException.class);

	@SuppressWarnings("all")
	public static void main(String[] args) {
		//����log4j��־����
		TestMyException te = new TestMyException();
//		te.test1("sffs");
		File file = new File("D:/a.txt");
		try {
			te.test2(file);
			InputStream in = new FileInputStream(file);
		} catch (Exception e) {
			//���쳣��Ϣд����־�ļ���
			log.error(e);
		} finally{
			System.out.println("end");
		}
		System.out.println("------------------------------");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("������γ̴���(1~3֮�������):");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("C#���");
				break;
			case 2:
				System.out.println("Java���");
				break;
			case 3:
				System.out.println("MySQL���");
				break;
			default:
				throw new InputMismatchException("����������ֲ�ƥ��!");
			}
		} catch (Exception e) {
			log.error(e);
		} finally{
			System.out.println("��ӭ������!");
		}
		sc.close();
	}

	public void test1(String str) {
		if (str == "") {
			throw new NullPointerException("��������ַ���Ϊ��!");
		} else if (!str.equals("str")) {
			throw new MyRuntimeException("��������ַ�������ȣ�");
		} else {
			System.out.println("fsdsfs");
		}
	}

	public void test2(File file) throws Exception {
		if (!file.exists()) {
			throw new FileNotFoundException("�ļ�δ�ҵ��쳣!");
		} else {
			if (!file.isFile()) {
				throw new MyCheckException("�����ļ��쳣��");
			} else {
				System.out.println("sfdfs");
			}
		}
	}
}
