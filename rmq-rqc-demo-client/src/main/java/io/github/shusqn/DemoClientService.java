package io.github.shusqn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.shusqn.service.IHelloService;

@Service
public class DemoClientService {
	@Autowired
    IHelloService iHelloService;
}
