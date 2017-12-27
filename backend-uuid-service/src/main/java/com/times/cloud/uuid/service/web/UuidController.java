package com.times.cloud.uuid.service.web;

import com.times.cloud.common.util.RxEncryptUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UuidController {

    @RequestMapping(value = "getuuid", method = RequestMethod.GET)
    public String getUUID() {
        return RxEncryptUtils.encryptMD5ToString(UUID.randomUUID().toString());
    }
}
