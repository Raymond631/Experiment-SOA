package com.example.exp02.service;

import com.example.exp02.pojo.Person;

public interface PersonService {
    void addPerson(Person person);

    Person getPersonById(String id);

    void updatePerson(Person person);

    void deletePersonById(String id);

    Person getPersonByName(String name);

    void changePassword(String id, String password);

    void changeRole(String id, String role, int role_id);
}
