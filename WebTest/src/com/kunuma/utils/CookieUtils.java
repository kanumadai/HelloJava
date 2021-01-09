package com.kunuma.utils;

import javax.servlet.http.Cookie;

public class CookieUtils {

	public static Cookie findCookie(Cookie[] cookies,String name) {
		if(cookies == null) {
			//no cookie is getted;
			return null;
		}
		else {
			//get the named cookie
			for(Cookie cookie:cookies) {
				if(name.equals(cookie.getName())) {
					return cookie;
				}
			}
			//there is no named cookie
			return null;
		}
	}
}
