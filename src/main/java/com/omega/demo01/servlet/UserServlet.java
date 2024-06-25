package com.omega.demo01.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class UserServlet
 *
 * @author KennySo
 * @date 2024/6/25
 */
// 这里配置了@Controller注解后, bean 就会被 SpringMVC 框架接管, 不用再去继承 HttpServlet (这里也可以是 @component)
@Controller
public class UserServlet {

    /**
     * 1. DispatchServlet 会找到路径匹配 Handler.
     * 2. Handler 进行逻辑处理.
     * 3. 将结果 "login_success" 返回给 视图解析器 InternalResourceViewResolver
     * 4. 视图解析器 会根据配置进行拼接, 并进行跳转到对应页面》
     */
    @RequestMapping("user/login")
    public String login() {
        System.out.println("login_success ~");
        return "login_success";
    }
}
