package com.seecen.exam.day0814;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * �����쳣��
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��14��
 */
public class TestException {
	// �õ���־����
	private static Logger log = Logger.getLogger(TestException.class);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("�����뱻����:");
			int num1 = sc.nextInt();
			System.out.print("���������:");
			int num2 = sc.nextInt();
			if (num2 == 0) {
				throw new MyRuntimeException("��������Ϊ0!");
			} else {
				log.info("���Ϊ:" + num1 / num2);
			}
		} catch (MyRuntimeException e) {
			log.warn(e.getMessage());
		} catch (Exception e) {
			log.error("������Ĳ���������");
		} finally {
			sc.close();
		}
	}

}
