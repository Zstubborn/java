package com.zzc.thread;

public class ThreadTest implements Runnable {

	/** 
	 * �����÷����Ĺ��ܼ��㷨����
	 *
	 * @autor: Administrator  2015-8-18 ����2:27:29
	 * @param args    
	 * @return void 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest tt = new ThreadTest();
		Thread t1 = new Thread(tt);
		Thread t2 = new Thread(tt);
		t1.start();
		t2.start();
		
	}
	
//	public synchronized void run(){
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.print(" " + i);
//		}
//		
//	}
	public void run(){
		synchronized(this){
			for (int i = 0; i < 10; i++) {
				System.out.print(" " + i);
			}
		}
		
	}

}
