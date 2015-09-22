package com.zzc.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class IoTest {

	/** 
	 * io流 文件处理
	 *
	 * @autor: zzhao  2015-8-18 下午3:15:55
	 * @param args    
	 * @return void 
	 */
	public static void main(String[] args) {
		
		//myIo();
	
		 try {
	            File inputFile = new File("D:/copy3.txt");
	            OutputStream out;
	            InputStream in;
	            if (!inputFile.exists()) {
	                inputFile.createNewFile();
	            }
	            File outputFile = new File("D:/a.txt");
	            in = new FileInputStream(inputFile);
	            out = new FileOutputStream(outputFile);
	            byte data[] = new byte[1024];
	            int temp = 0;
	            while ((temp = in.read(data)) != -1) {
	                out.write(data);
	            }
	            in.close();
	            out.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 }
	
	public static void myIo(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			str = br.readLine();
			System.out.println(str);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

 
	