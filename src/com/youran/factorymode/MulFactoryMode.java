package com.youran.factorymode;

import com.youran.factorymode.entity.MailSender;
import com.youran.factorymode.entity.Sender;
import com.youran.factorymode.entity.SmsSender;

/**
 * 多个工厂模式
 * @author cc
 *
 */
public class MulFactoryMode {

	public Sender GetMailSenderInstance(){
		return new MailSender();
	}
	
	public Sender GetSmsSenderInstance(){
		return new SmsSender();
	}
}
