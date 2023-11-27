package com.example.exp02.service.impl;

import com.example.exp02.mapper.BorrowMapper;
import com.example.exp02.pojo.Borrow;
import com.example.exp02.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author cEV
 */
@Service
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    private BorrowMapper BorrowMapper;

    @Override
    public void addBorrowInfo(Borrow borrow) {
        BorrowMapper.addBorrowInfo(borrow);
    }

    @Override
    public void deleteBorrowInfo(String id) {
        BorrowMapper.deleteBorrowInfo(id);
    }

    @Override
    public Borrow getBorrowInfoById(String id) {
        return BorrowMapper.getBorrowInfoById(id);
    }

    @Override
    public Borrow getBorrowInfoByThingId(String thing_id) {
        return BorrowMapper.getBorrowInfoByThingId(thing_id);
    }

    @Override
    public Borrow getBorrowInfoByPersonId(String person_id) {
        return BorrowMapper.getBorrowInfoByPersonId(person_id);
    }

    @Override
    public void updateBorrowInfo(Borrow borrow) {
        BorrowMapper.updateBorrowInfo(borrow);
    }

    @Override
    public void updateBorrowInfoByReturn(String id, Boolean is_return, String actual_return_time) {
        BorrowMapper.updateBorrowInfoByReturn(id,is_return,actual_return_time);
    }

    @Override
    public List<Borrow> getAllBorrowInfo() {
        return BorrowMapper.getAllBorrowInfo();
    }
}
