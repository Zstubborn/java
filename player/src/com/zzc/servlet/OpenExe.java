package com.zzc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OpenExe extends HttpServlet {

	// 打开本地播放器并播放视频
	public static void openExe(String file) {
		System.out.println("111111"+file.toString());
		Runtime rn = Runtime.getRuntime();
		Process p = null;
		try {
			p = rn.exec("D:/Baofeng/StormPlayer/StormPlayer.exe " + file);
		} catch (Exception e) {
			System.out.println("Error exec!");
		}
	}

	// 打开本地播放器并播放视频
	public static void openExe1() {
		Runtime rn = Runtime.getRuntime();
		Process p = null;
		try {
			p = rn.exec("\"D:/Baofeng/StormPlayer/StormPlayer.exe\" C:/Users/Administrator/Downloads/aa.flv");
		} catch (Exception e) {
			System.out.println("Error exec!");
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
		/* openExe1(); */
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bofile = request.getParameter("file");
		System.out.println(bofile.toString());
		openExe(bofile);
	}

}
