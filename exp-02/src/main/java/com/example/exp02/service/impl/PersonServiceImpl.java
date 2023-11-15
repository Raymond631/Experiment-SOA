package com.example.exp02.service.impl;

import com.example.exp02.mapper.PersonMapper;
import com.example.exp02.pojo.Person;
import com.example.exp02.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public void addPerson(Person person) {
        personMapper.insertPerson(person);
    }

    @Override
    public Person getPersonById(String id) {
        return personMapper.getPersonById(id);
    }

    @Override
    public void updatePerson(Person person) {
        personMapper.updatePerson(person);
    }

    @Override
    public void deletePersonById(String id) {
        personMapper.deletePersonById(id);
    }

    @Override
    public Person getPersonByName(String name) {
        return personMapper.getPersonByName(name);
    }

    @Override
    public void changePassword(String id, String password) {
        personMapper.changePassword(id, password);
    }

    @Override
    public void changeRole(String id, String role, int role_id) {
        personMapper.changeRole(id, role, role_id);
    }
}
