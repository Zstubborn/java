package com.zzc.memcache;

import java.io.Serializable;  

public class TestBean implements Serializable{  
    private static final long serialVersionUID = 5344571864700659321L;  
      
    private String name;  
    private Integer age;  
    
	public String getName() {
		System.out.println("name");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
