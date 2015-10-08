package com.zzc.QRCode;

import java.io.*;
import java.util.Date;

import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import com.swetake.util.Qrcode;

public class QRCodeTest {
	static int width = 90;
	static int height = 90;

	public QRCodeTest() {
	}

	public static void create_image(String sms_info) throws Exception {
		try {
			Qrcode testQrcode = new Qrcode();
			testQrcode.setQrcodeErrorCorrect('M');
			testQrcode.setQrcodeEncodeMode('B');
			testQrcode.setQrcodeVersion(7);
			String testString = sms_info;
			byte[] d = testString.getBytes("gbk");
			BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_BINARY);
			Graphics2D g = bi.createGraphics();
			g.setBackground(Color.WHITE);
			g.clearRect(0, 0, width, height);
			g.setColor(Color.BLACK);

			// ��������ֽ���Ϊ119
			if (d.length > 0 && d.length < 120) {
				boolean[][] s = testQrcode.calQrcode(d);
				for (int i = 0; i < s.length; i++) {
					for (int j = 0; j < s.length; j++) {
						if (s[j][i]) {
							g.fillRect(j * 2, i * 2, 2, 2);
						}
					}
				}
			}
			g.dispose();
			bi.flush();
			File f = new File("D:\\QRCodeTest\\b.jpg");
			if (!f.exists())
				f.createNewFile();
			ImageIO.write(bi, "jpg", f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		String string = "http://www.baidu.com";
		QRCodeTest.create_image(string);
		long end = System.currentTimeMillis();
		long last = end - start;
		System.out.println("time consume:" + last);
	}
}
