package com.mager.controller;

import com.mager.Person;
import com.mager.service.IMana;
import com.mager.service.UsersService;
import com.mager.service.impl.ManaImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UsersController
 * @Author 徐文
 * @Date 2019/11/5 23:30
 * @Description:
 */
@Scope("prototype")
@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService userService;


    @RequestMapping("/addUser")
    public String addUser(Person person) {
        userService.addUser(person);
        return "jjj";
    }
}
