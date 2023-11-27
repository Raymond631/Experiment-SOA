package com.example.exp02.controller;

import com.example.exp02.common.response.CommonResponse;
import com.example.exp02.pojo.Thing;
import com.example.exp02.service.ThingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "物资管理")
public class ThingController {
    @Autowired
    private ThingService thingService;

    @ApiOperation("录入物资信息")
    @PostMapping("/thing")
    public CommonResponse add(@RequestBody Thing thing) {
        thingService.addThing(thing);
        return CommonResponse.success("");
    }

    @ApiOperation("删除物资信息")
    @DeleteMapping("/thing")
    public CommonResponse delete(@RequestParam int id) {
        thingService.deleteThingById(id);
        return CommonResponse.success("");
    }

    @ApiOperation("更新物资信息")
    @PutMapping("/thing")
    public CommonResponse update(Thing thing) {
        thingService.updateThingById(thing);
        return CommonResponse.success("");
    }

    @ApiOperation("获取物资信息")
    @GetMapping("/things")
    public CommonResponse list() {
        List<Thing> list = thingService.findThing();
        return CommonResponse.success("", list, "");
    }
}
