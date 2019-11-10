package com.mager.controller;

import com.mager.service.IMana;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description: TODO
 * @Author: 徐文
 * @Date: 2019/11/5 15:06
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/aplicationContext-service.xml"})
public class PersonTest  {

    @Test
    public void print() {
        System.out.println("jjjjj");
    }

}






























