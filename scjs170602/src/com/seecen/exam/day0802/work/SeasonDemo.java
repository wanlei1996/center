package com.seecen.exam.day0802.work;

import java.util.Scanner;

public class SeasonDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Season s = new Season();
		String answer = null ;
		do{
			System.out.print("�������·�:");
			s.month = sc.nextInt();
			
			//����Season��ķ������д�ӡ����
			System.out.println(s.printSeason());
			
			System.out.print("�Ƿ���������·�(y/n):");
			answer = sc.next();
		}while(answer.equals("y"));
		sc.close();
	}
}
