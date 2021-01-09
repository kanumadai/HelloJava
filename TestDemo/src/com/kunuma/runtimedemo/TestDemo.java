package com.kunuma.runtimedemo;

import java.io.InputStream;

public class TestDemo {
	public static void main(String[] args) throws Exception {
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("ipconfig");
		InputStream is = process.getInputStream();
		byte[] arry = new byte[1024*1024*10];
		
		int len = is.read(arry);
		System.out.println(new String(arry,0,len,"SJIS"));
	}
}