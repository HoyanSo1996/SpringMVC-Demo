package com.omega.demo11.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Class Filter_
 *
 * @author KennySo
 * @date 2024/10/15
 */
@WebFilter("/*")
public class Filter_ implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("Filter_ init()...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter_ doFilter() 过滤前...");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Filter_ doFilter() 过滤后...");
    }

    @Override
    public void destroy() {
        System.out.println("Filter_ destroy()...");
    }
}
