package com.wat.demo;

/**
 * 单例模式----基本
 * 
 * 
 * @author Wutao
 *
 */
public class A {

	private static A a;
	
	//构造器私有化  防止外部被创建实例
	private A (){
		System.out.println("基础单例模式---A--<");
	}
	//有且只有通过getInstance的方法才能得到对象实例
	public static A getInstanse(){
		if(a == null){
			a = new A();
		}
		return a;
	}
}
