package com.mager.Mapper.IMapper;

import com.mager.Person;

import java.util.List;
/**
*  @author author
*/
public interface personBaseMapper {

    int insertperson(Person object);

    int updateperson(Person object);

    int update(Person.UpdateBuilder object);

    List<Person> queryperson(Person object);

    Person querypersonLimit1(Person object);

}