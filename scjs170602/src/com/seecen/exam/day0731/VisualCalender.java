package com.seecen.exam.day0731;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * ���ӻ���������
 * */
public class VisualCalender {
	public static void main(String[] args) {
		System.out.println("���������ڣ����ո�ʽ��2010-10-13����");
		Scanner scanner = new Scanner(System.in);
		// ��ü���������
		String temp = scanner.nextLine();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = format.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			int day = calendar.get(Calendar.DATE);
			// ��ȡ����ĺ���
			calendar.set(Calendar.DATE, 1);

			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
			// ���µ�һ�����������ڼ�
			System.out.println(calendar.getActualMaximum(Calendar.DATE));
			// ���µ��������
			int maxDate = calendar.getActualMaximum(Calendar.DATE);

			System.out.println("��\tһ\t��\t��\t��\t��\t��");

			for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
				System.out.print("\t");
			}
			for (int i = 1; i <= maxDate; i++) {
				if (i == day) {
					System.out.print("*");
				}
				System.out.print(i + "\t");
				int week = calendar.get(Calendar.DAY_OF_WEEK);
				if (week == Calendar.SATURDAY) {
					System.out.print("\n");
				}
				calendar.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
