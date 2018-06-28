package com.seecen.exam.day0809;

/**
 * ����ʵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��10��
 */
public class Truck extends MotoVehicle {
	/**
	 * ���(��:RENT_MONEY_SMALL)
	 */
	public static final double RENT_MONEY_LIGHT = 500;
	/**
	 * ���(��:RENT_MONEY_LARGE)
	 */
	public static final double RENT_MONEY_WEIGHT = 1000;
	private int loadCapacity;// ������

	public Truck() {
		super();
	}

	public Truck(String num, String brand, String color, double mileage,
			int loadCapacity) {
		super(num, brand, color, mileage);
		this.loadCapacity = loadCapacity;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	@Override
	public double calRent(int day) {
		if (getLoadCapacity() > 1000) {
			return day * Truck.RENT_MONEY_WEIGHT;
		} else {
			return day * Truck.RENT_MONEY_LIGHT;
		}
	}

}
