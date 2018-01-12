package cn.lhz.resources.controller;

import cn.lhz.resources.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther liu_hz
 * @create 2018/1/12 12:58
 */
@RestController
@RequestMapping("/resource")
public class ResourceController {

    @Autowired
    private UserClient userClient;


    @GetMapping("/get")
    public String getResource(String id) {
        return "get: " + id + " ...";
    }

    @GetMapping("/get/user")
    public String getUser() {
        return userClient.queryUser();
    }

}
