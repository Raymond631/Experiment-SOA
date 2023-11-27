package com.example.exp02.controller;

import com.example.exp02.common.response.CommonResponse;
import com.example.exp02.pojo.Person;
import com.example.exp02.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation("根据id查询人员")
    @GetMapping("/Person")
    public CommonResponse getPersonById(@RequestParam String id) {

        Person persson = personService.getPersonById(id);
        return CommonResponse.success();
    }

    @ApiOperation("更新人员信息")
    @PutMapping("/person")
    public CommonResponse updatePerson(@RequestBody Person person) {
        personService.updatePerson(person);
        return CommonResponse.success();
    }

    @ApiOperation("根据id删除人员")
    @DeleteMapping("/person")
    public CommonResponse deletePersonById(@RequestParam String id) {
        personService.deletePersonById(id);
        return CommonResponse.success();
    }

    @ApiOperation("根据name查询人员")
    @GetMapping("/person/name")
    public Person getPersonByName(@RequestParam String name) {
        return personService.getPersonByName(name);
    }

    @ApiOperation("根据id修改密码")
    @PutMapping("/person/password")
    public CommonResponse changePassword(@RequestParam String id, @RequestParam String password) {
        personService.changePassword(id, password);
        return CommonResponse.success();
    }

    @ApiOperation("根据id修改角色")
    @PutMapping("/person/role")
    public CommonResponse changeRole(@RequestParam String id, @RequestParam String role) {
        int role_id;
        switch (role) {
            case "root":
                role_id = 0;
                break;
            case "admin":
                role_id = 1;
                break;
            case "user":
                role_id = 2;
                break;
            default:
                role_id = 3;
                break;
        }
        personService.changeRole(id, role, role_id);
        return CommonResponse.success();
    }
}
