package com.omega.demo04.controller;

import com.omega.demo04.entity.Master;
import com.omega.demo04.entity.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Class RequestScopeController
 *
 * @author KennySo
 * @date 2024/7/6
 */
@Controller
@RequestMapping("/requestScope")
public class RequestScopeController {

    /**
     * 1.在方法上的设置形参接收数据, 并放入 request 域 (SpringMVC 底层机制)
     */
    @RequestMapping("/test01")
    public String test01(Master master) {
        System.out.println("master = "  + master);
        return "requestScope_success";
    }


    /**
     * 2.通过 HttpServletRequest 将数据放入 request 域中
     */
    @RequestMapping("/test02")
    public String test02(HttpServletRequest request, HttpServletResponse response) {
        Pet pet = new Pet(200, "xiaohei");
        Master master = new Master(100, "Cody", pet);
        request.setAttribute("master", master);
        request.setAttribute("address", "Beijing");
        return "requestScope_success";
    }


    /**
     * 3.在方法上设置 map 类型参数, SpringMVC 会将这个 map 自动放入 request 域中
     */
    @RequestMapping("/test03")
    public String test03(Map<String, Object> map,  Master master) {
        map.put("master", master);
        map.put("address", "Guangzhou");
        return "requestScope_success";
    }


    /**
     * 4.将方法的返回类型设置为 ModelAndView，然后在里面设置要放入 request 域的数据.
     */
    @RequestMapping("/test04")
    public ModelAndView test04() {
        Pet pet = new Pet(200, "xiaohong");
        Master master = new Master(100, "John", pet);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("master", master);
        modelAndView.addObject("address", "Shanghai");
        modelAndView.setViewName("requestScope_success");
        return modelAndView;
    }

    @RequestMapping("test05")
    public String test05(HttpServletRequest request) {
        request.setAttribute("username", "John");
        return "forward:/requestScope/test06";
    }

    @RequestMapping("test06")
    @ResponseBody
    public String test06(@RequestAttribute("username") String username,
                         HttpServletRequest request) {
        System.out.println("方式一: " + username);
        System.out.println("方式二: " + request.getAttribute("username"));
        return "success~";
    }
}
