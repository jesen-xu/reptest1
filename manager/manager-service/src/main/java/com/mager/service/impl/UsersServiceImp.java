package com.mager.service.impl;

import com.mager.Mapper.MapperImp.PersonBaseMapperImpl;
import com.mager.Person;
import com.mager.Mapper.IMapper.personBaseMapper;
import com.mager.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName UsersServiceImp
 * @Author 徐文
 * @Date 2019/11/5 23:38
 * @Description:
 */
@Component(value = "UsersService")
public class UsersServiceImp implements UsersService {
//    @Autowired
//    PersonBaseMapperImpl personBaseMapperImpl;
    @Override
    public void addUser(Person person) {
        System.out.println(person.getName() +" "+person.getOld()+""+person.toString());
//        personBaseMapperImpl.insertperson(person);
    }
}
