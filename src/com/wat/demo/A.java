package com.wat.demo;

/**
 * ����ģʽ----����
 * 
 * 
 * @author Wutao
 *
 */
public class A {

	private static A a;
	
	//������˽�л�  ��ֹ�ⲿ������ʵ��
	private A (){
		System.out.println("��������ģʽ---A--<");
	}
	//����ֻ��ͨ��getInstance�ķ������ܵõ�����ʵ��
	public static A getInstanse(){
		if(a == null){
			a = new A();
		}
		return a;
	}
}
