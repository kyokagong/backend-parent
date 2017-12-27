package com.times.cloud.web.feign;

import com.times.cloud.common.util.RxEncryptUtils;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;


@FeignClient(name = "backend-uuid-service")
public interface IUuidFeignService {

    @RequestMapping(value = "getuuid", method = RequestMethod.GET)
    public String getUUID();
}
