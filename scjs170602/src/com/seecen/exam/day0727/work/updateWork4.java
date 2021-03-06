package com.seecen.exam.day0727.work;

import java.util.Scanner;
/**
 * 机票订购及优惠：switch嵌套版
 *  小明要做飞机去北京，机票原价为1000
	系统提示输入要飞的月份（1-12）：
	5,6,7,8,9,10为旺季
	其他月份为淡季
	系统提示输入要买头等舱还是经济舱
	旺季头等舱价格9折
	旺季经济舱价格7.5折
	淡季头等舱价格6折
	淡季经济舱价格5折
 * @author Administrator
 */
public class updateWork4 {
	public static void main(String[] args) {
		int price = 1000;//机票原价1000元
		double discount = 1.0;//起始为不打折
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要飞的月份(1-12):");
		int  month = sc.nextInt();
		System.out.println("请输入要买头等舱还是经济舱：");
		String str = sc.next();
		switch (month) {
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			switch (str) {
			case "头等舱":
				discount = 0.9;
				break;
			default:
				discount = 0.75;
				break;
			}
			break;
		default:
			switch (str) {
			case "头等舱":
				discount = 0.6;
				break;
			default:
				discount = 0.5;
				break;
			}
			break;
		}
		System.out.println("订票信息为："+month+"月的"+str);
		System.out.println("你打折后的总金额为："+ price * discount);
		sc.close();
	}
}
