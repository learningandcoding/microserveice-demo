package org.example.example.mall.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.mall.DubboDemoService;

/**
 * DubboDemoServiceImpl
 *
 * @author zlh
 * @date 2024/3/6
 */
@DubboService
public class DubboDemoServiceImpl implements DubboDemoService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
