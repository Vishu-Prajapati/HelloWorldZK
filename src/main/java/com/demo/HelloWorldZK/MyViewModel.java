package com.demo.HelloWorldZK;

import org.zkoss.bind.annotation.Init;

public class MyViewModel {

	@Init
	void init()
	{
		System.out.println("First Application of ZK Framework");
	}
}
