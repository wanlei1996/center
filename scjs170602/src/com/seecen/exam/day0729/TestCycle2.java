package com.seecen.exam.day0729;

//import java.util.Scanner;
/**
 * ����ѭ����һЩѭ���ľ��䰸��
 * @author Administrator
 */
public class TestCycle2 {
	public static void main(String[] args) {
		/*	1.������ת:
			1)String str=""+value1%10+value1/10%10+value1/100%10+value1/1000%10+value1/10000%10;
			  System.out.println("��ת֮���������:"+ str);
			2)int value1 = 123456789;
			  int value2 ;
			  while(value1/1!=0){
				  value2 =  value1 % 10;//ȡ��ĩβһλ
				  System.out.print(value2);
				  value1 = value1 / 10 ; //�õ���ĩβ��ǰnλ
			  }
			2.���� һ�����ֵ����б��ʽ
			Scanner sc = new Scanner(System.in);
			System.out.print("������һ����:");
			int num = sc.nextInt();
			System.out.println("����"+num+"�ı��ʽ��:");
			for (int i = 0 ; i <= num; i++) {
				//(num-i)+i=num,ѭ��i+1��
				System.out.println(i+"+"+(num-i)+"="+num);
			}
			3.����nλ�˿ͣ�������ڻ�С��30�ĸ�����
			Scanner sc = new Scanner(System.in);
			int age , count1 = 0, count2 = 0;
			System.out.print("������˿͵�λ��:");
			double num = sc.nextDouble();
			for (int i = 0; i < num; i++) {
				System.out.print("�������"+(i+1)+"λ�˿͵�����:");
				age = sc.nextInt();
				//�������������ֱ������������
				if(age>30)	count1++;
				if(age<30)	count2++;
			}
			//num������double���ͣ����򲻻����С������һֱ��0
			String par1 = (count1/num*100)+"%";
			String par2= (count2/num*100)+"%";
			System.out.println("30�����ϵı�����:"+ par1);
			System.out.println("30�����µı�����:"+ par2);
			4.ģ����ӿͻ���Ϣ
			Scanner sc = new Scanner(System.in);
			System.out.println("Myshopping����ϵͳ>�ͻ���Ϣ����ϵͳ>��ӿͻ���Ϣ");
			System.out.print("����������¼����Ϣ�Ŀͻ�����:");
			int num = sc.nextInt();
			for (int i = 0; i < num; i++) {
				System.out.println("��" + (i + 1) + "λ�ͻ���Ϣ����¼��:");
				System.out.println("�������Ա��(<4λ����>):");
				int IdNum = sc.nextInt();
				System.out.println("�������Ա����(��/��<����λ������ʾ>):");
				String birth = sc.next();
				System.out.println("�������Ա����:");
				int score = sc.nextInt();
				// �жϻ�Ա���Ƿ�Ϊ4λ����
				if (IdNum >= 1000 && IdNum <= 9999) {
					System.out.println("��¼��Ļ�Ա��Ϣ��:");
					System.out.println("��Ա��\t��Ա����\t��Ա����");
					System.out.println(IdNum + "\t" + birth + "\t" + score);
				} else {
					System.out.println("��Ա��" + IdNum + "����Ч�Ļ�Ա��!");
					System.out.println("¼����Ϣʧ�ܣ�������¼��!");
				}
			}
			System.out.println("¼��ͻ���Ϣ��ϣ��������!");
			sc.close();
			5.�ֱ��ڲ�ͬ�������·������ͳ���ܹ������·�������
			Scanner sc = new Scanner(System.in);
			int shopCount = 5;
			String answer = null;
			int sum = 0;
			for (int i = 1; i <= shopCount; i++) {
				int count = 0;
				System.out.println("��ӭ���ٵ�" + i + "�ҵ�:");
				do {
					System.out.print("Ҫ�뿪��(y/n):");
					answer = sc.next();
					if (answer.equals("n")) {
						sum++;
						count++;
						System.out.println("���ڵ�" + i + "�ҵ�����" + count + "���·�����");
					}
				} while (answer.equals("n"));
			}
			System.out.println("����"+shopCount+"�ҵ��й�������" + sum + "���·���");
			sc.close();
			*/
		//��ӡ�žų˷���
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
