package com.nuc.wcj.community;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.nuc.wcj.community.mapper")
@SpringBootApplication
public class CommunityApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(CommunityApplication.class);
    }

}
