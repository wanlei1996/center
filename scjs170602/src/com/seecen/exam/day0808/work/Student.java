package com.seecen.exam.day0808.work;

/**
 * ѧ��ʵ����
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��8��
 */
public class Student {
	public static final String MAJOR_COMPUTER = "�������ѧ�뼼��";
	public static final String MAJOR_SALES = "�г�Ӫ��";
	public static final String MAJOR_ENGINEER = "��ľ����";
	// ���������䣬�Ա�רҵ
	private String name;
	private int age = 18;
	private String sex = "��";
	private String pro;

	public Student() {
		super();
	}

	public Student(String name, int age, String sex, String pro) {
		super();
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
		this.setPro(pro);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 25) {
			this.age = age;
		} else {
			System.out.println("ѧ������Ӧ��:0~25�꣡(Ĭ��ֵΪ:18)");
		}
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		if (sex.equals("��") || sex.equals("Ů")) {
			this.sex = sex;
		} else {
			System.out.println("�Ա�ֻ�����л�Ů!(Ĭ��ֵΪ:��)");
		}
	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	/**
	 * �԰׺���
	 */
	public void show() {
		System.out.println("�ҵ�������:" + getName() + ",������:" + getAge() + ",�Ա���:"
				+ getSex() + ",רҵ��:" + getPro());
	}

	/**
	 * �԰׺���
	 * 
	 * @param num
	 *            Ҫ�԰׵Ĵ���
	 */
	public void show(int num) {
		for (int i = 0; i < num; i++) {
			show();
		}
	}

	/**
	 * �԰׺���
	 * 
	 * @param isShow
	 *            �Ƿ�Ҫ�԰�,false��ʾ���԰ף������԰�һ��
	 */
	public void show(boolean isShow) {
		if (isShow) {
			show();
		} else {
			System.out.println();
		}
	}
}
