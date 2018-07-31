package com.youran.factorymode.entity;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("Mail");
	}

}
