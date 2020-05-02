package com.nuc.wcj.community.mapper;

import com.nuc.wcj.community.dto.QuestionDto;
import com.nuc.wcj.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserMapper {
    @Insert("INSERT into user (account_id, NAME, TOKEN, GMT_CREAT, GMT_MODIFIED,avtar_url) values (#{account_id},#{name},#{token},#{gmt_creat},#{gmt_modified},#{avtar_url})")
    void insert(User user);
    @Select("SELECT * from user where TOKEN=#{token}")
    User findByToken(String token);
    @Select("select * from user where account_id=#{account_id};")
    User findbyAccounId(String account_id);
    @Update("update user set NAME=#{name},TOKEN=#{token},GMT_MODIFIED=#{gmt_modified},avtar_url=#{avtar_url} where id=#{id}")
    Integer update(User user);
}
