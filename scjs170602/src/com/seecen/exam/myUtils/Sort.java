package com.seecen.exam.myUtils;

public class Sort {
	public static void main(String[] args) {
		/*
		 * int[] nums = new int[] { 25, 45, 67, 89, 134, 345 };
		 * System.out.println("�����������е�����Ϊ:" + binarySearch(nums, 134));
		 * 
		 */
		//����MD5���ܣ�MD5�����ǲ������
		String oldPwd = "fdsafsaffdasfsadfadsff";
		String newPwd = MD5Util.encode(oldPwd);
		System.out.println(newPwd);
		
	}

	/**
	 * ���ַ�����
	 * 
	 * @param array
	 *            �Ѿ��ź��������
	 * @param num
	 *            Ҫ���ҵ�����
	 * @return �鵽���ظ����������е����������򷵻�-1
	 */
	public static int binarySearch(int[] array, int num) {
		int low = 0, high = array.length - 1, mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (num < array[mid]) {
				high = mid - 1;
			} else if (num > array[mid]) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	/**
	 * ð������: �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
	 * ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û����������� ������е�Ԫ���ظ����ϵĲ��裬�������һ����
	 * ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ�
	 * 
	 */
	public static void bubbleSort(int[] numbers) {
		int temp; // ��¼��ʱ�м�ֵ
		int size = numbers.length; // �����С
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (numbers[i] < numbers[j]) { // ����������λ��
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}

	/**
	 * ��������:������������һ��Ԫ�أ���Ϊ����׼��.
	 * �����������У�����Ԫ�رȻ�׼ֵС�İڷ��ڻ�׼ǰ�棬����Ԫ�رȻ�׼ֵ��İ��ڻ�׼�ĺ��棨��ͬ�������Ե���һ�ߣ���������ָ�֮��
	 * �û�׼���������λ�á������Ϊ�ָpartition�������� �ݹ�ذ�С�ڻ�׼ֵԪ�ص������кʹ��ڻ�׼ֵԪ�ص�����������
	 */
	public static void quickSort(int[] numbers, int start, int end) {
		if (start < end) {
			int base = numbers[start]; // ѡ���Ļ�׼ֵ����һ����ֵ��Ϊ��׼ֵ��
			int temp; // ��¼��ʱ�м�ֵ
			int i = start, j = end;
			do {
				while ((numbers[i] < base) && (i < end))
					i++;
				while ((numbers[j] > base) && (j > start))
					j--;
				if (i <= j) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
					i++;
					j--;
				}
			} while (i <= j);
			if (start < j)
				quickSort(numbers, start, j);
			if (end > i)
				quickSort(numbers, i, end);
		}
	}

	/**
	 * ѡ������:��δ�����������ҵ���СԪ�أ���ŵ��������е���ʼλ�á�
	 * �ٴ�ʣ��δ����Ԫ���м���Ѱ����СԪ�أ�Ȼ��ŵ���������ĩβ���Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ�
	 */
	public static void selectSort(int[] numbers) {
		int size = numbers.length, temp;
		for (int i = 0; i < size; i++) {
			int k = i;
			for (int j = size - 1; j > i; j--) {
				if (numbers[j] < numbers[k])
					k = j;
			}
			temp = numbers[i];
			numbers[i] = numbers[k];
			numbers[k] = temp;
		}
	}

	/**
	 * ��������:�ӵ�һ��Ԫ�ؿ�ʼ����Ԫ�ؿ�����Ϊ�Ѿ������� ȡ����һ��Ԫ�أ����Ѿ������Ԫ�������дӺ���ǰɨ��
	 * �����Ԫ�أ������򣩴�����Ԫ�أ�����Ԫ���Ƶ���һλ�ã��ظ�����3��ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ�ã�����Ԫ�ز��뵽��λ���У� �ظ�����2��
	 */
	public static void insertSort(int[] numbers) {
		int size = numbers.length, temp, j;
		for (int i = 1; i < size; i++) {  
			temp = numbers[i];
			for (j = i; j > 0 && temp < numbers[j -  1]; j--)
				numbers[j] = numbers[j - 1];
			numbers[j] = temp;
		}
	}

	/**
	 * �鲢����:����ռ䣬ʹ���СΪ�����Ѿ���������֮�ͣ��ÿռ�������źϲ�������� �趨����ָ�룬���λ�÷ֱ�Ϊ�����Ѿ��������е���ʼλ��
	 * �Ƚ�����ָ����ָ���Ԫ�أ�ѡ�����С��Ԫ�ط��뵽�ϲ��ռ䣬���ƶ�ָ�뵽��һλ�� �ظ�����3ֱ��ĳһָ��ﵽ����β
	 * ����һ����ʣ�µ�����Ԫ��ֱ�Ӹ��Ƶ��ϲ�����β
	 * 
	 */
	public static void mergeSort(int[] numbers, int left, int right) {
		int t = 1;// ÿ��Ԫ�ظ���
		int size = right - left + 1;
		while (t < size) {
			int s = t;// ����ѭ��ÿ��Ԫ�ظ���
			t = 2 * s;
			int i = left;
			while (i + (t - 1) < size) {
				merge(numbers, i, i + (s - 1), i + (t - 1));
				i += t;
			}
			if (i + (s - 1) < right)
				merge(numbers, i, i + (s - 1), right);
		}
	}

	/**
	 * �鲢�㷨ʵ��
	 * 
	 */
	private static void merge(int[] data, int p, int q, int r) {
		int[] B = new int[data.length];
		int s = p;
		int t = q + 1;
		int k = p;
		while (s <= q && t <= r) {
			if (data[s] <= data[t]) {
				B[k] = data[s];
				s++;
			} else {
				B[k] = data[t];
				t++;
			}
			k++;
		}
		if (s == q + 1)
			B[k++] = data[t++];
		else
			B[k++] = data[s++];
		for (int i = p; i <= r; i++)
			data[i] = B[i];
	}
}
