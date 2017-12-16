package com.consumer;

import org.springframework.stereotype.Component;

/**
 * 熔断回调类，实现eureka调用接口中的方法，当eureka上的应用发生故障时，可以使用fallback方法返回的值
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello() {
        return "is Hystrix";
    }
}
