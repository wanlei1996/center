package com.seecen.exam.day0802.work;

import java.util.Scanner;

public class ElectricalMachineDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ElectricalMachine refrigerator = new ElectricalMachine();
		refrigerator.name = "\"�·ɱ���\"";//ʹ��ת���ַ�\"�ﵽ��ӡ"��Ч��
		refrigerator.price = 3500;
		
		ElectricalMachine colorTV = new ElectricalMachine();
		colorTV.name = "\"34��ʵ�\"";
		colorTV.price = 4000;
		
		String answer = null ;
		do{
			System.out.print("��������Ҫ �µĵ���(0�������,1����ʵ�):");
			int operator = sc.nextInt();
			if(operator==0){
				//�±���
				for (int i = 4; i > 0 ; i--) {
					//����printMenu������ӡ�˵�
					System.out.print(refrigerator.printMenu(4));
					refrigerator.guessPrice = sc.nextInt();
					//���û��¶��������˳�����
					if(refrigerator.Guess().equals("�¶���!")){
						//�û��¶���������ѭ��
						System.out.println(refrigerator.Guess());
						break;
					}
					//���û�ֻ�����һ�λ���ʱ,��ʾ��Ҫ��һ��
					if(i == 1){
						System.out.println("4����û�в¶ԣ��´�Ŭ����!");
					}else{
						System.out.println(refrigerator.Guess());
					}
				}
			}else{
				//�²ʵ�
				for (int i = 4; i > 0 ; i--) {
					//����printMenu������ӡ�˵�
					System.out.print(refrigerator.printMenu(4));
					colorTV.guessPrice = sc.nextInt();
					//�û��¶���������ѭ��
					if(colorTV.Guess().equals("�¶���!")){
						System.out.println(colorTV.Guess());
						break;
					}
					//���û�ֻ�����һ�λ���ʱ,��ʾ��Ҫ��һ��
					if(i == 1){
						System.out.println("4����û�в¶ԣ��´�Ŭ����!");
					}else{
						System.out.println(colorTV.Guess());
					}
				}
			}
			
			System.out.print("�Ƿ�����¼۸�(y/n):");
			answer = sc.next();
		}while(answer.equals("y"));
		sc.close();
	}

}
