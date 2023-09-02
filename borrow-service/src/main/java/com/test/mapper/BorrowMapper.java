package com.test.mapper;

import com.test.entity.borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BorrowMapper {
    @Select("select * from DB_BORROW where uid = #{uid}")
    List<borrow> getBorrowsByUid(int uid);

    @Select("select * from DB_BORROW where bid = #{bid}")
    List<borrow> getBorrowsByBid(int bid);

    @Select("select * from DB_BORROW where bid = #{bid} and uid = #{uid}")
    borrow getBorrow(int uid, int bid);
}

