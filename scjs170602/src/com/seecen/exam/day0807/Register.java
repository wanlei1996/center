package com.seecen.exam.day0807;

/**
 * Registerʵ����(javabean)
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��7��
 */
public class Register {
	private String idCard;// ���֤
	private String phone; // �ֻ���
	private String tel; // ������

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Register(String idCard, String phone, String tel) {
		super();
		this.idCard = idCard;
		this.phone = phone;
		this.tel = tel;
	}
	public Register(){
		super();
	}
}
