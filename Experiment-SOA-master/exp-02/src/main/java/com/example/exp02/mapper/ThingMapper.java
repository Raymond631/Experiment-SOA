package com.example.exp02.mapper;

import com.example.exp02.pojo.Thing;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ThingMapper {
    void insertThing(Thing thing);
    List<Thing> findThing();
    int findId(Thing thing);
    void updateThingById(Thing thing);
    void deleteThingById(Thing thing);
}
