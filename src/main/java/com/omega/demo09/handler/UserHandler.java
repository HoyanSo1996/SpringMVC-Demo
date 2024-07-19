package com.omega.demo09.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class UserHandler
 *
 * @author KennySo
 * @date 2024/7/19
 */
@Controller
@RequestMapping("/user")
public class UserHandler {

    @RequestMapping(value = "/hi")
    public String hi() {
        System.out.println("UserHandler hi()");
        return "redirect:/demo09/interceptor_success.jsp";
    }

    @RequestMapping(value = "/hello")
    public String hello() {
        System.out.println("UserHandler hello()");
        return "redirect:/demo09/interceptor_success.jsp";
    }
}
