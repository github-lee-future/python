package com.example.login.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author future
 * @date 2019-05-28 23:02
 */
@Slf4j
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() { return "auth/login"; }
}
