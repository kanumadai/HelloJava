package com.kunuma.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client{
	public static void main(String[] args) {
		//implement class
		TargetImp target = new TargetImp();
		//interface class
		Target targetProxy = (Target) Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub

						System.out.println(method.getName());
						//get implement class's method.
						return method.invoke(target, args);
					}
					

				});
		targetProxy.show();
	}
}