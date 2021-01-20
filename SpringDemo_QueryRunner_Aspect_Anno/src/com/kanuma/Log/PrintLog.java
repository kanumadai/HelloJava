package com.kanuma.Log;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Log information
 * @author Dynabook
 *
 */
@Component("PrintLog")		//insert spring container
@Aspect						
public class PrintLog {

	/**
	 * 
	 */
	@Pointcut("execution(* com.kanuma.service.Impl.*.*(..))")
	public void pt1() {
		
	}
	
	//@Before("pt1()")		//
	public void beforeLog() {
		System.out.println("Before.....");
	}
	
	//@AfterReturning("pt1()")
	public void afterReturnLog() {
		System.out.println("afterReturn.....");
	}	
	
//	@AfterThrowing("pt1()")
	public void afterThrowLog() {
		System.out.println("afterThrow.....");
	}
	//@After("pt1()")
	public void afterLog() {
		System.out.println("after....");
	}
	
	
	@Around("pt1()")
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		Object rtObject = null;
		String funcName = "";
		try {

			funcName = pjp.getSignature().getName();
			System.out.println("Before....."+funcName);
			rtObject = pjp.proceed();
			System.out.println("afterReturn....."+funcName);
		}
		catch (Exception e) {
			// TODO: handle exception

			System.out.println("afterThrow....."+funcName);
			throw new RuntimeException(e);
			
		}finally {
			
			System.out.println("after....."+funcName);
		}
		return rtObject;
	}
}
