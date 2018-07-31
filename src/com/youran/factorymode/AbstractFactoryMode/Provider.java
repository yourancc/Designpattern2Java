package com.youran.factorymode.AbstractFactoryMode;

import com.youran.factorymode.entity.Sender;

public interface Provider {
	public Sender getSenderInstance();
}
