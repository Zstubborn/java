package com.zzc.socket;

import java.net.Socket;
import java.io.*;

public class TcpClient2 {

	/**
	 * System.in ���ܴӿ���̨������ֽ�
	 * new InputStreamReader(System.in);
	 * ����һ��InputStreamReader����,����������ֽ���ͨ���ַ�������������ʹ��ָ���� charset ��ȡ�ֽڲ��������Ϊ�ַ���
	 * new BufferedReader(new InputStreamReader(System.in)); ����һ���ַ����Ļ��棬�������ڿ���̨������ֽ�ת����ɵ��ַ���
	 * str=buf.readLine();����������ж�ȡһ�е�����
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		Socket s = new Socket("127.0.0.1", 8099);
		// ��ȡ����¼��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// �����������������
		OutputStream out = s.getOutputStream();

		BufferedWriter bwout = new BufferedWriter(new OutputStreamWriter(out));
		// ��ȡ�������˷��ص�����
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