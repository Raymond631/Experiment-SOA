package com.example.exp02.service;

import com.example.exp02.pojo.Borrow;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author cEV
 */
public interface BorrowService {
    void addBorrowInfo(Borrow borrow);

    void deleteBorrowInfo(String id);

    Borrow getBorrowInfoById(String id);

    Borrow getBorrowInfoByThingId(String thing_id);

    Borrow getBorrowInfoByPersonId(String person_id);

    void updateBorrowInfo(Borrow borrow);

    void updateBorrowInfoByReturn(String id, Boolean is_return, String actual_return_time);

    List<Borrow> getAllBorrowInfo();
}
