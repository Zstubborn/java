package com.zzc.cache;

import java.util.ArrayList;

public class Test {

	/** 
	 *
	 * @autor: zzhao  2015-8-14 обнГ3:52:00
	 * @param args    
	 * @return void 
	 */
	public static void main(String[] args) {
		CacheManager.putCache("zzc", new Cache("1","Hello"));
		System.out.println(CacheManager.getCacheSize());
		System.out.println(CacheManager.getCacheValue("zzc").getValue());
		ArrayList<String> al = CacheManager.getCacheAllKey();
		for(String s : al){
			System.out.println(s.toString());
		}
	}

}
