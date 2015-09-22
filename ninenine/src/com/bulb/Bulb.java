package com.bulb;

import org.junit.Test;

/**
 * description 10盏灯初始状态为暗，一个人顺次按动开关，每走一次后少按一盏灯，求最后10盏灯的状态
 * @author zzhao
 * @version 2015-7-24 下午6:11:58
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
