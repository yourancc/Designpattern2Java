package com.youran.factorymode.AbstractFactoryMode;

import com.youran.factorymode.entity.Sender;
import com.youran.factorymode.entity.SmsSender;

public class SmsSenderFactory implements Provider {

	@Override
	public Sender getSenderInstance() {
		return new SmsSender();
	}

}
