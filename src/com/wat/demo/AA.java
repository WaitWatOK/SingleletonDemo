package com.wat.demo;

/**
 * 单例模式---懒汉模式
 * 
 * @author Wutao
 *
 */
public class AA {

	private static AA a;
	
	private AA(){
		System.out.println("aa对象被创建----------<");
	}
	
	public synchronized static AA getInstance(){
		if(a == null){
			a = new AA();
		}
		return a;
	}
}
