package zzc.com.validate;

public class StringValidate {

	/** 
	 * ��֤��
	 *
	 * @autor: zzhao  2015-9-18 ����9:09:09
	 * @param args    
	 * @return void 
	 */
	public static void main(String[] args) {
		
		StringValidate();
	}
	
	//�ַ����Ľ�ȡ
	public static void StringValidate(){
		String hql = "from a order by b";
		int sqlFrom = hql.indexOf("from");
		int sqlOrderby = hql.indexOf("order by");
		String countStr = "select count(*) " + hql.substring(sqlFrom, sqlOrderby);
		System.out.println(sqlFrom);
		System.out.println(sqlOrderby);
		System.out.println(countStr);
		//Integer�����
		System.out.println("Integer.MAX_VALUE:" + Integer.MAX_VALUE);
	}

}
