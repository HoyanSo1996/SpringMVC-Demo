package com.omega.demo04.controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;

/**
 * Class CookieController
 *
 * @author KennySo
 * @date 2024/10/9
 */
@RestController
@RequestMapping("/cookie")
public class CookieController {

    @RequestMapping("/test01")
    public String test01(@CookieValue("username") String name) {
        return "hi~, " + name;
    }

    @RequestMapping("/test02")
    public String test02(@CookieValue("email") Cookie cookie) {
        return cookie.getName() + " = " + cookie.getValue();
    }
}
