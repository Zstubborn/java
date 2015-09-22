package com.zzc.linkedlist;

public class Node {

	/**
	 * 描述该方法的功能及算法流程
	 * 
	 * @autor: zzhao 2015-9-19 下午12:36:10
	 * @param args
	 * @return void
	 */
	protected Node next; // 指针域
	protected int data;// 数据域

	public Node(int data) {
		this.data = data;
	}

	// 显示此节点
	public void display() {
		System.out.print(data + " ");
	}

}
