package com.seecen.exam.day0728.work;
/**
 * ʹ��do..whileѭ��,������϶�(0-250)����Ӧ�Ļ��϶ȵĶ��ձ�
 * @author Administrator
 */
public class Work2 {
	public static void main(String[] args) {
		int tem = 0 ;
		double oF = 0 ;
		do{
			System.out.println("�����¶�\t\t" + tem + " ��");
			oF = tem * 9 / 5.0 +32  ;
			System.out.println("��Ӧ�Ļ����¶�\t" + oF + " �H");
			tem += 20;
		}while(tem<=250);
	}
}
