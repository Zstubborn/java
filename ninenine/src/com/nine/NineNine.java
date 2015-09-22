package com.nine;

/**
 * description 9*9³Ë·¨±í
 * @author zzhao
 * @version 1.0.0 NineNine.java 2015-7-24 ÏÂÎç6:19:25
 */
public class NineNine {

	public void nineNineMulitTable() {
		for (int i = 1, j = 1; j <= 9; i++) {
			System.out.print(i + "*" + j + "=" + i * j + " ");
			if (i == j) {
				i = 0;
				j++;
				System.out.println();
			}
		}
		
		for(int i = 1;i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(i + "*"+ j + "=" +i * j + " ");
				if(i == j){
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args) {
		NineNine ni = new NineNine();
		ni.nineNineMulitTable();
	}
}
