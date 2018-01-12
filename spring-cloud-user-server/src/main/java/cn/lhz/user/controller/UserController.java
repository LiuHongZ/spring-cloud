package cn.lhz.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther liu_hz
 * @create 2018/1/12 11:02
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping("/query")
    public String queryUser() {
        return "query one...";
    }

}
