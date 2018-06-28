package com.seecen.exam.day0929;
/**
 * �����̵߳ķ�ʽ
 * 1. �̳�Thread��
 * 2. ʵ��Runnable�ӿ�
 * 3. �̳߳صķ�ʽ
 * @author wanlei
 *
 */
public class TestThread {
	public static void main(String[] args) {
		/*
		  	//��һ�ַ����ĵ���
			Thread t = new MyThread();
			//����jvm����һ���µ��߳�,����ָ�����ֻ����0.00001ms,��������߳�������������Ҳ����ִ��run����,��ȷ���ģ�ȡ����cpu�ĵ��ȡ�
			t.start();
			// main����:Java�����е�һ�����߳�
			while(true) {
				System.out.println("main�߳�����ִ���У��̵߳�IDΪ" + Thread.currentThread().getId());
			}
			System.out.println("-----------------------------------------------------");
		*/
		//�ڶ��ַ����ĵ���
		Runnable r1 = new MyRunnable();
		Runnable r2 = new MyRunnable();
		Runnable r3 = new MyRunnable();
		Thread t1 = new Thread(r1, "�߳�1");
		Thread t2 = new Thread(r2, "�߳�2");
		Thread t3 = new Thread(r3, "�߳�3");
		//����start()�����������Threadʵ������
		t1.start();
		t2.start();
		t3.start();
	}
}
