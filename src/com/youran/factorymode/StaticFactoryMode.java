package com.youran.factorymode;

import com.youran.factorymode.entity.MailSender;
import com.youran.factorymode.entity.Sender;
import com.youran.factorymode.entity.SmsSender;

/**
 * 静态工厂模式
 * @author cc
 *
 */
public class StaticFactoryMode {
	public static Sender GetMailSenderInstance(){
		return new MailSender();
	}
	
	public static Sender GetSmsSenderInstance(){
		return new SmsSender();
	}
}
