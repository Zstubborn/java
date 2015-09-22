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
	
	//有5个人坐在一起，问第五个人多少岁？
	public int fac(int n){
		
		if(n == 1){
			return 10;
		}
		
		return 2 + fac(n - 1);
	}
	
	//有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。
	//问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个人多大？
	public void test(int num){
		int len = 0;
		while(num != 0){
			   len++;
			   System.out.print(num % 10);
			   num /= 10;
			  }
			  System.out.println("这是一个" + len + "位数");
	}
	
	public static void main(String[] args){
		int num = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("请输入N的值（输入exit退出）："));
		System.out.print(num + "=");
		zhiyinshu(num);
	}
}
