package com.helloWorld.infrastructure;

import javax.inject.Named;

import com.helloWorld.domain.HelloWorldDomainService;

@Named
public class HelloWorldDaoServiceImpl implements HelloWorldDaoService {

	@Override
	public String getMessage() {
		String message = "Hello, World!";
		return message;
	}

}
