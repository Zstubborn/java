package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * file description ArrayListµÄ±éÀú
 * 
 * @author zzhao
 * @version 1.0.0 ArrayListTest.java 2015-8-5 ÏÂÎç4:00:38
 */
public class ArrayListTest {
	
	public static void main(String[] args){
		
		List<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		
		//1
		for(String str : al){
			System.out.println(str);
		}
		
		//2
		Iterator<String> it = al.iterator();
		while(it.hasNext()){
			String value = it.next();
			System.out.println(value);
		}
		
	}

}
