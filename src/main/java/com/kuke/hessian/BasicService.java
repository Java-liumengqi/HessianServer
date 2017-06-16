package com.kuke.hessian;

import org.springframework.stereotype.Service;

import com.caucho.hessian.server.HessianServlet;

@Service("basicService")
public class BasicService extends HessianServlet implements IBasicService{

	private static final long serialVersionUID = -438984045150372881L;

	@Override
	public String hello(String name) {
		return "Hello " + name;
	}

	@Override
	public String say(String msg) {
		return "say: " + msg;
	}

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

}
