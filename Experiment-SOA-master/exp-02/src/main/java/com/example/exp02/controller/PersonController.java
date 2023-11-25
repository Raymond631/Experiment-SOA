package com.example.exp02.controller;

import com.example.exp02.common.response.CommonResponse;
import com.example.exp02.pojo.Person;
import com.example.exp02.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "人员管理")
public class PersonController {
    @Autowired
    private PersonService personService;

    @ApiOperation("添加人员")
    @PostMapping("/person")
    public CommonResponse addPerson(@RequestBody Person person) {
        personService.addPerson(person);
        return CommonResponse.success("http://localhost:8081/swagger-ui/index.html");
    }
}
