package lhm.hcy.guge.frameset.cache;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

	/**
	 * ������
	 * @autor: zzhao 2015-8-14 
	 */
	public static void main(String[] args) {
		CacheManager.setSimpleFlag("alksd", false);
		CacheManager.putCache("alksd", new Cache());
		ArrayList<String> al = CacheManager.getCacheAllkey();
		for(String a : al){
			System.out.println(a);
			Object o = CacheManager.getCacheInfo(a).getValue();
			System.out.println(o);
		}
		
//		CacheManager.putCache("alksd", new Cache());
//		CacheManager.putCache("abc", new Cache());
//		CacheManager.putCache("def", new Cache());
//		CacheManager.putCache("ccc", new Cache());
//		CacheManager.clearOnly("");  //���ָ���Ļ���
//		Cache c = new Cache();
//		for (int i = 0; i < 10; i++) {
//			CacheManager.putCache("" + i, c);
//		}
//		CacheManager.putCache("aaaaaaaa", c);
//		CacheManager.putCache("abchcy;alskd", c);
//		CacheManager.putCache("cccccccc", c);
//		CacheManager.putCache("abcoqiwhcy", c);
//		System.out.println("ɾ��ǰ�Ĵ�С��" + CacheManager.getCacheSize());
//		CacheManager.getCacheAllkey();
//		CacheManager.clearAll("aaaa");
//		//CacheManager.clearAll("abc");
//		System.out.println("ɾ����Ĵ�С��" + CacheManager.getCacheSize());
//		CacheManager.getCacheAllkey();
		
		
	}

}
