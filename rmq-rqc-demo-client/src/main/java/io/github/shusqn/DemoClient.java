package io.github.shusqn;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.shusqn.service.IHelloService;

@Service
public class DemoClient {
	
	@Autowired
    IHelloService iHelloService;
    
	@PostConstruct
    private void init() {
    	System.out.println("DemoClient:" + iHelloService.hi("sanjie")); 
    }

}
