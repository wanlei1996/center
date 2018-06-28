package com.seecen.exam.day0930;

import java.util.List;
import java.util.Random;

/**
 * �������߳�
 * 
 * @author wanlei
 *
 */
public class ProducerThread implements Runnable {
	private List<Forage> list;
	private int length;
	private String name;

	public ProducerThread(List<Forage> list, int length, String name) {
		super();
		this.list = list;
		this.length = length;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			while (true) {
				if (Thread.currentThread().isInterrupted())
					break;
				//�����������id
				Random r = new Random();
				Forage f = new Forage();
				f.setId(r.nextInt(100));
				//�������ʱ��������ʱ���ܹ������ݣ��̰߳�ȫ
				Test.lock.lock();
				if (list.size() >= length) {
					Test.empty.signalAll();
					Test.full.await();
				}
				Thread.sleep(500);
				//��������ӵ�list��ȥ
				list.add(f);
				Test.lock.unlock();
				System.out.println(name + "����������" + f.getId() + ",�ֿ�ʣ����Ϊ:" + list.size());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
