package com.omega.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Class CharacterEncodingFilter
 *
 * @author KennySo
 * @date 2024/7/17
 */
public class CharacterEncodingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        chain.doFilter(request, response);
    }
}
