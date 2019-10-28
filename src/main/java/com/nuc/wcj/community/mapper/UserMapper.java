package com.nuc.wcj.community.mapper;

import com.nuc.wcj.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
@Repository
@Mapper
public interface UserMapper {
    @Insert("INSERT into user (account_id, NAME, TOKEN, GMT_CREAT, GMT_MODIFIED) values (#{account_id},#{name},#{token},#{gmt_creat},#{gmt_modified})")
    void insert(User user);
    @Select("SELECT * from user where TOKEN=#{token}")
    User findByToken(String token);
}
