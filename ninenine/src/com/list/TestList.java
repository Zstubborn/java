package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 
 * file description 1) ��//1 ���Ĵ��벹��������Ҫ�����list ������Ԫ�ص�����
                    2) д������ִ�еĽ��
                    3) ���Ҫ��ʵ������ArrayList ��ΪLinkedList��Ӧ�ø����ArrayList(����) ��
                       LinkedList������ ʹ������ʲô����ʵ������ʲô����
                    4) ���Ҫ��ʵ������ArrayList ��ΪVector��Ӧ�ø����ArrayList ��Vector ʹ
                                                         ������ʲô����ʵ������ʲô����
 * 
 * @author zzhao
 * @version 1.0.0 TestList.java 2015-8-4 ����2:34:51
 */
public class TestList {

	public static void main(String[] args) {
//		List list = new ArrayList();
//		list.add("Hello");
//		list.add("World");
//		list.add(1, "Learn");
//		list.add(1, "Java");
//		printList(list);
		
		List list = new LinkedList();
		list.add("Hello");
		list.add("World");
		list.add(1, "Learn");
		list.add(1, "Java");
		printList(list);
	}

	public static void printList(List list) {
		// 1�����list ������Ԫ�ص�����
		System.out.println(list.get(1));
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}
