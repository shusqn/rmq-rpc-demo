package io.github.shusqn;

import org.springframework.stereotype.Service;

import io.github.shusqn.service.IHelloService;
import io.github.shusqn.service.ITestAsynService;

@Service
public class DemoServer implements IHelloService, ITestAsynService{
	
	@Override
	public String hi(String name) {
		System.out.println("DemoServer:" + name);
		return "hello " + name;
	}
}
