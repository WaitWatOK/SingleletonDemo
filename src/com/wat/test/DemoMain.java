package com.wat.test;

import com.wat.demo.A;
import com.wat.demo.AA;
import com.wat.demo.AAA;

public class DemoMain {
	
	public static void main(String[] args) {
/*		A.getInstanse();
		A.getInstanse();*/
		
/*		new Thread(){
			public void run(){
				AA.getInstance();
			}
		}.start();
		
		new Thread(){
			public void run(){
				AA.getInstance();
			}
		}.start();*/
		
		new Thread(){
			public void run(){
				AAA.getInstance();
			}
		}.start();
		
		
		new Thread(){
			public void run(){
				AAA.getInstance();
			}
		}.start();
	}
	
}
