package com.seecen.exam.day0928;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/**
 * IO��: ������ ������������� ���� �ϴ� �����ͣ� �ֽ������ַ���
 * �ֽ���������InputStream->FileInputStream(BufferedInputStream)
 * �ֽ��������OutputStream->FileOutputStream(BufferedOutputStream) (�����ֽ�)
 * �ַ���������Reader->FileReader(BufferedReader)
 * �ַ��������Writer->FileWriter(BufferedWriter) (�����ַ���Ϊ��ȡ���Ķ���)
 * ʹ��ʱ����������ϻ�����(����4���������Ӧ�Ļ�����)�����ٶ�Ӳ�̵��˺�
 */
public class TestFileIO {
	public static void main(String[] args) throws IOException {
		/*
		 * readFile();
		 * wirteFile();
		 * copyFile();
		 * File file = new File("D:\\Executable-software\\Virtual Machines");
		 * printFile(file, 0);
		 * readFile1(); 
		 * wirteFile1(); 
		 * copyFile1();
		 */
		readConvert();
	}

	/**
	 * �ֽ���FileInputStream���ļ�(���ֽ���������Ӳ���ж��ļ�)
	 * 
	 * @throws IOException
	 */
	public static void readFile() throws IOException {
		File file = new File("d:" + File.separator + "test.txt");
		InputStream is = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(is, 1024 * 1024);
		byte[] b = new byte[1024];
		int len = 0;
		// һ�ζ�2���ֽ�,��lenΪ-1ʱ����ʾ�Ѿ�����
		while ((len = bis.read(b)) != -1) {
			// ��������ֽ��������ַ������
			String str = new String(b, 0, len);
			System.out.print(str);
		}
		bis.close();
	}

