package com.mager.Mapper.MapperImp;

import com.mager.Mapper.IMapper.personBaseMapper;
import com.mager.Person;
import java.util.List;

/**
 * @ClassName PersonBaseMapperImpl
 * @Author 徐文
 * @Date 2019/11/6 14:19
 * @Description:
 */

public class PersonBaseMapperImpl implements personBaseMapper {
    @Override
    public int insertperson(Person object) {
        return 0;
    }

    @Override
    public int updateperson(Person object) {
        return 0;
    }

    @Override
    public int update(Person.UpdateBuilder object) {
        return 0;
    }

    @Override
    public List<Person> queryperson(Person object) {
        return null;
    }

    @Override
    public Person querypersonLimit1(Person object) {
        return null;
    }
}
