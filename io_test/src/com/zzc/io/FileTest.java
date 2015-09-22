package com.zzc.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileTest {

	/**
	 * file
	 * 
	 * @autor: zzhao 2015-9-15 下午3:02:12
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {

		File file = new File("D:/a", "a.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// FileInputStream fis = null;
		// FileOutputStream fos = null;
		// System.out.println(file.getAbsoluteFile());
		// System.out.println(file.getName());
		// System.out.println(file.getPath());
		// System.out.println(file.getParent());
		// System.out.println(file.getAbsolutePath());
		// try {
		// fis = new FileInputStream(file.getPath());
		// fos = new FileOutputStream(file.getParent() + "/b.txt");
		// int b;
		// while((b = fis.read()) != -1){
		// fos.write(b);
		// System.out.println((char)b);
		// }
		// } catch (Exception e) {
		// e.printStackTrace();
		// }finally{
		// try {
		// fis.close();
		// fos.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }

		BufferedReader br = null;
		FileReader fr = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			fw = new FileWriter(file.getParent() + "/b.txt");
			bw = new BufferedWriter(fw);
			char[] data = new char[1024];
			int b;//b = br.read(data):读取的字符个数
			while ((b = br.read(data)) != -1) {
				bw.write(data);
				//bw.newLine(); //换行
				bw.flush(); //表示强制将缓冲区中的数据发送出去,不必等到缓冲区满.
				System.out.println(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
