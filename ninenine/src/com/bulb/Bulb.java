package com.bulb;

import org.junit.Test;

/**
 * description 10յ�Ƴ�ʼ״̬Ϊ����һ����˳�ΰ������أ�ÿ��һ�κ��ٰ�һյ�ƣ������10յ�Ƶ�״̬
 * @author zzhao
 * @version 2015-7-24 ����6:11:58
 */
public class Bulb {
	
	public static void stringTest(){
		
		StringBuilder hql = new StringBuilder();
		hql.append("form a");
		hql.append(" where c =" + 1);
		System.out.println(hql.toString());
	}
	
	
	public static void main(String[] args) {
		stringTest();
		
		/*int[] a = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int z = 9; z >= 0; z--) {
			for (int i = 0; i <= z; i++) {
				if (z % 2 != 0) {
					a[i] = 1;
				} else {
					a[i] = 0;
				}
			}
		}
		for (int j = 0; j < 10; j++) {
			System.out.print(a[j] + " ");
		}*/
	}
}
