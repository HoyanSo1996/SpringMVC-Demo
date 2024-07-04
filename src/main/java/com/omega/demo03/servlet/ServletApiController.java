package com.omega.demo03.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Class ServletApiController
 *
 * @author KennySo
 * @date 2024/7/4
 */
@Controller
public class ServletApiController {

    @RequestMapping("/servletApi")
    public String getServletApi(HttpServletRequest request,
                                HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username = " + username);
        System.out.println("password = " + password);

        return "success";
    }

    @RequestMapping("/servletApi2")
    public String getServletApi2(HttpServletRequest request,
                                 HttpServletResponse response,
                                 HttpSession session1) {
        HttpSession session2 = request.getSession();
        System.out.println(session1 == session2);  // true
        return "success";
    }
}
