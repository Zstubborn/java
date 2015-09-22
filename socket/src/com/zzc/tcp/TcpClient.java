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
	 * ������-�ͻ���
	 *
	 * @autor: Administrator  2015-9-17 ����10:36:37
	 * @param args    
	 * @return void 
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws IOException {
		// ����������ɨ����
		//Scanner scanner = new Scanner(System.in);
		// ��ȡ�û������һ���ı�
		//String line = scanner.nextLine();
		
		//�ӿ���̨��ȡ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		//1������������
		Socket socket = null;
		OutputStream os = null;
		InputStream in = null;
		try {
			socket = new Socket("127.0.0.1", 10000);
			System.out.println(socket);
			
			//2��������;��scoket���Ӷ����������������������
			//��������
			os = socket.getOutputStream();
			os.write(str.getBytes());
			//��������
			in = socket.getInputStream();
			byte[] b = new byte[1024];
			int n = in.read(b);
			System.out.println("������������" + new String(b,0,n));
			System.out.println("������������" + n);
			System.out.println("������������" + b);
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
