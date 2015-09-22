package com.iterator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * file description map集合的两种遍历方式
 * @author zzhao
 * @version 1.0.0 IteratorTest.java 2015-8-5 下午2:58:47
 */
public class IteratorTest {
	
	//ArrayList，LinkedList，HashMap三个集合  （常用）
	public static void main(String[] args){
		
		Map<Integer,String> map = new HashMap<Integer, String>();
		
		map.put(1, "zhao");
		map.put(2, "zhi");
		map.put(3, "chao");
		
		//一 慢
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()){
			int key = it.next();
			String value = map.get(key);
			System.out.println(value);
		}
		
		//二 快
		Iterator<Entry<Integer,String>> it1 = map.entrySet().iterator();
		while(it1.hasNext()){
			Entry<Integer,String> entry = it1.next();
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
			
		}
		
	}

}
