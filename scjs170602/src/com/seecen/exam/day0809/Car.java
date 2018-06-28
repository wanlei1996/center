package com.seecen.exam.day0809;

/**
 * ����ʵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��9��
 */
public final class Car extends MotoVehicle {
	/**
	 * ���(�ͺ�GL8:RENT_MONEY_GL8)
	 */
	public static final double RENT_MONEY_GL8 = 600;
	/**
	 * ���(�ͺ�550i:RENT_MONEY_550i)
	 */
	public static final double RENT_MONEY_550i = 500;
	/**
	 * ���(�ͺ�bieke:RENT_MONEY_bieke)
	 */
	public static final double RENT_MONEY_bieke = 300;
	private String type;// �ͺ�

	public Car() {
		super();
	}

	public Car(String num, String brand, String color, double mileage,
			String type) {
		super(num, brand, color, mileage);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public double calRent(int day) {
		if (getType().equals(MotoVehicle.CAR_GL8)) {
			return day * Car.RENT_MONEY_GL8;
		} else if (getType().equals(MotoVehicle.CAR_550i)) {
			return day * Car.RENT_MONEY_550i;
		} else if (getType().equals(MotoVehicle.CAR_bieke)) {
			return day * Car.RENT_MONEY_bieke;
		} else{
			System.out.println("����������ͺ�!");
			return 0;
		}
	}

}
