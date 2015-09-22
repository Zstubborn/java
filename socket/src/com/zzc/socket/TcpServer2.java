package com.zzc.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer2 {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(8099);
        
        Socket s=ss.accept();
        
        System.out.println(s.getInetAddress().getHostAddress()+"...connection");
        //��ȡ�ͻ�����Ϣ��������
        InputStream in=s.getInputStream();
        
        BufferedReader brin=new BufferedReader(new InputStreamReader(in));
        //��ͻ��˷�����Ϣ�����
        BufferedWriter brout=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        
        String line=null;
        
        while((line=brin.readLine())!=null){
            System.out.println("client:"+line);
            
            brout.write(line.toUpperCase());
            brout.newLine();
            brout.flush();
            
        }
        s.close();
        ss.close();

    }

}