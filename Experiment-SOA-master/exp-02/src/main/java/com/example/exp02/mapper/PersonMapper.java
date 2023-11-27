package com.example.exp02.mapper;

import com.example.exp02.pojo.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper {
    void insertPerson(Person person);
}
