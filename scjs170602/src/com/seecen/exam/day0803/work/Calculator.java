package com.seecen.exam.day0803.work;

/**
 * ����һ���������࣬�����������(+,-,*,/,%)����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��3��
 */
public class Calculator {
	double num1;
	double num2;

	/**
	 * ���������������������
	 * 
	 * @param operator
	 *            ������
	 * @return �������ַ���
	 */
	public String calculate(String operator) {
		if (operator.equals("+")) {
			//ƥ��ӷ�
			return "�ӷ����Ϊ:" + (num1 + num2);
		} else if (operator.equals("-")) {
			//ƥ�����
			if (num1 > num2) {
				return "�������Ϊ:" + (num1 - num2);
			} else {
				return "�������Ϊ:" + (num2 - num1);
			}
		} else if (operator.equals("*")) {
			//ƥ��˷�
			return "�˷����Ϊ:" + num1 * num2;
		} else if (operator.equals("/")) {
			//ƥ�����
			if (num2 != 0) {
				return "�������Ϊ:" + num1 / num2;
			} else {
				return "�������Ϊ:" + 0;
			}
		} else if (operator.equals("%")) {
			//ƥ������
			return "������Ϊ:" + num1 % num2;
		} else {
			return "��������ȷ�Ĳ�������";
		}
	}
}
