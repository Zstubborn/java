package zzc.com.validate;

public class StringValidate {

	/** 
	 * 验证类
	 *
	 * @autor: zzhao  2015-9-18 上午9:09:09
	 * @param args    
	 * @return void 
	 */
	public static void main(String[] args) {
		
		StringValidate();
	}
	
	//字符串的截取
	public static void StringValidate(){
		String hql = "from a order by b";
		int sqlFrom = hql.indexOf("from");
		int sqlOrderby = hql.indexOf("order by");
		String countStr = "select count(*) " + hql.substring(sqlFrom, sqlOrderby);
		System.out.println(sqlFrom);
		System.out.println(sqlOrderby);
		System.out.println(countStr);
		//Integer最大数
		System.out.println("Integer.MAX_VALUE:" + Integer.MAX_VALUE);
	}

}
