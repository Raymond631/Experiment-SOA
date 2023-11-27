package com.example.exp02.service;

import com.example.exp02.pojo.Thing;

import java.util.List;

public interface ThingService {
    void addThing(Thing thing);

    void deleteThingById(int id);

    void updateThingById(Thing thing);

    List<Thing> findThing();
}
