package org.example.mall.controller;

import org.example.mall.common.api.R;
import lombok.RequiredArgsConstructor;
import org.example.mall.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AccountController
 *
 * @author zlh
 * @date 2024/3/6
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/accounts")
public class AccountController {

        private final AccountService accountService;

        @GetMapping("/info")
        public R<String> getAccountInfo() {
            return R.success(accountService.getAccountInfo(), "获取账户信息成功");
        }
}
