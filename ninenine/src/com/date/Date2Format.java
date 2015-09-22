package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * description 时间的格式化
 * @author zzhao
 * @version 1.0.0 Date2Format.java 2015-7-24 下午6:18:26
 */
public class Date2Format {

	public static void main(String[] args){
		
		Date2Format df = new Date2Format();
		System.out.println(df.d2f(new Date()));
	}
	
	public String d2f(Date date){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		return str;
	}
	
}
