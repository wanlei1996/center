package com.seecen.exam.day0814.work;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.seecen.exam.day0814.MyRuntimeException;

/**
 * �����ַ���������
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��14��
 */
public class StringListDemo {
	private static Logger log = Logger.getLogger(StringListDemo.class);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringList sl = new StringList();
		// ������С����,������������ݴ���
		int minSize = 1;
		String[] strs = new String[minSize];
		String answer = null;
		try {
			do {
				sl.printMenu();
				System.out.print("��ѡ������:");
				int num = sc.nextInt();
				switch (num) {
				case 1:
					System.out.print("��������Ҫ��ӵ��ַ���:");
					String addInput = sc.next();
					strs = sl.addStringToList(strs, addInput);
					System.out.println("�ַ����������������:");
					sl.showList(strs);
					break;
				case 2:
					System.out.print("��������Ҫɾ��������λ��:");
					int indexInput = sc.nextInt();
					strs = sl.removeStringInList(strs, indexInput);
					System.out.println("�ַ����������������:");
					sl.showList(strs);
					break;
				case 3:
					System.out.print("��������Ҫ���ҵ��ַ���:");
					String strInput = sc.next();
					int index = sl.findStringByIndex(strs, strInput);
					if (index == -1) {
						System.out.println("��Ҫ���ҵ��ַ���������!");
					} else {
						System.out.println("�ַ���\"" + strInput + "\"��������ĵ�"
								+ (index + 1) + "��λ����!");
					}
					break;
				case 4:
					System.out.println("�ַ����������������:");
					sl.showList(strs);
					break;
				default:
					throw new MyRuntimeException("��������ȷ�Ĳ˵�ѡ��!");
				}
				System.out.println("�Ƿ����(y/n):");
				answer = sc.next();
			} while (answer.equalsIgnoreCase("y"));
		} catch (ArrayIndexOutOfBoundsException e) {
			log.error(e.getMessage());
		} catch (NullPointerException e) {
			log.error(e.getMessage());
		} catch (MyRuntimeException e) {
			log.error(e.getMessage());
		} catch (Exception e) {
			log.error("����������!");
		} finally {
			System.out.println("ллʹ��,�����˳�!");
			System.exit(1);
			sc.close();
		}
	}
}
