package com.omega.demo03.servlet;

import com.omega.demo03.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

/**
 * Class RequestParamController
 *
 * @author KennySo
 * @date 2024/7/3
 */
@Controller
@RequestMapping("/request")
public class RequestParamController {

    @RequestMapping("/commonParam")
    public String getCommonParam(String name, String age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        return "success";
    }

    /**
     * <a href="http://localhost:8080/springmvc/request/commonParam2?name=zhangsan&age=24"/>
     * @RequestParam(value = "name", required = false)
     *  value：接收 url 上变量名为 name 的变量,
     *  require：对这个方法的请求可以不携带 name 这个变量
     */
    @RequestMapping("/commonParam2")
    public String getCommonParamByDifferentName(@RequestParam(value = "name", required = false) String username,
                               @RequestParam(value = "age", required = false) String userAge) {
        System.out.println("name2 = " + username);
        System.out.println("age2 = " + userAge);
        return "success";
    }

    /**
     * Entity 类型参数
     */
    @RequestMapping("/entityParam")
    public String getEntityParam(User user) {
        System.out.println("user:" + user);
        return "success";
    }

    /**
     * 嵌套 Entity 类型参数
     */
    @RequestMapping("/entityContainEntityParam")
    public String getEntityContainEntityParam(User user) {
        System.out.println("user:" + user);
        return "success";
    }

    /**
     * 数组类型参数
     */
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] numbers) {
        System.out.println("numbers:" + Arrays.toString(numbers));
        return "success";
    }

    /**
     * 集合类型参数
     */
    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> words){
        System.out.println("words:"+ words);
        return "success";
    }

}
