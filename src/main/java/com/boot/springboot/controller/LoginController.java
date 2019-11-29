package com.boot.springboot.controller;

import com.boot.springboot.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Boolean Login(@RequestBody User user) {
        System.out.println("用户名" + user.getUser());
        System.out.println("用户密码" + user.getPassword());
        return Boolean.TRUE;
    }
}
