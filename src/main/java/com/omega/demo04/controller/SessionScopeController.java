package com.omega.demo04.controller;

import com.omega.demo04.entity.Master;
import com.omega.demo04.entity.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Class SessionScopeController
 *
 * @author KennySo
 * @date 2024/7/8
 */
@Controller
@RequestMapping("/sessionScope")
public class SessionScopeController {

    @RequestMapping("/test01")
    public String test01(HttpSession session) {
        Pet pet = new Pet(500, "xiaohuang");
        Master master = new Master(100, "Josh", pet);
        session.setAttribute("master", master);
        session.setAttribute("address", "Tokyo");
        return "sessionScope_success";
    }
}
