package org.example.mall.service.impl;

import org.example.mall.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * AccountImpl
 *
 * @author zlh
 * @date 2024/3/6
 */
@Service
public class AccountImpl implements AccountService {
    @Override
    public String getAccountInfo() {
        return "Account Info: 10086";
    }
}
