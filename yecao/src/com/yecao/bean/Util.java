package com.yecao.bean;

import java.util.UUID;

public class Util {

	public static  String getId(){ 
		return UUID.randomUUID().toString().substring(0,32);
	}
}
