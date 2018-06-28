package com.seecen.exam.day0928;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
public class Client {
	public static void main(String[] args) throws Exception {
		// �����ͷ�����������
		Socket socket = new Socket("127.0.0.1",9999);
		System.out.println("�ͻ���������");
		while(true) {
			// ����������ȡ���������͹���������
			InputStream is = socket.getInputStream();
			// ���������п���������,����ת��Ϊ�ַ���
			InputStreamReader isr = 
					new InputStreamReader(is);
			BufferedReader br = 
					new BufferedReader(isr);
			// ��ȡһ�з�����������
			String msg = br.readLine();
			System.out.println("server���͵�����Ϊ:" + msg);
			
			// �ͻ�������������������
			String str = input();
			if("88".equals(str)) break;
			socket.getOutputStream().write(str.getBytes());
			socket.getOutputStream().write("\r".getBytes());
		}
		
		
		socket.close();
	}
	
	public static String input() throws Exception {
		/**
		 * System.in : 
		 * ���û�����̨���������תΪ������
		 * InputStreamReader:
		 * ��������תΪ�ַ���,���Լ�������
		 * BufferedReader:
		 * ���ַ����Ļ�����,���ϻ�����*/
		InputStreamReader reader = 
				new InputStreamReader(System.in);
		BufferedReader br = 
				new BufferedReader(reader);
		System.out.print("������:");
		// readLine��ȡһ�е���˼
		// ���û����һ��,��һֱ�ȴ���һ�еĵ���
		// �û����˻س�,������,����Ҳ�Ͷ�����һ����
		String str = br.readLine();
		// ���û���������ݷ��ظ����÷�����
		return str;
	}
}
