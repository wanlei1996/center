package com.seecen.exam.day0809;

/**
 * ���Ի�������
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��9��
 */
public class MotoVehicleDemo {

	public static void main(String[] args) {
		MotoVehicle c = new Car("1113", "����", "��", 120.23, "���������");
		System.out.println("������3������Ϊ:" + c.calRent(5));
		MotoVehicle b = new Bus("2413", "�ϲ�����", "��", 154.3, 16);
		System.out.println("������2������Ϊ:" + b.calRent(3));
		System.out.println("-----------------------------------");
		MotoVehicle[] motos = new MotoVehicle[4];
		motos[0] = new Car("��NNN328","����","��",135.8,"����550i");//2500
		motos[1] = new Car("��NY28728","���","��",189.2,"���������");//1500
		motos[2] = new Bus("����NY522","����","��",110.5,34);//7500
		motos[3] = new Truck("����NY872","����","��",100.23,800);//2500
		
		System.out.println("��Щ���⳵5��������Ϊ:" + calTotalRent(motos)+"Ԫ!");//14000
	}
	public static double calTotalRent(MotoVehicle[] motos){
		double totalPrice = 0;
		for (int i = 0; i < motos.length; i++) {
			totalPrice += motos[i].calRent(5);
		}
		return totalPrice;
	}
}
