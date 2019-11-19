package com.mager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName PageController
 * @Author 徐文
 * @Date 2019/11/5 23:27
 * @Description:
 */
@Controller
public class PageController {
    @RequestMapping("/{page}")


    public String showPage(@PathVariable String page) {
        System.out.println("ss");
        return page;
    }
}
