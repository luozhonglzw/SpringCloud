package com.test.Mapper;

import com.test.entity.book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper {
    @Select("select * from db_book where bid = #{bid}")
    book getBookById(int bid);
}
