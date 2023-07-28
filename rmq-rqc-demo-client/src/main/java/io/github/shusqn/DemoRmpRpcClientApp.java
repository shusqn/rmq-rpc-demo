package io.github.shusqn;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import io.github.shusqn.rocketmq.MqRpcPackageScanConfiguration;
import io.github.shusqn.rocketmq.rpc.RmqRpcService;
import io.github.shusqn.rocketmq.rpc.Rmq_data;

/**
 * DemoRmpRpcServerApp.java
 * @date 2023-07-28 11:54
 * @version 1.0.0
 */
@SpringBootApplication
@Import({MqRpcPackageScanConfiguration.class})
public class DemoRmpRpcClientApp {
	
	public static void main(String[] args) {
		SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(DemoRmpRpcClientApp.class);
		ApplicationContext applicationContext =  springApplicationBuilder.web(WebApplicationType.NONE).run(args);
		
		
		RmqRpcService.registerClient("192.168.3.220:9876", 10);
		//同步
		System.out.println(applicationContext.getBean(DemoClient.class).iHelloService.hi("shusqn")); 
		
		//异步
		RmqRpcService.asynSendAndReceiveRpcMsg(DemoRmpRpcClientApp::backFunc, "ITestAsynService/hi", "demo-server", "shusqn asyn");
	}
	
	public static void backFunc(Rmq_data data) {
		System.out.println("backFunc:" + data.getRs());
	}
}
