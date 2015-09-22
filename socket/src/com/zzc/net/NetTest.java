package com.zzc.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetTest {

	/** 
	 * ������
	 * @autor: Administrator  2015-9-16 ����3:37:35
	 * @param args    
	 * @return void 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		
		//ʹ��������������
		 InetAddress inet1 = InetAddress.getByName("www.163.com");
         System.out.println(inet1);
         
         //ʹ��IP��������
         InetAddress inet2 = InetAddress.getByName("127.0.0.1");
         System.out.println(inet2);
         
         //��ñ�����ַ����
         InetAddress inet3 = InetAddress.getLocalHost();
         System.out.println(inet3);
         
        //��ö����д洢������
         String host = inet3.getHostName();
         System.out.println("������" + host);
         
         //��ö����д洢��IP
         String ip = inet3.getHostAddress();
         System.out.println("IP:" + ip);
	}

}
