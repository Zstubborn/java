package com.zzc.cache;

public class Cache {
	
	private String key; //¼üÖµ
	private Object value; //Êý¾Ý

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public Cache(){}
	
	public Cache(String key,Object value){
		this.key = key;
		this.value = value;
	}

}
