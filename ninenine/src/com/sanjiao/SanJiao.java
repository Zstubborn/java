package com.sanjiao;

import java.util.Scanner;

/**
 * 
 * file description 杨辉三角
 * 
 * @author zzhao
 * @version 1.0.0 SanJiao.java 2015-8-4 上午11:04:57
 */
public class SanJiao {

	public static void main(String[] args) {
		//sanjiao();
		zsanjiao();
		
	}
	//直角
	public static void zsanjiao() {
		int triangle[][] = new int[10][];// 创建二维数组
		// 遍历二维数组的第一层
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = new int[i + 1];// 初始化第二层数组的大小
			// 遍历第二层数组
			for (int j = 0; j <= i; j++) {
				// 将两侧的数组元素赋值为1
				if (i == 0 || j == 0 || j == i) {
					triangle[i][j] = 1;
				} else {// 其他数值通过公式计算
					triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
				}
				System.out.print(triangle[i][j] + "\t"); // 输出数组元素
			}
			System.out.println(); // 换行
		}
	}

	//等腰
	public static void sanjiao() {
		System.out.println("输入想输入的行数：");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int arr[][] = new int[n][n];
		// 为每行第一个数和最后一个数赋值为1
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][0] = 1;
				arr[i][i] = 1;
			}
		}

		// 为其余位置添加数
		for (int i = 2; i < n; i++) {
			for (int j = 1; j <= i-1; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
			}
		}
		
		for (int i = 0; i < n; i++) {
			int num = n - i;
			//没有数的位置打印空格
			for(int j = 0; j <= num; j++){
				System.out.print(" ");
			}
			//打印数组
			for(int k = 0; k <= i; k++){
				System.out.print(arr[i][k] + " ");
			}
			System.out.println();
		}
	}
}
