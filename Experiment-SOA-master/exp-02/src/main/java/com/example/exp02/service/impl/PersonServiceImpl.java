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
}
