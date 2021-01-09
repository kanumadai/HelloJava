package com.kunuma.proxy_cglib;
import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor{
	
	private TargetImp targetImp = new TargetImp();
	
	public TargetImp getProxyObject() {
		
		Enhancer enhancer = new Enhancer();
		
		enhancer.setSuperclass(TargetImp.class);
		
		enhancer.setCallback(this);
		
		TargetImp proxyObject = (TargetImp) enhancer.create();
		
		return proxyObject;		
		
	}

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("I am cglib proxy!");
		
		return arg1.invoke(targetImp, arg2);
	}
}