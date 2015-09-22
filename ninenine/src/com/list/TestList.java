package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 
 * file description 1) 把//1 处的代码补充完整，要求输出list 中所有元素的内容
                    2) 写出程序执行的结果
                    3) 如果要把实现类由ArrayList 换为LinkedList，应该改哪里？ArrayList(数组) 和
                       LinkedList（链表） 使用上有什么区别？实现上有什么区别？
                    4) 如果要把实现类由ArrayList 换为Vector，应该改哪里？ArrayList 和Vector 使
                                                         用上有什么区别？实现上有什么区别？
 * 
 * @author zzhao
 * @version 1.0.0 TestList.java 2015-8-4 下午2:34:51
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
		// 1、输出list 中所有元素的内容
		System.out.println(list.get(1));
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}
