package com.seecen.exam.day0802.work;

/**
 * ����һ���������࣬�����������+��-��*��/,%����
 * @author Administrator
 */
public class Calculator {
	double num1;
	double num2;

	public String calculate(String operator) {
		if (operator.equals("+")) {
			return "�ӷ����Ϊ:" + (num1 + num2);
		} else if (operator.equals("-")) {
			if (num1 > num2) {
				return "�������Ϊ:" + (num1 - num2);
			} else {
				return "�������Ϊ:" + (num2 - num1);
			}
		} else if (operator.equals("*")) {
			return "�˷����Ϊ:" + num1 * num2;
		} else if (operator.equals("/")) {
			if (num2 != 0) {
				return "�������Ϊ:" + num1 / num2;
			} else {
				return "�������Ϊ:" + 0;
			}
		} else if(operator.equals("%")){
			return "������Ϊ:" + num1 % num2;
		} else{
			return "��������ȷ�Ĳ�������";
		}

	}
}
