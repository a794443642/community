package com.nuc.wcj.community.controller;

import com.github.pagehelper.PageInfo;
import com.nuc.wcj.community.mapper.UserMapper;
import com.nuc.wcj.community.model.User;
import com.nuc.wcj.community.service.QuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    QuserService quserService;
    @GetMapping("/")
    public String index(HttpServletRequest request,Model model,
                        @RequestParam(defaultValue = "1") int pageNum,
                        @RequestParam(defaultValue = "5") int pageSize){
        PageInfo pageInfo=quserService.getQueserList(pageNum,pageSize);
        model.addAttribute("questions",pageInfo);
        return "index";
    }
}
