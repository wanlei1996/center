package com.seecen.exam.day0802.work;

/**
 * �����࣬����һ���·ݣ���ӡ���·���ʲô����
 * 
 * @author Administrator
 */
public class Season {
	int month;

	public String printSeason() {
		if (month >= 1 && month <= 3) {
			// 1,2,3
			return month + "�£�Ϊ:����";
		} else if (month >= 4 && month <= 6) {
			// 4,5,6
			return month + "�£�Ϊ:�ļ�";
		} else if (month >= 7 && month <= 9) {
			// 7,8,9
			return month + "�£�Ϊ:�＾";
		} else {
			// 10,11,12
			return month + "�£�Ϊ:����";
		}

	}
}
