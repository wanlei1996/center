package com.seecen.exam.day0929;
/**
 * �����̵߳ĵ�һ�ַ���:�̳�Thread��
 * @author wanlei
 *
 */
public class MyThread extends Thread{
	//cpu�����µ��̺߳󣬻�ȥִ��run����,�Լ���������run��û���õ�
	public void run() {
		while(true) {
			System.out.println("myThread�߳�����ִ���У��̵߳�IDΪ" + Thread.currentThread().getId());
		}
	}
}
