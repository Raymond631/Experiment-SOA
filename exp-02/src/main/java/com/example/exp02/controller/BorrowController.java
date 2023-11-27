package com.example.exp02.controller;

import com.example.exp02.common.response.CommonResponse;
import com.example.exp02.pojo.Borrow;
import com.example.exp02.service.BorrowService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Api(tags = "借还模块")
public class BorrowController {

    @Autowired
    private BorrowService borrowService;

    @ApiOperation("添加借用信息")
    @PostMapping("/borrows")
    public CommonResponse addBorrowInfo(@RequestBody Borrow borrow) {
        borrowService.addBorrowInfo(borrow);
        return CommonResponse.success(borrow);
    }
    @ApiOperation("删除借用信息")
    @DeleteMapping("/borrows/{id}")
    public CommonResponse deleteBorrowInfo(@PathVariable String id) {
        borrowService.deleteBorrowInfo(id);
        return CommonResponse.success();
    }
    @ApiOperation("获取所有借用信息")
    @GetMapping("/borrows")
    public CommonResponse getAllBorrowInfo() {
        List<Borrow> borrowList = borrowService.getAllBorrowInfo();
        return CommonResponse.success( borrowList);
    }
    @ApiOperation("根据id获取借用信息")
    @GetMapping("/borrows/{id}")
    public CommonResponse getBorrowInfoById(@PathVariable String id) {
        Borrow borrow = borrowService.getBorrowInfoById(id);
        return CommonResponse.success(borrow);
    }
    @ApiOperation("根据物品id获取借用信息")
    @GetMapping("/borrows/thing/{thingId}")
    public CommonResponse getBorrowInfoByThingId(@PathVariable("thingId") String thingId) {
        Borrow borrow = borrowService.getBorrowInfoByThingId(thingId);
        return CommonResponse.success(borrow);
    }
    @ApiOperation("根据人员id获取借用信息")
    @GetMapping("/borrows/person/{personId}")
    public CommonResponse getBorrowInfoByPersonId(@PathVariable("personId") String personId) {
        Borrow borrow = borrowService.getBorrowInfoByPersonId(personId);
        return CommonResponse.success(borrow);
    }
    @ApiOperation("更新借用信息")
    @PutMapping("/borrows")
    public CommonResponse updateBorrowInfo(
            @RequestBody Borrow borrow
    ) {
        borrowService.updateBorrowInfo(borrow);
        return CommonResponse.success();
    }
    @ApiOperation("更新借用返还时间")
    @PatchMapping("/borrows/{id}")
    public CommonResponse updateBorrowInfoByReturn(
            @PathVariable String id,
            @RequestParam Boolean is_return,
            @RequestParam String actual_return_time
    ) {
        borrowService.updateBorrowInfoByReturn(id, is_return, actual_return_time);
        return CommonResponse.success();
    }


}
