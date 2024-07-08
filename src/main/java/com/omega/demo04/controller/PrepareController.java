package com.omega.demo04.controller;

import com.omega.demo04.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Class PrepareController
 *
 * @author KennySo
 * @date 2024/7/8
 */
@Controller
@RequestMapping("/prepare")
public class PrepareController {

    /**
     * 在某个方法上增加 @ModelAttribute 注解, 那么在执行该 Handler 的任何一个方法前, 都会先调用这个方法
     */
    @ModelAttribute
    public void prepareModel(Integer id, Map<String, Object> map) {
        System.out.println("modelAttribute method execute...");
        // 假设从数据库中获取 user 数据
        User user = null;
        if (id == 100) {
            user = new User(100, "Kenny", "123456", "Kenny@163.com", "Guangzhou");
        }
        map.put("user", user);
        System.out.println("修改前的 user = " + user);
    }

    /**
     * 根据前端提交的表单数据对上面查询出 user 对象需要修改的字段进行修改
     * (表单中没有密码, 因此密码使用的是数据库中查询到的)
     * @param user  使用 request 域中的 user 对象接收前端信息
     */
    @RequestMapping("/modify")
    public String ModifyInfo(@ModelAttribute("user") User user, Map<String, Object> map) {
        System.out.println("修改后的 user = " + user);
        System.out.println("update user in db.");
        map.put("user", user);
        return "prepare_success";
    }
}