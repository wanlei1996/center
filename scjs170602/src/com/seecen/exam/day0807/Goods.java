package com.seecen.exam.day0807;

/**
 * ��Ʒʵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��7��
 */
public class Goods {
	private int id;
	private String name;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Goods(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Goods() {
		super();
	}
}
