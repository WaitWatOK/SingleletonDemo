package com.wat.demo;

/**
 * ����ģʽ---����ģʽ
 * 
 * @author Wutao
 *
 */
public class AA {

	private static AA a;
	
	private AA(){
		System.out.println("aa���󱻴���----------<");
	}
	
	public synchronized static AA getInstance(){
		if(a == null){
			a = new AA();
		}
		return a;
	}
}
