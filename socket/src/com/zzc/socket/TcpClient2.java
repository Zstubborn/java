package com.zzc.socket;

import java.net.Socket;
import java.io.*;

public class TcpClient2 {

	/**
	 * System.in 接受从控制台输入的字节
	 * new InputStreamReader(System.in);
	 * 构造一个InputStreamReader对象,这个对象是字节流通向字符流的桥梁：它使用指定的 charset 读取字节并将其解码为字符。
	 * new BufferedReader(new InputStreamReader(System.in)); 构造一个字符流的缓存，里面存放在控制台输入的字节转换后成的字符。
	 * str=buf.readLine();从这个缓存中读取一行的内容
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		Socket s = new Socket("127.0.0.1", 8099);
		// 获取键盘录入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 数据输出给服务器端
		OutputStream out = s.getOutputStream();

		BufferedWriter bwout = new BufferedWriter(new OutputStreamWriter(out));
		// 获取服务器端返回的数据
		BufferedReader brin = new BufferedReader(new InputStreamReader(s.getInputStream()));

		String line = null;

		while ((line = br.readLine()) != null) {
			if (line.equals("over"))
				break;

			bwout.write(line);
			bwout.newLine();
			bwout.flush();

			String str = brin.readLine();
			System.out.println("server:" + str);

		}
		br.close();
		s.close();

	}

}