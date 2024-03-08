package org.example.mall.service;

import org.example.mall.common.api.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * FeignAccountService
 *
 * @author zlh
 * @date 2024/3/6
 */
@FeignClient("mall-account")
public interface FeignAccountService {

    @RequestMapping("/accounts/info")
    R<String> getAccountInfo();
}
