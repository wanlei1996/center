package com.seecen.exam.day0930;

import java.util.List;

/**
 * �������߳�
 * 
 * @author wanlei
 *
 */
public class ConsumerThread implements Runnable {
	private List<Forage> list;
	private String name;

	public ConsumerThread(List<Forage> list, String name) {
		super();
		this.list = list;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			while (true) {
				if (Thread.currentThread().isInterrupted())
					break;
				Forage f = null;
				//��������ʱ��������ʱ����������ݣ��̰߳�ȫ
				Test.lock.lock();
				if (list.size() == 0) {
					Test.full.signalAll();
					Test.empty.await();
				}
				Thread.sleep(500);
				//��������,listĬ���Ƴ���һ��
				f = list.remove(0);
				Test.lock.unlock();
				System.out.println(name + "����������" + f.getId() + ",�ֿ�ʣ����Ϊ:" + list.size());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
