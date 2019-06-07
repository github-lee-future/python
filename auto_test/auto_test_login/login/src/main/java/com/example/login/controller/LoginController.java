package com.example.login.controller;

import com.example.login.model.VO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author future
 * @date 2019-05-29 23:22
 */
@Slf4j
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() { return "auth/login"; }

    @ResponseBody
    @PostMapping("/login")
    public VO doLogin(String email, String password) {
        if ("admin@qq.com".equals(email) && "123456".equals(password)) {
            return VO.ok("success");
        }
        return VO.fail("fail");
    }

    @GetMapping("/success")
    public String success() { return "success"; }

    @GetMapping("/fail")
    public String fail() { return "fail"; }
}