	/**
	 * �ַ���FileReader���ļ�(���ַ���������Ӳ���ж��ļ�)
	 * 
	 * @throws IOException
	 */
	public static void readFile1() throws IOException {
		File file = new File("d:" + File.separator + "test.txt");
		Reader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader,1024 * 1024);
		char[] c = new char[1024];
		int len = 0;
		// һ�ζ�3���ַ�,��lenΪ-1ʱ����ʾ�Ѿ�����
		while ((len = br.read(c)) != -1) {
			// ��������ֽ��������ַ������
			String str = new String(c, 0, len);
			System.out.print(str);
		}
		br.close();
	}

	/**
	 * �ֽ���FileOutputStreamд�ļ�(���ֽ��������Ӳ����д�ļ�)
	 * 
	 * @throws IOException
	 */
	public static void wirteFile() throws IOException {
		File source = new File("d:" + File.separator + "test.txt");
		File file = new File("d:" + File.separator + "test");
		// �����Ŀ¼������,�ʹ�����Ŀ¼
		if (!file.exists()) {
			file.mkdir();
		}
		File file1 = new File(file, "my.txt");
		// ������ļ�������,�ʹ������ļ�
		if (!file1.exists()) {
			file1.createNewFile();
		}
		InputStream is = new FileInputStream(source);
		BufferedInputStream bis = new BufferedInputStream(is,1024 * 1024);
		// true��������ں���׷��
		OutputStream out = new FileOutputStream(file1, true);
		BufferedOutputStream bos = new BufferedOutputStream(out,1024 * 1024);

		// out.write("С��".getBytes());
		byte[] b = new byte[1024];
		int len = 0;
		while ((len = bis.read(b)) != -1) {
			bos.write(b, 0, len);
		}
		bis.close();
		//���ݻ�����ʣ�������
		bos.flush();
		bos.close();
	}

	/**
	 * �ַ���FileWriterд�ļ�(���ַ��������Ӳ����д�ļ�)
	 * 
	 * @throws IOException
	 */
	public static void wirteFile1() throws IOException {
		File source = new File("d:" + File.separator + "test.txt");
		File file = new File("d:" + File.separator + "test");
		// �����Ŀ¼������,�ʹ�����Ŀ¼
		if (!file.exists()) {
			file.mkdir();
		}
		File file1 = new File(file, "my.txt");
		// ������ļ�������,�ʹ������ļ�
		if (!file1.exists()) {
			file1.createNewFile();
		}
		Reader reader = new FileReader(source);
		BufferedReader br = new BufferedReader(reader,1024 * 1024);
		// true��������ں���׷��
		Writer write = new FileWriter(file1, true);
		BufferedWriter bw = new BufferedWriter(write,1024 * 1024);
		char[] c = new char[1024];
		int len = 0;
		while ((len = br.read(c)) != -1) {
			bw.write(c, 0, len);
		}
		br.close();
		//���ݻ�����ʣ�������
		bw.flush();
		bw.close();
	}

	/**
	 * ��D���е�test.txt�ļ����Ƶ�E�̵ĸ�Ŀ¼��(���ֽ���FileInputStream��BufferedOutputStream)
	 * 
	 * @throws IOException
	 */
	public static void copyFile() throws IOException {
		File source = new File("d:" + File.separator + "test.txt");
		File desc = new File("e:" + File.separator + "test.txt");
		// ������ļ�������,�ʹ������ļ�
		if (!desc.exists())
			desc.createNewFile();
		// ����Դ�ļ�����������Ϊ���������ϻ�����
		InputStream is = new FileInputStream(source);
		BufferedInputStream bis = new BufferedInputStream(is,1024 * 1024);
		// ����Ŀ���ļ����������Ϊ��������ϻ�����
		OutputStream out = new FileOutputStream(desc);
		BufferedOutputStream bos = new BufferedOutputStream(out,1024 * 1024);

		byte[] b = new byte[1024];
		int len = 0;
		while ((len = bis.read(b)) != -1) {
			bos.write(b, 0, len);
		}
		// �ͷ���Դ
		is.close();
		//���ݻ�����ʣ�������
		bos.flush();
		bos.close();
	}

	/**
	 * ��D���е�test.txt�ļ����Ƶ�E�̵ĸ�Ŀ¼��(���ַ���FileReader��FileWriter)
	 * 
	 * @throws IOException
	 */
	public static void copyFile1() throws IOException {
		File source = new File("d:" + File.separator + "test.txt");
		File desc = new File("e:" + File.separator + "test.txt");
		// ������ļ�������,�ʹ������ļ�
		if (!desc.exists())
			desc.createNewFile();
		// ����Դ�ļ�����������Ϊ���������ϻ�����
		Reader reader = new FileReader(source);
		BufferedReader br = new BufferedReader(reader,1024 * 1024);
		// ����Ŀ���ļ����������Ϊ��������ϻ�����
		Writer write = new FileWriter(desc);
		BufferedWriter bw = new BufferedWriter(write,1024 * 1024);

		char[] c = new char[1024];
		int len = 0;
		while ((len = br.read(c)) != -1) {
			bw.write(c, 0, len);
		}
		// �ͷ���Դ
		br.close();
		//���ݻ�����ʣ�������
		bw.flush();
		bw.close();
	}
	/**
	 * ��InputStreamReader���ֽ���ת��Ϊ�ַ���
	 * @throws IOException
	 */
	public static void readConvert() throws IOException {
		InputStream is = new FileInputStream(new File("d:" + File.separator + "test.txt"));
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		while (true) {
			String s = br.readLine();
			if (s == null) {
				break;
			}
			System.out.println(s);
		}
		br.close();
	}
	
	/**
	 * ��ӡ�ļ���(����һ���ļ�,��ӡ�����ļ��µ������ļ��ṹ)
	 * 
	 * @param file
	 *            Ҫ��ӡ���ļ�
	 * @param level
	 *            ����Ŀ¼��Ĭ�ϴ�0��ʼ(ָ���ļ�Ϊһ��Ŀ¼)
	 * @throws IOException
	 */
	public static void printFile(File file, int level) throws IOException {
		// ����Ŀ¼�ʹ�ӡ����-
		for (int i = 0; i < level; i++) {
			System.out.print("-");
		}
		// �����ǰ�ļ���
		System.out.println(file.getName());
		// �ж��Ƿ�ΪĿ¼���Ǿ��г���Ŀ¼�µ������ļ����ٱ����ݹ���ø÷���
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				// �ݹ����
				printFile(f, level + 1);
			}
		}
	}
}
