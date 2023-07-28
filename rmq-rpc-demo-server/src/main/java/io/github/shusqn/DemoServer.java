package io.github.shusqn;

import org.springframework.stereotype.Service;

import io.github.shusqn.service.IHelloService;

@Service
public class DemoServer implements IHelloService{
	
	@Override
	public String hi(String name) {
		return "hello " + name;
	}
}
