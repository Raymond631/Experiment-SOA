package com.example.exp02.controller;

import com.example.exp02.common.response.CommonResponse;
import com.example.exp02.pojo.Thing;
import com.example.exp02.service.PersonService;
import com.example.exp02.service.ThingService;
import com.example.exp02.util.JsonRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller //物资对外接口的声明类
@Api(tags = "物资管理")
public class ThingController {
    @Autowired
    private ThingService thingService;

//    @ApiOperation("测试")
//    @RequestMapping("/test")//测试
//    @ResponseBody
//    public String hello(){
//        return "test ok";
//    }

    /*
    * 获取所有的物资信息
    * 1>路径-确认资源-物资-------->/things
    * 2>方法--->get
    * 3>参数--->null
    * 4>响应-所有物资信息--->list<thing>--->json
    *
    * */
    @ApiOperation("获取物资信息")
    @RequestMapping(value = "/things",method = RequestMethod.GET)
    @ResponseBody
    public List<Thing> list(){


        //查询Mysql获取物资信息Arrays.asList(new Thing(0,"苹果", 4,"个"),new Thing(1,"书本", 5,"本"));
        List<Thing> list = thingService.findThing();
        return list;
    }


    /*
     * 新增一个物资
     * 1>路径-确认资源-物资-------->/things
     * 2>方法--->POST
     * 3>参数--->id,name,quantity,unit
     * 4>响应-新增物资信息--->thing--->json
     *
     * */
    @ApiOperation("录入物资信息")
    @RequestMapping(value = "/things",method = RequestMethod.POST)
    @ResponseBody
    public Thing add(Thing thing){
        //录入Mysql物资信息,获取自增id
        thingService.addThing(thing);
        thing.setId(thingService.findId(thing));

        return thing;
    }



    /*
     * 更新一个物资
     * 1>路径-确认资源-物资-------->/things
     * 2>方法--->PUT
     * 3>参数--->id,name,quantity,unit
     * 4>响应-修改后的物资信息--->thing--->json
     *
     * */
    @ApiOperation("更新物资信息")
    @RequestMapping(value = "/things",method = RequestMethod.PUT)
    @ResponseBody
    public Thing update(Thing thing){
        thingService.updateThingById(thing);
        thing.setName(thing.getName()+"_update");
        return thing;
    }



    /*
     * 删除一个物资
     * 1>路径-确认资源-物资-------->/things
     * 2>方法--->DELETE
     * 3>参数--->id
     * 4>响应-删除后状态--->JsonRequest--->json
     *JsonRequest:统一的响应返回值
     * */
    @ApiOperation("删除物资信息")
    @RequestMapping(value = "/things",method = RequestMethod.DELETE)
    @ResponseBody
    public JsonRequest delete(int id){
        thingService.deleteThingById(new Thing(id,"any", 666,"any"));
        return JsonRequest.success();
    }
}
