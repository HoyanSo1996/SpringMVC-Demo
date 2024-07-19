package com.omega.demo09.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Class CustomInterceptor01
 *
 * @author KennySo
 * @date 2024/7/19
 */
@Component
public class CustomInterceptor01 implements HandlerInterceptor {

    /**
     *   preHandler 方法在目标方法执行之前被调用.
     * 1. 返回 false, 则不会再执行目标方法, 当前拦截器的 postHandle 方法, afterCompletion 方法.
     *    可以在此指定要跳转到哪一个页面.
     * 2. 如果该拦截器之前还有个拦截器, 那么返回 false 后会进入前一个拦截器的 afterCompletion 方法.
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("==== CustomInterceptor01 pre ====");
        return true;
    }

    /**
     * postHandle 在目标方法被执行之后执行.
     * 可以该在方法中访问到目标方法返回的 ModelAndView 对象.
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("==== CustomInterceptor01 post ====");
    }

    /**
     * afterCompletion 方法在渲染视图之后被执行.
     * 这里可以进行资源清理工作.
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("==== CustomInterceptor01 afterCompletion() ====");
    }
}
