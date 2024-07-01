package com.omega.demo02.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Class BookServlet
 *
 * @author KennySo
 * @date 2024/7/2
 */
@Controller
public class BookServlet {

    /**
     * 查询操作
     */
    @GetMapping("/books/{id}")
    // @RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
    public String getBook(@PathVariable("id") String id) {
        System.out.println("查询书籍id = " + id);
        return "success";
    }

    /**
     * 添加操作
     */
    @PostMapping("/books")
    // @RequestMapping(value = "/books", method = RequestMethod.POST)
    public String addBook(String bookName) {
        System.out.println("添加书籍bookName = " + bookName);
        return "success";
    }

    /**
     * 删除操作
     */
    @DeleteMapping(value = "/books/{id}")
    // @RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
    public String delBook(@PathVariable("id") String id) {
        System.out.println("删除书籍id = " + id);
        // return "success";  // 如果这样返回, 会报错 JSPs only permit GET POST or HEAD 异常
        return "redirect:/books/success";   // 需要重定向到一个没有指定 method 的 Handler 方法
    }

    /**
     * 修改操作
     */
    @PutMapping("/books")
    public String updateBook(String id) {
        System.out.println("修改书籍id = " + id);
        return "redirect:/books/success";
    }

    @RequestMapping(value = "/books/success")
    public String success() {
        return "success";  // 由该方法转发到 success.jsp 页面
    }

}
