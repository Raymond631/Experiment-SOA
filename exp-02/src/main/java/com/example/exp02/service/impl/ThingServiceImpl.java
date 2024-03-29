package com.example.exp02.service.impl;

import com.example.exp02.mapper.ThingMapper;
import com.example.exp02.pojo.Thing;
import com.example.exp02.service.ThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThingServiceImpl implements ThingService {
    @Autowired
    private ThingMapper thingMapper;

    @Override
    public void addThing(Thing thing) {
        thingMapper.insertThing(thing);
    }

    @Override
    public void deleteThingById(int id) {
        thingMapper.deleteThingById(id);
    }

    @Override
    public void updateThingById(Thing thing) {
        thingMapper.updateThingById(thing);
    }

    @Override
    public List<Thing> findThing() {
        return thingMapper.findThing();
    }

}
