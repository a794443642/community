package com.nuc.wcj.community.mapper;

import com.nuc.wcj.community.CommunityApplication;
import com.nuc.wcj.community.dto.QuestionDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CommunityApplication.class)
public class QuestionMapperTest {
    @Autowired
    Question1Mapper questionMapper;
    @Test
    public void findall() {
        List<QuestionDto> questionDtos=questionMapper.findall();
        for (QuestionDto questionDto:questionDtos){
            System.out.println(questionDto.toString());
        }
    }
}