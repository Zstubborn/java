package com.weishu;

import java.util.Date;

public class WeiShu {
	public static void main(String[] args) {
		// 取一个整数a从右端开始的4～7位
		//weishu();
		f(11);
	}
	public static void weishu() {
		int a = 0;
		long b = 1874567887;
		a = (int) (b % Math.pow(10, 7) / Math.pow(10, 3));
		System.out.println(a);
	}
	
	//编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n
	public static void f(float n){
		long pre =  System.currentTimeMillis();
		System.out.println();
		float num = 0;
		float temp = 0;
		for(float i = n; i > 0; i=i-2){
			num = 1 / i;
			temp+=num;
			System.out.print("1" + "/" + i + "=" + num + " ");
		}
		System.out.println("\r\n" + "temp:" + temp);
		long post = System.currentTimeMillis();
		System.out.println("时间：" + (post - pre) + "ms");
		
	}
}
