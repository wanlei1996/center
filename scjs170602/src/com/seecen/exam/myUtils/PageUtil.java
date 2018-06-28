package com.seecen.exam.myUtils;

import java.io.Serializable;
import java.util.List;

/**
 * �����ҳ��ʵ�幤����,�÷��Ϳ��������������ķ�ҳ
 * 
 * @author wanlei
 *
 */
public class PageUtil<T> implements Serializable{
	private static final long serialVersionUID = 1L;
	private int pageNum;// ��ǰҳ��
	private int size;// ÿҳ��ʾ������
	private int start;// ��ѯ�Ŀ�ʼλ��
	private int end;// ��ѯ��β��λ��
	private int count;// �ܼ�¼��
	private int pages;// ��ҳ��

	private List<T> list;// ��ҳ��Ķ��󼯺�
	private T bean;//��ҳ�Ķ���

	private String[] cha;//��������
	
	

	public String[] getCha() {
		return cha;
	}

	public void setCha(String[] cha) {
		this.cha = cha;
	}

	public T getBean() {
		return bean;
	}

	public void setBean(T bean) {
		this.bean = bean;
	}

	public int getPageNum() {
		// ҳ��Ĭ��Ϊ1
		if (pageNum == 0) {
			pageNum = 1;
		}
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getSize() {
		// ÿҳ��ʾ������Ĭ��Ϊ5
		if (size == 0) {
			size = 5;
		}
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getStart() {
		//���㿪ʼλ��
		start = (this.getPageNum() - 1) * getSize() + 1;
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		//����ĩβλ��
		end = getSize() * getPageNum();
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPages() {
		// ������ҳ��
		pages = (int) Math.ceil(1.0 * getCount() / getSize());
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
