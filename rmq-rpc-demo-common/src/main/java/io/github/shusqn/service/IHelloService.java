package io.github.shusqn.service;

import io.github.shusqn.rocketmq.rpc.aopProxy.RpcMqClient;
import io.github.shusqn.rocketmq.rpc.aopProxy.RpcMqServer;

/**
 * IHelloService.java
 * @date 2023-07-28 11:49
 * @version 1.0.0
 */
@RpcMqClient(targetServer = "demo-server")
@RpcMqServer
public interface IHelloService {
	String hi(String name);
}
