package com.seecen.exam.day0810;

/**
 * �������ʦ��,ʵ��ҵ�����ӿںͱ�̽ӿ�
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��10��
 */
public class SoftEngineer implements IBizAgent, IProgrammer {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void writeProgrammer() {
		System.out.println(getName() + "��д����!");
	}

	@Override
	public void giveBizSpeech() {
		System.out.println(getName() + "�ὲҵ��!");
	}

	public void show() {
		System.out.println("����һ���������ʦ,�ҵ����ֽ�" + getName());
	}
}
