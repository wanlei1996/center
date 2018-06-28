package com.seecen.exam.day0928;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
public class Server {
	public static void main(String[] args) throws Exception {
		// ����һ��socket������ڱ�����9999�˿ں���
		ServerSocket server = new ServerSocket(9999);
		// �ȴ��ͻ��˵�����
		System.out.println("...waiting client...");
		Socket socket = server.accept();
		System.out.println("client connectivity..." + socket);
		while(true) {
			// ����������ĵط�
			String str = input();
			if("88".equals(str)) break;
			// ���������ͻ��˷�������
			socket.getOutputStream()
				.write(str.getBytes());
			// �������,���߱�������������,����.
			socket.getOutputStream()
				.write("\r".getBytes());
			// ���տͻ��˷�����������
			InputStream is = socket.getInputStream();
			// ���������п���������,����ת��Ϊ�ַ���
			InputStreamReader isr = 
					new InputStreamReader(is);
			BufferedReader br = 
					new BufferedReader(isr);
			// ��ȡһ�з�����������
			String msg = br.readLine();
			System.out.println("client���͵�����Ϊ:" + msg);
		}	
		server.close();
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
