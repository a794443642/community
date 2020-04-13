package com.nuc.wcj.community.controller;

import com.github.pagehelper.PageInfo;
import com.nuc.wcj.community.model.User;
import com.nuc.wcj.community.service.QuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ProfileContrller {
    @Autowired
    QuserService quserService;
    @GetMapping(value = {"/profile/{action}"})
    public String profile(@PathVariable(name = "action")String action, Model model,
                          HttpServletRequest request,
                          @RequestParam(defaultValue = "1") int pageNum,
                          @RequestParam(defaultValue = "5") int pageSize){
        User user= (User) request.getSession().getAttribute("user");
        if ("questions".equals(action)){
            PageInfo pageInfo=quserService.getQueserList(user.getAccount_id(),pageNum,pageSize);
            model.addAttribute("questions",pageInfo);
            model.addAttribute("section","questionaction");
            model.addAttribute("sectionName","我的提问");
        }else if ("replies".equals(action)){
            model.addAttribute("section","repliyaction");
            model.addAttribute("sectionName","最新回复");
        }
        return "profile";
    }
}
