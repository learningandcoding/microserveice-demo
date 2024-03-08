package org.example.mall.controller;

import org.example.mall.common.api.R;
import lombok.RequiredArgsConstructor;
import org.example.mall.service.FeignAccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * OrderController
 *
 * @author zlh
 * @date 2024/3/6
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final FeignAccountService accountService;

    @GetMapping("/info")
    public R<String> getOrderInfo() {
        // 组装订单信息
        R<String> accountInfo = accountService.getAccountInfo();
        String data = accountInfo.getData();
        return R.success("Order Info: " + data, "获取订单信息成功");
    }
}
