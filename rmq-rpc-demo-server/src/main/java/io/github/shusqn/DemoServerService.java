package io.github.shusqn;

import org.springframework.stereotype.Service;

import io.github.shusqn.service.IHelloService;
import io.github.shusqn.service.ITestAsynService;

@Service
public class DemoServerService implements IHelloService, ITestAsynService{
	
	@Override
	public String hi(String name) {
		System.out.println("DemoServerService:" + name);
		return "hello " + name;
	}
}
