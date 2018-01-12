package cn.lhz.resources.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @auther liu_hz
 * @create 2018/1/12 14:51
 */
@FeignClient("user-server")
public interface UserClient {

    @GetMapping("/user/query")
    String queryUser();


}
