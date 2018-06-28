package com.seecen.exam.day0929.lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Printer {
	//����һ����д��
	ReadWriteLock rwLock = new ReentrantReadWriteLock();
	public void printerName() {
		//�����������ڴ��ڼ䲻�ܽ���д����
		rwLock.readLock().lock();
		for(int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getId() + "����ִ�ж�read����" + i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//��������
		rwLock.readLock().unlock();
	}
	
	public  void writerName() {
		//д���������ڴ��ڼ䲻�ܽ��ж�����
		rwLock.writeLock().lock();
		for(int i = 0; i <= 50; i++) {
			System.out.println(Thread.currentThread().getId() + "����ִ��дwrite����" + i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//д������
		rwLock.writeLock().unlock();
	}
	
}
