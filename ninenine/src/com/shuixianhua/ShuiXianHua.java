package com.shuixianhua;

public class ShuiXianHua {
	
	public static void shuixianhua(){
		int x = 0,y = 0,z = 0;
		for(int i = 100; i <= 999;i++){
			x = i / 100;
			y = (i % 100) / 10;
			z = i % 10;
			if(i == x*x*x+y*y*y+z*z*z){
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args){
		shuixianhua();
	}

}
