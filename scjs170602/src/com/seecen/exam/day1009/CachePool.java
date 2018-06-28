package com.seecen.exam.day1009;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * �̳߳�  
 * @author bigpig
 * 
 * ����һ��cache�̳߳�
 * 1. ���û�п��е��̣߳���ô�ͻᴴ��һ��
 * 2. ����еĻ�����ֱ��ʹ��֮ǰ���߳�������
 */
public class CachePool {
	public static void main(String[] args) throws Exception {
		// ��ʼ0�������о��ã�û�оʹ������ʺ���������
		//ExecutorService es = Executors.newCachedThreadPool();
		// ��ʼ�����̶���������������ʹ�����е��̣߳������͵ȴ�
		//ExecutorService es = Executors.newFixedThreadPool(3);
		// �ο�����fix�ģ�����ֻ����1��
		//ExecutorService es = Executors.newSingleThreadExecutor();
		
		// �������� ÿ�����ִ��һ�θ��߳�
		ScheduledExecutorService es = Executors.newScheduledThreadPool(1);
		
		es.scheduleAtFixedRate(new MyJob(), 0, 7, TimeUnit.DAYS);
	}
}
class MyJob implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getId() + "do jobing...");
		System.out.println(Thread.currentThread().getId() + "end...");
	}
}