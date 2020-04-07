package com.nuc.wcj.community.mapper;

import com.nuc.wcj.community.dto.QuestionDto;
import com.nuc.wcj.community.model.Quesetion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface QuestionMapper {
    @Insert("insert into quesetion(title,description,gmt_create,gmt_modified,creator,tags) " +
            "values(#{title},#{description},#{gmt_create},#{gmt_modified},#{creator},#{tag}) ")
    void create(Quesetion quesetion);

}
