package com.seecen.exam.day0731;

import java.util.Scanner;
/**
 * �����еĸ�������������ز���һ���¸���
 * compareToIgnoreCase 
 * 1)�Ƚ�ǰ��λ�ã����Դ�Сд
 * 2)��ǰ��Ϊ������ �ں���Ϊ����
 * 3)��˳��Ƚϣ���һ����ͬ���ȵڶ������Դ�����
 * @author Administrator
 */
public class InsertMusic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = null;
		do{
			String[] musics = { "Island", "Ocean", "Pretty", "Sun" };
			System.out.print("������Ҫ����ĸ������ƣ�");
			String music = sc.next();
			// �����û�����ĸ�������,�ҳ�Ҫ�����λ��,index��ʼֵΪ��������һ��λ��
			int index = musics.length;
			for (int i = 0; i < musics.length; i++) {
				//����������ʱ,musicӦ���ǳ������������һ��λ��֮ǰ��λ��
				if (music.compareToIgnoreCase(musics[i]) < 0) {
					index = i;
					break;
				}
			}
			// ����һ��������,������������ݿ�����������
			String[]  newMusics = new String[musics.length + 1];
			/*for (int i = 0; i < musics.length; i++) {
				newMusics[i] = musics[i];
			}*/
			System.arraycopy(musics, 0, newMusics, 0, musics.length);
			// ����������Ҫ�����λ��index֮�������ȫ��������һ��λ��,�Ӻ��濪ʼ��
			for (int i = newMusics.length - 1; i > index; i--) {
				newMusics[i] = newMusics[i - 1];
			}
			// ����������ֲ��뵽�������е�indexλ��ȥ
			newMusics[index] = music;
			// �����������
			for (int i = 0; i < newMusics.length; i++) {
				System.out.print(newMusics[i] + " ");
			}
			System.out.println("");
			System.out.print("���Ƿ�Ҫ�����������(y/n):");
			answer = sc.next();
		}while(answer.equalsIgnoreCase("y"));
		System.out.println("������ϣ�ϵͳ�˳�!");
		sc.close();
	}
}
