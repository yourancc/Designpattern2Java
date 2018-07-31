package com.youran.factorymode.AbstractFactoryMode;

import com.youran.factorymode.entity.MailSender;
import com.youran.factorymode.entity.Sender;

public class MailSenderFactory implements Provider {

	@Override
	public Sender getSenderInstance() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
