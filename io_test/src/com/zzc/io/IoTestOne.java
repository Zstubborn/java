package com.zzc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IoTestOne {

	/**
	 * io
	 * @autor: Administrator 2015-9-16 обнГ3:22:29
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {

		File file = new File("D:/a", "a.txt");

		file.getParent();

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file.getPath());
			int b ;
			while((b = fis.read()) != -1){
				System.out.print((char)b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
