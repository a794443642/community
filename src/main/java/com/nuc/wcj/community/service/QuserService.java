package com.nuc.wcj.community.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuc.wcj.community.dto.QuestionDto;
import com.nuc.wcj.community.mapper.Question1Mapper;

import com.nuc.wcj.community.mapper.QuestionMapper;
import com.nuc.wcj.community.model.Quesetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class QuserService {
    @Autowired
    Question1Mapper question1Mapper;
    @Autowired
    QuestionMapper questionMapper;
    public PageInfo getQueserList(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<QuestionDto> questionDtos = question1Mapper.findall();
        PageInfo<QuestionDto> pageInfo=new PageInfo<QuestionDto>(questionDtos);
        return pageInfo;
    }
    public PageInfo getQueserList(String account_id,int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<QuestionDto> questionDtos = question1Mapper.findallbycreatorid(account_id);
        PageInfo<QuestionDto> pageInfo=new PageInfo<QuestionDto>(questionDtos);
        return pageInfo;
    }

    public QuestionDto findById(Integer id) {
        return question1Mapper.findById(id);
    }
    public void insert(Quesetion quesetionq){
        questionMapper.create(quesetionq);
    }
}
