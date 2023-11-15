package com.example.exp02.mapper;

import com.example.exp02.pojo.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper {
    void insertPerson(Person person);

    Person getPersonById(String id);

    void updatePerson(Person person);

    void deletePersonById(String id);

    Person getPersonByName(String name);

    void changePassword(String id, String password);

    void changeRole(String id, String role, int role_id);
}
