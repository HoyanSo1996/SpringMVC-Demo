package com.omega.demo04.controller;

import com.omega.demo04.entity.Master;
import com.omega.demo04.entity.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
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

    @RequestMapping("/test02")
    public String test02(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("address", "Guangzhou city");
        return "forward:/sessionScope/test03";
    }

    @RequestMapping("/test03")
    @ResponseBody
    public String test03(@SessionAttribute("address") String address,
                         HttpServletRequest request) {
        System.out.println("方式一: " + address);
        System.out.println("方式二: " + request.getSession().getAttribute("address"));
        return "success~";
    }
}
