package io.github.shusqn.service;

import io.github.shusqn.rocketmq.rpc.aopProxy.RpcMqServer;

/**
 * IHelloService.java
 * @date 2023-07-28 11:49
 * @version 1.0.0
 */
@RpcMqServer
public interface ITestAsynService {
	String hi(String name);
}
