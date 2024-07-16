package com.omega.demo06.controller;

import com.omega.demo06.entity.Monster;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Map;

/**
 * Class MonsterHandler
 *
 * @author KennySo
 * @date 2024/7/16
 */
@Controller
@RequestMapping("/monster")
public class MonsterHandler {

    /**
     * 取消绑定 前端表单提交的值给 monster 的 name 属性
     * 1. WebDataBinder 是 DataBinder 的子类，用于完成由表单字段到 JavaBean 属性的绑定
     * 2. setDisallowedFields() 是可变形参，可以指定多个字段
     * 3. 当属性不接收前端传来的值时, 该属性就使用默认值（程序员定义）
     * 4. 一般来说, 如果属性不接收表单传来的值, 则该对象字段的验证就没有意义了, 记得注释
     */
//    @InitBinder
//    public void initBinder(WebDataBinder dataBinder) {
//        dataBinder.setDisallowedFields("name");
//    }

    @RequestMapping("/add")
    public String addMonster(Monster monster) { // 自动保存到request域
        System.out.println("monster = " + monster);
        return "data_transfer_success";
    }

    /**
     * 1. @Valid 注解用来标识对 monster 接收的数据进行校验
     * 2. Errors error 表示如果校验除错误, 将每一个字段校验的错误的信息保存到 errors
     * 3. map 里封装了 monster 对象 和 errors 对象
     * 4. 校验发生的时机: 在反射调用目标方法前, 会接收到 http 请求的数据, 然后根据注解来进行验证,
     *    在验证的过程中, 如果出现了错误, 就吧错误信息填充到 errors 和 map 中.
     */
    @RequestMapping("/add2")
    public String addMonster2(@Valid Monster monster, Errors errors, Map<String, Object> map) {
        System.out.println("monster = " + monster);
        if (errors.hasErrors()) {
            for (ObjectError error : errors.getAllErrors()) {
                String fieldName = error.getObjectName() + "_" + ((FieldError) error).getField();
                map.put(fieldName, error.getDefaultMessage());
            }
            return "forward:/demo06/data_valid.jsp";
        }
        return "data_valid_success";
    }
}
