package io.github.shusqn;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

import io.github.shusqn.rocketmq.MqRpcPackageScanConfiguration;
import io.github.shusqn.rocketmq.rpc.RmqRpcService;

/**
 * DemoRmpRpcServerApp.java
 * @date 2023-07-28 11:54
 * @version 1.0.0
 */
@SpringBootApplication
@Import({MqRpcPackageScanConfiguration.class})
public class DemoRmpRpcServerApp {
	
	public static void main(String[] args) {
		SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(DemoRmpRpcServerApp.class);
		springApplicationBuilder.web(WebApplicationType.NONE).run(args);
		
		//同步
		RmqRpcService.registerServer("192.168.3.220:9876", 101, "demo-server");
	}
}
