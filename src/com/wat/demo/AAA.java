package com.wat.demo;

/**
 * ����ģʽ
 * 
 * @author Wutao
 *
 */
public class AAA {
	
	private static AAA a = new AAA();
	
	private AAA(){
		System.out.println("AAA���󱻴���-----<");
	}
	
	public static AAA getInstance(){
		return a;
	}
}