package com.seecen.exam.day0809;

/**
 * ������ʵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��9��
 */
public abstract class MotoVehicle {
	public static final String CAR_GL8 = "��������GL8";
	public static final String CAR_550i = "����550i";
	public static final String CAR_bieke = "���������";
	
	// ���ƺţ�Ʒ�ƣ���ɫ�����
	private String num;
	private String brand;
	private String color;
	private double mileage;

	public MotoVehicle() {
		super();
	}

	public MotoVehicle(String num, String brand, String color, double mileage) {
		super();
		this.num = num;
		this.brand = brand;
		this.color = color;
		this.mileage = mileage;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public abstract double calRent(int day);
}
