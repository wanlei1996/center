package com.seecen.exam.day0929;
/**
 * �����̵߳ĵڶ��ַ���:ʵ��Runnable�ӿ�
 * @author wanlei
 *
 */
public class MyRunnable implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println("mythread�߳�����Ϊ��" + Thread.currentThread().getName() + ", idΪ��" + Thread.currentThread().getId());
		}
	}
}
