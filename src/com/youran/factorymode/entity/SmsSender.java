package com.youran.factorymode.entity;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("SMS");
	}

}
