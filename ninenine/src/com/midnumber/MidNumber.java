package com.midnumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//
/** 
 * description 查找无序数组中的中位数
 * @author zzhao
 * @version 1.0.0 MidNumber.java 2015-7-24 下午6:18:57
 */
public class MidNumber {
	//1
	/*public static void main(String args[]) {
		int[] a = new int[] { 1, 1, 2, 2, 8, 6, 9, 5, 7, 10, 4, 3, 6, 49, 30, 29, 6, 4, 98, 56, 25, 47 };
		HashSet<Integer> b = new HashSet<Integer>();
		for (int temp : a) {
			b.add((int) temp);
		}
		List<Integer> f = new ArrayList<Integer>();
		f.addAll(b);
		Collections.sort(f);
		for (Integer temp : f)
			System.out.println(temp);
		int size = f.size();
		boolean num = (boolean) (size % 2 == 0);
		System.out.println(num ? (f.get((size - 1) / 2) + " " + f.get((size + 1) / 2)) : (f.get((size - 1) / 2)));
	}*/ 
	
	//2
	/*public static void main(String args[]){
	  int[] a=new int[]{3,5,2,3,5,9};
	  int mid=a[0];
	  int mid_left=-1;
	  int mid_right=-1;
	  for(int i=1;i<a.length;i++){
	    if(a[i]>mid&&i%2==0){//奇数个且大于
	      if(a[i]<mid_right){
	         mid_left=mid;
	         mid=a[i];
	       }else{
	        mid_left=mid;
	        mid=mid_right;
	        mid_right=a[i];   
	       }
	     
	   }else if(a[i]<mid&&i%2!=0){//偶数个且小于
	     if(a[i]>mid_left){
	         mid_right=mid;
	         mid=a[i];
	       }else{
	        mid_right=mid;   
	        mid=mid_left;
	        mid_left=a[i];

	       }

	   }else if(a[i]<mid&&i%2==0){//奇数个且小于
	      //mid=a[i];
	      if(mid_left==-1)mid_left=a[i];
	      if(a[i]>mid_left)
	      mid_left=a[i];
	   }else if(a[i]>mid&&i%2!=0){//偶数个且大于
	      //mid=a[i];
	     if(mid_right==-1)mid_right=a[i];
	      if(a[i]<mid_right)
	      mid_right=a[i];
	   }else if(a[i]==mid){
	     mid_right=a[i];
	   }

	System.out.println("mid_left:"+mid_left+"  midNum:"+mid+" mid_right:"+mid_right);
	}
	System.out.println("midNum:"+mid);
	}*/
	
	
	//3
	public static void main(String[] args){
		int[] a = new int[]{4,1,5,1,1,8,7,3,2};
		
		//去重
		Set<Integer> s = new HashSet<Integer>();
		for(int aa : a){
			s.add(aa);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(s);
		
		Collections.sort(list);
		
		for(int i : list){
			System.out.print(i +" ");
		}
		
		int size = list.size();
		System.out.println();
		if(size % 2 == 0){
			System.out.println(list.get((size - 1) / 2) + " " + list.get((size + 1) / 2));
		}else{
			System.out.println(list.get(size / 2));
		}
	}
}
