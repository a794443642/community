package com.nuc.wcj.community.service;

import com.nuc.wcj.community.mapper.UserMapper;
import com.nuc.wcj.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public void createOrUpdate(User user) {
        User dbuser=userMapper.findbyAccounId(user.getAccount_id());
        if (dbuser==null){
            user.setGmt_creat(System.currentTimeMillis());
            user.setGmt_modified(user.getGmt_creat());
            userMapper.insert(user);
        }else{
            dbuser.setGmt_modified(System.currentTimeMillis());
            dbuser.setName(user.getName());
            dbuser.setAvtar_url(user.getAvtar_url());
            dbuser.setToken(user.getToken());
            userMapper.update(dbuser);
        }
    }
}
