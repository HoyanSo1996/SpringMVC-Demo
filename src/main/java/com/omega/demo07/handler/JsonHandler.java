package com.omega.demo07.handler;

import com.omega.demo07.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Class JsonHandler
 *
 * @author KennySo
 * @date 2024/7/17
 */
@Controller
@RequestMapping("/json")
@RestController
public class JsonHandler {

    /**
     * 1.普通数组（也可以使用 List<String> 接收数组数据）
     */
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String[] listParamForJson(@RequestBody String[] hobbys) {
        System.out.println("hobbys:" + Arrays.toString(hobbys));
        return hobbys;
    }

    /**
     * 2.对象
     */
    @RequestMapping("/entityParamForJson")
    @ResponseBody
    public User listParamForJson(@RequestBody User user) {
        System.out.println("user:" + user);
        return user;
    }

    /**
     * 3.对象集合
     */
    @RequestMapping("/entityParamListForJson")
    @ResponseBody
    public List<User> listPojoParamForJson(@RequestBody List<User> users) {
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }
}
