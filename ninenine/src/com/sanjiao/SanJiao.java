package com.sanjiao;

import java.util.Scanner;

/**
 * 
 * file description �������
 * 
 * @author zzhao
 * @version 1.0.0 SanJiao.java 2015-8-4 ����11:04:57
 */
public class SanJiao {

	public static void main(String[] args) {
		//sanjiao();
		zsanjiao();
		
	}
	//ֱ��
	public static void zsanjiao() {
		int triangle[][] = new int[10][];// ������ά����
		// ������ά����ĵ�һ��
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = new int[i + 1];// ��ʼ���ڶ�������Ĵ�С
			// �����ڶ�������
			for (int j = 0; j <= i; j++) {
				// �����������Ԫ�ظ�ֵΪ1
				if (i == 0 || j == 0 || j == i) {
					triangle[i][j] = 1;
				} else {// ������ֵͨ����ʽ����
					triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
				}
				System.out.print(triangle[i][j] + "\t"); // �������Ԫ��
			}
			System.out.println(); // ����
		}
	}

	//����
	public static void sanjiao() {
		System.out.println("�����������������");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int arr[][] = new int[n][n];
		// Ϊÿ�е�һ���������һ������ֵΪ1
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][0] = 1;
				arr[i][i] = 1;
			}
		}

		// Ϊ����λ�������
		for (int i = 2; i < n; i++) {
			for (int j = 1; j <= i-1; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
			}
		}
		
		for (int i = 0; i < n; i++) {
			int num = n - i;
			//û������λ�ô�ӡ�ո�
			for(int j = 0; j <= num; j++){
				System.out.print(" ");
			}
			//��ӡ����
			for(int k = 0; k <= i; k++){
				System.out.print(arr[i][k] + " ");
			}
			System.out.println();
		}
	}
}
