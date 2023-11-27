package com.example.exp02.mapper;

import com.example.exp02.pojo.Thing;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ThingMapper {
    void insertThing(Thing thing);

    void deleteThingById(@Param("id") int id);

    void updateThingById(Thing thing);

    List<Thing> findThing();
}
