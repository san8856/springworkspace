package com.yedam.app.di;

import org.springframework.context.support.GenericXmlApplicationContext;

//스프링 방식

public class SpringXMLMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext
			("classpath:applicationContext.xml");
		
		SamsungTV tv = ctx.getBean(SamsungTV.class);
		tv.powerOn();
		
		ctx.close();
	}
}
