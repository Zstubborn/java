package com.zzc.linkedlist;

public class Node {

	/**
	 * �����÷����Ĺ��ܼ��㷨����
	 * 
	 * @autor: zzhao 2015-9-19 ����12:36:10
	 * @param args
	 * @return void
	 */
	protected Node next; // ָ����
	protected int data;// ������

	public Node(int data) {
		this.data = data;
	}

	// ��ʾ�˽ڵ�
	public void display() {
		System.out.print(data + " ");
	}

}
