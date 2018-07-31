package com.youran.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

	private static Singleton s;
	
	private Singleton(){
		;
	}
	
	//加锁线程安全
	public static  Singleton getInstance(){
		if(s == null){
			synchronized(s){
				s = new Singleton();
			}
			
		}
		return s;
	}
	
	public Object readResolve(){
		return s;
	}
	
}
