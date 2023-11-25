package com.example.exp02.controller;

import com.example.exp02.common.response.CommonResponse;
import com.example.exp02.pojo.Borrow;
import com.example.exp02.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class BorrowController {

    @Autowired
    private BorrowService borrowService;

    @PostMapping("/borrows")
    public CommonResponse addBorrowInfo(@RequestBody Borrow borrow) {
        borrowService.addBorrowInfo(borrow);
        return CommonResponse.success("添加借用信息成功", borrow, "/borrows/" + borrow.getId());
    }

    @DeleteMapping("/borrows/{id}")
    public CommonResponse deleteBorrowInfo(@PathVariable String id) {
        borrowService.deleteBorrowInfo(id);
        return CommonResponse.success("删除成功", null, "/borrows");
    }

    @GetMapping("/borrows")
    public CommonResponse getAllBorrowInfo() {
        List<Borrow> borrowList = borrowService.getAllBorrowInfo();
        return CommonResponse.success("获取所有借用信息成功", borrowList, null);
    }

    @GetMapping("/borrows/{id}")
    public CommonResponse getBorrowInfoById(@PathVariable String id) {
        Borrow borrow = borrowService.getBorrowInfoById(id);
        return CommonResponse.success("获取借用信息成功", borrow, null);
    }

    @GetMapping("/borrows/thing/{thingId}")
    public CommonResponse getBorrowInfoByThingId(@PathVariable("thingId") String thingId) {
        Borrow borrow = borrowService.getBorrowInfoByThingId(thingId);
        return CommonResponse.success("获取借用信息成功", borrow, null);
    }

    @GetMapping("/borrows/person/{personId}")
    public CommonResponse getBorrowInfoByPersonId(@PathVariable("personId") String personId) {
        Borrow borrow = borrowService.getBorrowInfoByPersonId(personId);
        return CommonResponse.success("获取借用信息成功", borrow, null);
    }

    @PutMapping("/borrows/{id}")
    public CommonResponse updateBorrowInfo(
            @RequestBody Borrow borrow
    ) {
        borrowService.updateBorrowInfo(borrow);
        return CommonResponse.success("更新借用信息成功", borrow, null);
    }

    @PatchMapping("/borrows/{id}")
    public CommonResponse updateBorrowInfoByReturn(
            @PathVariable String id,
            @RequestParam Boolean is_return,
            @RequestParam LocalDateTime actual_return_time
    ) {
        borrowService.updateBorrowInfoByReturn(id, is_return, actual_return_time);
        return CommonResponse.success("更新借用信息成功", null, null);
    }


}
