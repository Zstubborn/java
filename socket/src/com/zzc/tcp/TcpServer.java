package com.zzc.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	/** 
	 * ������-�����
	 *
	 * @autor: Administrator  2015-9-17 ����11:28:28
	 * @param args    
	 * @return void 
	 */
	public static void main(String[] args) {
		/*ServerSocket ss = null;
		Socket socket = null;
		InputStream in = null;
		OutputStream os = null;
		
		try {
			//����10000�˿�
			ss = new ServerSocket(10000);
			
			//��õ�ǰ���ӵ��������˵Ŀͻ�������
			socket = ss.accept();
			
			in = socket.getInputStream();
			os = socket.getOutputStream();
			byte[] b = new byte[1024];
			int n = in.read(b);
			os.write(b, 0, n);
			System.out.println("�ͻ��˷�������Ϊ��" + new String(b,0,n));
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				in.close();
				os.close();
				socket.close();
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
		//import java.net.ServerSocket;
		//import java.net.Socket;
		/**
		 * ֧�ֶ�ͻ��˵ķ�������ʵ��
		 */
		//public class MulThreadSocketServer {
		 //        public static void main(String[] args) {
		                   ServerSocket serverSocket = null;
		                   Socket socket = null;
		                   //�����˿ں�
		                   int port = 10000;
		                   try {
	                            //��������
	                            serverSocket = new ServerSocket(port);
	                            System.out.println("��������������");
                            while(true){
	                             //�������
	                             socket = serverSocket.accept();
	                             //�����߳�
	                             new LogicThread(socket);
		                            }
		                   } catch (Exception e) {
		                            e.printStackTrace();
		                   }finally{
	                            try{
	                                     //�ر�����
	                                     serverSocket.close();
	                            }catch(Exception e){}
		                   }
		         }
	//	}
		
	//}

}
