package com.zhiyinshu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ZhiYinShu {
	
	public static void zhiyinshu(int num){
		for(int i = 2;i < num/2;i++){
			if(num%i==0){
				System.out.println(i+"*");
				zhiyinshu(num/i);
			}
		}
		System.out.println(num);
		System.exit(0);
	}
	
	//��5��������һ���ʵ�����˶����ꣿ
	public int fac(int n){
		
		if(n == 1){
			return 10;
		}
		
		return 2 + fac(n - 1);
	}
	
	//��5��������һ���ʵ�����˶����ꣿ��˵�ȵ�4���˴�2�ꡣ�ʵ�4������������˵�ȵ�3���˴�2�ꡣ
	//�ʵ������ˣ���˵�ȵ�2�˴����ꡣ�ʵ�2���ˣ�˵�ȵ�һ���˴����ꡣ����ʵ�һ���ˣ���˵��10�ꡣ���ʵ�����˶��
	public void test(int num){
		int len = 0;
		while(num != 0){
			   len++;
			   System.out.print(num % 10);
			   num /= 10;
			  }
			  System.out.println("����һ��" + len + "λ��");
	}
	
	public static void main(String[] args){
		int num = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("������N��ֵ������exit�˳�����"));
		System.out.print(num + "=");
		zhiyinshu(num);
	}
}
