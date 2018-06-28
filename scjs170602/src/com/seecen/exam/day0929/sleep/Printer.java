package com.seecen.exam.day0929.sleep;

/**
 * sleep ����Thread��ķ����������ͷ���������д�ڷ�ͬ������ sleep���봫��˯��ʱ�� wait
 * ����Obect��ķ��������ͷ�������Ҫ��ͬ�����У�������׳��쳣 wait���Դ���ʱ�䣬Ҳ���Բ�����
 * ����������˯�ߣ�����״̬��,�������߳�notify���ѡ�
 * 
 * @author bigpig
 *
 */
public class Printer {
	private int flag;

	public Printer() {
		flag = 0;
	}

	public synchronized void printerName(int index) {
		try {

			if (flag == index) {
				for (int j = 0; j < 5; j++) {
					for (int i = 0; i < MyThread.NAMES[index].length(); i++) {
						System.out.print(MyThread.NAMES[index].charAt(i));
					}
					System.out.println();
					Thread.sleep(300);
				}
				flag++;
			}
			if (flag == MyThread.NAMES.length) {
				flag = 0;
			}
			this.notifyAll();
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
