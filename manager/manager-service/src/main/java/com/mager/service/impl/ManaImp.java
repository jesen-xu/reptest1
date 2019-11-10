package com.mager.service.impl;

import com.mager.service.IMana;
import org.springframework.stereotype.Component;

/**
 * @ClassName service
 * @Author 徐文
 * @Date 2019/11/5 15:46
 * @Description:
 */
@Component
public class ManaImp implements IMana {
    @Override
    public void print(){
        System.out.println("测试test");
    }
}
