package com.kunuma.proxy_cglib;

public class Client{
	public static void main(String[] args) {
		//implement class
		ProxyFactory proxyFactory = new ProxyFactory();
		
		TargetImp proxyTargetImp = proxyFactory.getProxyObject();
		
		proxyTargetImp.show();
		proxyTargetImp.sayHello();
	}
}