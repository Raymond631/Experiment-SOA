package com.example.exp02.mapper;

import com.example.exp02.pojo.Borrow;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author cEV
 */
@Mapper
public interface BorrowMapper {

    void addBorrowInfo(Borrow borrow);

    void deleteBorrowInfo(String id);

    Borrow getBorrowInfoById(String id);

    Borrow getBorrowInfoByThingId(String thingId);

    Borrow getBorrowInfoByPersonId(String personId);

    void updateBorrowInfo(Borrow borrow);

    void updateBorrowInfoByReturn(
            String id,
            Boolean isReturn,
            String actualReturnTime
    );

    List<Borrow> getAllBorrowInfo();
}

