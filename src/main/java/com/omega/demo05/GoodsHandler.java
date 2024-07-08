package com.omega.demo05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class GoodHandler
 *
 * @author KennySo
 * @date 2024/7/8
 */
@Controller
@RequestMapping("/goods")
public class GoodsHandler {

    @RequestMapping(value = "/buy")
    public String buy() {
        System.out.println("======= buy() =======");
        return "myView";
    }
}
