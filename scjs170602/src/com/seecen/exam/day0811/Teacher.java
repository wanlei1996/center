package com.seecen.exam.day0811;

/**
 * ��ʦʵ����
 * ����������д����object�еĳ��÷���
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��11��
 */
public class Teacher implements Cloneable{
	private String name;// ����
	private String major;// רҵ
	private int teachAge;// ����

	public Teacher() {
		super();
	}

	public Teacher(String name, String major, int teachAge) {
		super();
		this.name = name;
		this.major = major;
		this.teachAge = teachAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getTeachAge() {
		return teachAge;
	}

	public void setTeachAge(int teachAge) {
		this.teachAge = teachAge;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(getName() + "��������Ҫ��GC������!");
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Teacher)) {
			return false;
		}
		Teacher t = (Teacher) obj;
		if (t.getName().equals(this.getName())
				&& t.getMajor().equals(this.getMajor())
				&& t.getTeachAge() == this.getTeachAge()) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", major=" + major + ", teachAge="
				+ teachAge + "]";
	}

	@Override
	public int hashCode() {
		int suanfa = 10 * 20 * 30 - 12;
		return (this.getName().hashCode() + this.getMajor().hashCode() + this
				.getTeachAge()) * suanfa;
	}
}
