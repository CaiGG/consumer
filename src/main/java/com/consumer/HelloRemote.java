package com.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 调用eureka的接口，FeignClient=> name : 注册到eureka的应用名，fallback:熔断回调类
 */
@Service
@FeignClient(name= "server-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    String hello();
}