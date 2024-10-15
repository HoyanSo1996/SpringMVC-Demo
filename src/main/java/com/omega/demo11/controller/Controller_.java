package com.omega.demo11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Class Controller_
 *
 * @author KennySo
 * @date 2024/10/15
 */
@Controller
public class Controller_ {

    @RequestMapping("/controller_")
    public String test() {
        return "forward:/controller2_";
    }

    @RequestMapping("/controller2_")
    @ResponseBody
    public String test2() {
        return "test successfully";
    }
}
