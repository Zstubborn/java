package com.zzc.comparableTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** 
 * 排序接口
 *
 * @autor: zzhao  2015-9-12 下午2:59:59
 * @param args    
 * @return void 
 */
public class ComparableTest {

	public static void main(String[] args) {
		
		//1、数组排序
		int arr[] = {1,7,8,5,2};
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] +" ");
		}
		System.out.println("arr:"+arr);
		
		//2、list排序
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(4);
		
		Collections.sort(list);
		System.out.println(list);
		
		//3、对象排序方法一
		List<ATest> lista = new ArrayList<ATest>();
		
		for(int i = 0; i < 3; i++){
		ATest a = new ATest();
		a.setId(1L + i);
		a.setName("aa" + i);
		a.setAge(10 + i);
		lista.add(a);
		}
		Collections.sort(lista);
		System.out.println(lista);
		
		//4、对象排序方法二
		List<BTest> listb = new ArrayList<BTest>();
			
		for(int i = 0; i < 3; i++){
			BTest b = new BTest();
			b.setId(1L + i);
			b.setName("aa" + i);
			b.setAge(10 + i);
			listb.add(b);
		}
		
		Collections.sort(listb, new Comparator<BTest>(){
			public int compare(BTest o1, BTest o2) {
				if(o1.getId() > o2.getId()){
					return -1;
				}else if(o1.getId() < o2.getId()){
					return 1;
				}else
				return 0;
			}
		});
		System.out.println(listb);
	}
}


