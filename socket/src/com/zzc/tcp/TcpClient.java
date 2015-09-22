package com.zzc.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpClient {

	/** 
	 * 网络编程-客户端
	 *
	 * @autor: Administrator  2015-9-17 上午10:36:37
	 * @param args    
	 * @return void 
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws IOException {
		// 创建输入流扫描器
		//Scanner scanner = new Scanner(System.in);
		// 获取用户输入的一行文本
		//String line = scanner.nextLine();
		
		//从控制台获取数据
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		//1建立网络连接
		Socket socket = null;
		OutputStream os = null;
		InputStream in = null;
		try {
			socket = new Socket("127.0.0.1", 10000);
			System.out.println(socket);
			
			//2交换数据;从scoket连接对象获得输出流和输入流对象
			//发送数据
			os = socket.getOutputStream();
			os.write(str.getBytes());
			//接收数据
			in = socket.getInputStream();
			byte[] b = new byte[1024];
			int n = in.read(b);
			System.out.println("服务器反馈：" + new String(b,0,n));
			System.out.println("服务器反馈：" + n);
			System.out.println("服务器反馈：" + b);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				in.close();
				os.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
