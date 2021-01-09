package com.kunuma.utils;

import java.io.UnsupportedEncodingException;

import org.apache.tomcat.util.codec.binary.Base64;

//import sun.misc.BASE64Encoder;

public class DownloadUtils {

	public static String base64EncodeFileName(String fileName) {
//		Base64 base64 = new Base64();
		//BASE64Encoder base64Encoder = new BASE64Encoder();
		try {
			return "=?UTF-8?B?"
//					+ new String(base64Encoder.encode(fileName.getBytes("UTF-8")))
					+ new String(Base64.encodeBase64(fileName.getBytes("UTF-8")))
					+"?=";
		}
		catch(UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
