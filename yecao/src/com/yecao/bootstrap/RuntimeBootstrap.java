package com.yecao.bootstrap;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class RuntimeBootstrap {
	
	public static void init(){
		FileSystemXmlApplicationContext context=new FileSystemXmlApplicationContext("classpath:META-INF/spring/beans.xml");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		init();
	}

}
