package com.binary;

/**
 * description 用二分查找法判断任意整数在任意整数数组里面是否存在，若存在就返回它在数组中的索引位置，不存在返回-1
 * @author zzhao
 * @version 1.0.0 BinarySerch.java 2015-7-24 下午6:17:37
 */
public class BinarySerch {
	
	public static void main(String[] args){
		int[] a = new int[]{5,3,6,9,1,8,5,23};
		BinarySerch bs = new BinarySerch();
		System.out.println(bs.binarySearch(a,89));
	}
	
	// 方法1
	public int binarySearch(int[] dataset, int data, int beginIndex, int endIndex) {
		// 如果查找的数要比开始索引的数据要小或者是比结束索引的书要大，或者开始查找的索引值大于结束的索引值返回-1没有查到
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

	// 方法2
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
