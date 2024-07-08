package com.omega.demo05;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Class MyView
 *
 * @author KennySo
 * @date 2024/7/8
 */
@Component("myView")  // 把自定义视图加入 IOC 容器中
public class MyView extends AbstractView {

    @Override
    protected void renderMergedOutputModel(Map<String, Object> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("进入 myView ...");
        // 这里定义要 转发/重定向 到哪个页面去.
        httpServletRequest.getRequestDispatcher("/demo05/my_view.jsp").forward(httpServletRequest, httpServletResponse);
    }
}
