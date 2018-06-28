package com.seecen.exam.myUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * �ַ���������
 * 
 * @scjs170602
 * @author �����ڡ�
 * @2017��8��23��
 */
public class StringUtil {
	/**
	 * �ж�һ���ַ�����Ϊ��
	 * 
	 * @param str
	 *            �ַ���
	 * @return ��Ϊ�շ���true,Ϊ�շ���false
	 */
	public static boolean isNotEmpty(String str) {
		if (null != str && !"".equals(str)) {
			return true;
		}
		return false;
	}

	/**
	 * �ж�һ���ַ���Ϊ��
	 * 
	 * @param str
	 *            �ַ���
	 * @return Ϊ�շ���true,��Ϊ�շ���false
	 */
	public static boolean isEmpty(String str) {
		if (!isNotEmpty(str)) {
			return true;
		}
		return false;
	}

	/**
	 * ������תΪ�ַ���
	 * 
	 * @param date
	 *            Ҫת��������
	 * @return ���ظ����ڸ�ʽ����Ķ�Ӧ�ַ���
	 */
	public static String dateToString(Date date) {
		// 24Сʱ��
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 12Сʱ��
		// SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sf.format(date);
	}

	/**
	 * ������תΪ�ַ���
	 * 
	 * @param date
	 *            Ҫת��������
	 * @return ���ظ����ڸ�ʽ����Ķ�Ӧ�ַ���
	 */
	public static String simpleDateToString(Date date) {
		// 124Сʱ��
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		// 12Сʱ��
		// SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sf.format(date);
	}

	/**
	 * ���ַ���תΪ����
	 * 
	 * @param str
	 *            Ҫת�����ַ���
	 * @return ���ظ��ַ�����ʽ���������,�׳��쳣ʱ����null
	 */
	public static Date stringToDate(String str) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return sf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * ���ַ���תΪ����
	 * 
	 * @param str
	 *            Ҫת�����ַ���
	 * @return ���ظ��ַ�����ʽ���������,�׳��쳣ʱ����null
	 */
	public static Date stringToSimpleDate(String str) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * ���ַ���ת��Ϊ����int
	 * 
	 * @param str
	 *            Ҫת�����ַ���
	 * @return �ַ���Ϊ�շ���0�����򷵻ظ��ַ�����Ӧ������
	 */
	public static int convertToInt(String str) {
		if (isNotEmpty(str)) {
			return Integer.parseInt(str);
		} else {
			return 0;
		}
	}

	/**
	 * ���ַ���ת��Ϊ����double
	 * 
	 * @param str
	 *            Ҫת�����ַ���
	 * @return �ַ���Ϊ�շ���0.0�����򷵻ظ��ַ�����Ӧ�ĸ���double
	 */
	public static Double convertToDouble(String str) {
		if (isNotEmpty(str)) {
			return Double.parseDouble(str);
		} else {
			return 0.0;
		}
	}

	/**
	 * ���ַ�������ת��Ϊ����int����
	 * 
	 * @param strs
	 *            Ҫת�����ַ�������
	 * @return �ַ�������Ϊ�շ���null�����򷵻ظ��ַ�����Ӧ����������
	 */
	public static int[] convertToIntArray(String[] strs) {
		if (strs == null || strs.length == 0) {
			return null;
		}
		int[] nums = new int[strs.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}
		return nums;
	}

	/**
	 * ���ַ�������ת��Ϊlist<Integer>����
	 * 
	 * @param strs
	 *            Ҫת�����ַ�������
	 * @return �ַ�������Ϊ�շ���null�����򷵻ظ��ַ�����Ӧ��list<Integer>����
	 */
	public static List<Integer> convertToIntegerList(String[] strs) {
		if (strs == null || strs.length == 0) {
			return null;
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < strs.length; i++) {
			list.add(Integer.parseInt(strs[i]));
		}
		return list;
	}
	/**
	 * ���ַ�������ת��ΪString
	 * @param strs  �ַ�������
	 * @return ����ת��֮����ַ���
	 */
	public static String convertToString(String[] strs) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strs.length; i++) {
			sb.append(strs[i]);
		}
		return sb.toString();
	}
}
