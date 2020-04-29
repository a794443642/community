package com.nuc.wcj.community.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuc.wcj.community.dto.QuestionDto;
import com.nuc.wcj.community.mapper.Question1Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class QuserService {
    @Autowired
    Question1Mapper questionMapper;
    public PageInfo getQueserList(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<QuestionDto> questionDtos = questionMapper.findall();
        PageInfo<QuestionDto> pageInfo=new PageInfo<QuestionDto>(questionDtos);
        return pageInfo;
    }
    public PageInfo getQueserList(String account_id,int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<QuestionDto> questionDtos = questionMapper.findallbycreatorid(account_id);
        PageInfo<QuestionDto> pageInfo=new PageInfo<QuestionDto>(questionDtos);
        return pageInfo;
    }

    public QuestionDto findById(Integer id) {
        return questionMapper.findById(id);
    }
}
