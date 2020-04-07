package com.nuc.wcj.community.mapper;

import com.nuc.wcj.community.dto.QuestionDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface Question1Mapper {
    List<QuestionDto> findall();
}
