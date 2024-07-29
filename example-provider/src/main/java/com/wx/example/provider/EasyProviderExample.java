package com.wx.example.provider;

import com.wx.example.common.service.UserService;
import com.wx.rpc.RpcApplication;
import com.wx.rpc.registry.LocalRegistry;
import com.wx.rpc.server.HttpServer;
import com.wx.rpc.server.VertxHttpServer;

/**
 * 简易服务提供者示例
 */
public class EasyProviderExample {

    public static void main(String[] args) {
        // RPC 框架初始化
        RpcApplication.init();

        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
