package com.zzc.udp;

import java.net.*;
import java.util.*;
/**
 * �򵥵�UDP�ͻ��ˣ�ʵ����������˷���ϵͳʱ�书��
 */
public class UDPClient {
            public static void main(String[] args) {

                     DatagramSocket ds = null; //���Ӷ���

                     DatagramPacket sendDp; //�������ݰ�����

                DatagramPacket receiveDp; //�������ݰ�����

                     String serverHost = "127.0.0.1"; //������IP

                int serverPort = 10010; //�������˿ں�

                     try{

                        //��������

                        ds = new DatagramSocket();

                        //��ʼ����������

                        Date d = new Date(); //��ǰʱ��

                        String content = d.toString(); //ת��Ϊ�ַ���

                        byte[] data = content.getBytes();

                        //��ʼ�����Ͱ�����

                        InetAddress address = InetAddress.getByName(serverHost);

                        sendDp = new DatagramPacket(data,data.length,address,serverPort);

                        //����

                        ds.send(sendDp);

                                                                          

                        //��ʼ����������

                        byte[] b = new byte[1024];

                        receiveDp = new DatagramPacket(b,b.length);

                        //����

                        ds.receive(receiveDp);

                        //��ȡ�������ݣ������

                        byte[] response = receiveDp.getData();

                        int len = receiveDp.getLength();

                        String s = new String(response,0,len);

                        System.out.println("�������˷���Ϊ��" + s);

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