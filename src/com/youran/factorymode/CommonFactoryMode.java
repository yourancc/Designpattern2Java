package com.youran.factorymode;

import com.youran.factorymode.entity.MailSender;
import com.youran.factorymode.entity.Sender;

/**
 * 普通工厂模式
 * @author cc
 *
 */
public class CommonFactoryMode {

	public Sender GetInstance(String serderName){
		Sender sender = null;
		if("Mail".equals(sender)){
			sender = new MailSender();
		}else if("Sms".equals(sender)){
			sender = new MailSender();
		}
		return sender;
	}
}
