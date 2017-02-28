package com.wat.demo;

/**
 * 饿汉模式
 * 
 * @author Wutao
 *
 */
public class AAA {
	
	private static AAA a = new AAA();
	
	private AAA(){
		System.out.println("AAA对象被创建-----<");
	}
	
	public static AAA getInstance(){
		return a;
	}
}