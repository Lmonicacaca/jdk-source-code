package com.jdk_source_code.demo.remote.impl;

import com.jdk_source_code.demo.remote.RemoteTestDubbo;
import org.apache.dubbo.config.annotation.Service;

@Service(interfaceClass =RemoteTestDubbo.class,version = "${provider.member.version}")
public class RemoteTestDubboImpl implements RemoteTestDubbo {
    @Override
    public Object test() {
        return null;
    }
}
