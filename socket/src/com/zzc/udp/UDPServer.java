package com.zzc.udp;

import java.net.*;

/**

 * ��UDP�������ˣ�ʵ�ֹ���������ͻ��˷������ݣ�

   �������ַ�����OK"���ͻ���

 */

public class UDPServer {

    public static void main(String[] args) {

             DatagramSocket ds = null; //���Ӷ���

             DatagramPacket sendDp; //�������ݰ�����

             DatagramPacket receiveDp; //�������ݰ�����

             final int PORT = 10010; //�˿�

                 try{

                //�������ӣ������˿�

                ds = new DatagramSocket(PORT);

               System.out.println("����������������");

                //��ʼ����������

                byte[] b = new byte[1024];

                receiveDp = new DatagramPacket(b,b.length);

                //����

                ds.receive(receiveDp);

                //��ȡ�������ݣ������

                InetAddress clientIP = receiveDp.getAddress();

                int clientPort = receiveDp.getPort();

                byte[] data = receiveDp.getData();

                int len = receiveDp.getLength();

                System.out.println("�ͻ���IP��" + clientIP.getHostAddress());

                System.out.println("�ͻ��˶˿ڣ�" + clientPort);

                System.out.println("�ͻ��˷������ݣ�" + new String(data,0,len));

                                                                  

                //���ͷ���

                String response = "OK";

                byte[] bData = response.getBytes();

                sendDp = new DatagramPacket(bData,bData.length,clientIP,clientPort);

                //����

                ds.send(sendDp);

                                       }catch(Exception e){

                e.printStackTrace();

                                       }finally{

                try{

                   //�ر�����

                   ds.close();

                }catch(Exception e){}

                                       }

    }

}

