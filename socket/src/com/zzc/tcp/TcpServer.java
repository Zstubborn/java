package com.zzc.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	/** 
	 * 网络编程-服务端
	 *
	 * @autor: Administrator  2015-9-17 上午11:28:28
	 * @param args    
	 * @return void 
	 */
	public static void main(String[] args) {
		/*ServerSocket ss = null;
		Socket socket = null;
		InputStream in = null;
		OutputStream os = null;
		
		try {
			//监听10000端口
			ss = new ServerSocket(10000);
			
			//获得当前连接到服务器端的客户端连接
			socket = ss.accept();
			
			in = socket.getInputStream();
			os = socket.getOutputStream();
			byte[] b = new byte[1024];
			int n = in.read(b);
			os.write(b, 0, n);
			System.out.println("客户端发送内容为：" + new String(b,0,n));
			
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
		 * 支持多客户端的服务器端实现
		 */
		//public class MulThreadSocketServer {
		 //        public static void main(String[] args) {
		                   ServerSocket serverSocket = null;
		                   Socket socket = null;
		                   //监听端口号
		                   int port = 10000;
		                   try {
	                            //建立连接
	                            serverSocket = new ServerSocket(port);
	                            System.out.println("服务器已启动：");
                            while(true){
	                             //获得连接
	                             socket = serverSocket.accept();
	                             //启动线程
	                             new LogicThread(socket);
		                            }
		                   } catch (Exception e) {
		                            e.printStackTrace();
		                   }finally{
	                            try{
	                                     //关闭连接
	                                     serverSocket.close();
	                            }catch(Exception e){}
		                   }
		         }
	//	}
		
	//}

}
