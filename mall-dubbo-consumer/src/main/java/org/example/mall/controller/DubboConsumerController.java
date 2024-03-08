package org.example.mall.controller;

import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboReference;
import org.example.mall.DubboDemoService;
import org.example.mall.common.api.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DubboConsumerController
 *
 * @author zlh
 * @date 2024/3/6
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/dubbo")
public class DubboConsumerController {

    @DubboReference
    private DubboDemoService dubboDemoService;

    @GetMapping("/greeting")
    public R<String> sayHello() {
        return R.success(dubboDemoService.sayHello("L"));
    }
}
