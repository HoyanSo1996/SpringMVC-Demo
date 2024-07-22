package com.omega.demo10.handler;

import com.omega.demo10.exception.AgeException;
import com.omega.demo10.exception.AgeException2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Class MyExceptionHandler
 *
 * @author KennySo
 * @date 2024/7/22
 */
@Controller
public class NormalHandler {

    @ExceptionHandler({ArithmeticException.class})
    public String localException(HttpServletRequest request, Exception ex) {
        System.out.println("局部异常信息: " + ex.getMessage());
        request.setAttribute("reason", ex.getMessage());
        return "exception_page";
    }

    @RequestMapping("/exception01")
    public String method01(Integer num) {
        int result = 9 / num;
        return "success";
    }

    @RequestMapping("/exception02")
    public String method02() {
        int num = Integer.parseInt("hello");
        return "success";
    }

    @RequestMapping("/exception03")
    public String method03() {
        int[] arr = new int[]{3, 9, 10, 190};
        System.out.println(arr[90]);  // 索引媛姐异常
        return "success";
    }

    @RequestMapping("/exception04")
    public String method04(Integer age) {
        if (age < 0 || age > 120) {
            throw new AgeException();
        }
        return "success";
    }

    @RequestMapping("/exception05")
    public String method05(Integer age) {
        if (age < 0 || age > 120) {
            throw new AgeException2(400, "年龄范围需要在 0 ~ 120 之间.");
        }
        return "success";
    }
}
