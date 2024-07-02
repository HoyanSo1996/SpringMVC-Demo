package com.omega.demo03.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class RequestHeaderController
 *
 * @author KennySo
 * @date 2024/7/3
 */
@Controller
@RequestMapping("/request")
public class RequestHeaderController {

    @RequestMapping("/header")
    public String getRequestHeader(@RequestHeader("Accept-Encoding") String ae,
                                   @RequestHeader("Host") String host) {
        System.out.println("Accept-Encoding = " + ae);
        System.out.println("Host = " + host);
        return "success";
    }
}
