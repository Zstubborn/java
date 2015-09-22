package com.zzc.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/** 
 * ����
 *
 * @autor: zzhao  2015-8-14 ����3:39:55
 * @param args    
 * @return void 
 */
public class CacheManager {
	
	private static HashMap cacheMap = new HashMap();
	
	public static void putCache(String key,Cache cache){
		
		cacheMap.put(key, cache);
		
	}
	
	//�õ������С
	public static int getCacheSize(){
		
		return cacheMap.size();
	}
	
	//�õ����е�key
	public static ArrayList<String> getCacheAllKey(){
		ArrayList<String> al = new ArrayList<String>();
		Iterator it = cacheMap.entrySet().iterator();
		while(it.hasNext()){
			Entry entry = (Entry) it.next();
			String key = (String) entry.getKey();
			al.add(key);
		}
		return al;
	}
	
	//����key�õ�����
	public static Cache getCacheValue(String key){
		Cache cache = (Cache) cacheMap.get(key);
		
		return cache;
	}

}
