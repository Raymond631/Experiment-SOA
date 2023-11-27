package com.example.exp02.service;

import com.example.exp02.pojo.Thing;

import java.util.List;

public interface ThingService {
    void addThing(Thing thing);

    List<Thing> findThing();

    int findId(Thing thing);

    void updateThingById(Thing thing);

    void deleteThingById(Thing thing);
}
