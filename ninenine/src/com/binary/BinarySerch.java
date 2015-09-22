package com.binary;

/**
 * description �ö��ֲ��ҷ��ж����������������������������Ƿ���ڣ������ھͷ������������е�����λ�ã������ڷ���-1
 * @author zzhao
 * @version 1.0.0 BinarySerch.java 2015-7-24 ����6:17:37
 */
public class BinarySerch {
	
	public static void main(String[] args){
		int[] a = new int[]{5,3,6,9,1,8,5,23};
		BinarySerch bs = new BinarySerch();
		System.out.println(bs.binarySearch(a,89));
	}
	
	// ����1
	public int binarySearch(int[] dataset, int data, int beginIndex, int endIndex) {
		// ������ҵ���Ҫ�ȿ�ʼ����������ҪС�����ǱȽ�����������Ҫ�󣬻��߿�ʼ���ҵ�����ֵ���ڽ���������ֵ����-1û�в鵽
		int midIndex = (beginIndex + endIndex) / 2; 
		if (data < dataset[beginIndex] || data > dataset[endIndex] || beginIndex > endIndex) {
			return -1;
		}
		if (data < dataset[midIndex]) {
			return binarySearch(dataset, data, beginIndex, midIndex - 1);
		} else if (data > dataset[midIndex]) {
			return binarySearch(dataset, data, midIndex + 1, endIndex);
		} else {
			return midIndex;
		}
	}

	// ����2
	public int binarySearch(int[] dataset, int data) {
		int beginIndex = 0;
		int endIndex = dataset.length - 1;
		int midIndex = -1;
		if (data < dataset[beginIndex] || data > dataset[endIndex] || beginIndex > endIndex) {
			return -1;
		}
		while (beginIndex <= endIndex) {
			midIndex = (beginIndex + endIndex) / 2;
			if (data < dataset[midIndex]) {
				endIndex = midIndex - 1;
			} else if (data > dataset[midIndex]) {
				beginIndex = midIndex + 1;
			} else {
				return midIndex;
			}
		}
		return -1;
	}

}
