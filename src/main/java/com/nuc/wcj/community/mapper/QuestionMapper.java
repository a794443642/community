package com.nuc.wcj.community.mapper;

import com.nuc.wcj.community.dto.QuestionDto;
import com.nuc.wcj.community.model.Quesetion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface QuestionMapper {
    @Insert("insert into quesetion(title,description,gmt_create,gmt_modified,creator,tags) " +
            "values(#{title},#{description},#{gmt_create},#{gmt_modified},#{creator},#{tags}) ")
    void create(Quesetion quesetion);
    @Select("select * from quesetion where id=#{id}")
    Quesetion findbyid(long id);
    @Update("update quesetion set title=#{title},description=#{description},tags=#{tags},gmt_modified=#{gmt_modified} where id=#{id}")
    Integer update(Quesetion dbquesetion);
    @Update("update quesetion set reader_count= reader_count + #{reader_count} where id=#{id}")
    Integer updateView(Quesetion dbquestion);
    @Update("update quesetion set comment_cout= comment_cout +#{comment_cout} where id=#{id}")
    Integer updateCommon(Quesetion dbquestion);
}
