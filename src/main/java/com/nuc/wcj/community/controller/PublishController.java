package com.nuc.wcj.community.controller;

import com.nuc.wcj.community.mapper.QuestionMapper;
import com.nuc.wcj.community.model.Quesetion;
import com.nuc.wcj.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class PublishController {
    @Autowired
    QuestionMapper questionMapper;
    @GetMapping("/publish")
    public String publish(){
        return "publish";
    }
    @PostMapping("/publish")
    public String doPublish(Quesetion quesetion, Model model, HttpServletRequest request){
        User user= (User) request.getSession().getAttribute("user");

        String title = quesetion.getTitle();
        model.addAttribute("title", title);
        String description = quesetion.getDescription();
        model.addAttribute("description", description);
        String tag = quesetion.getTag();
        model.addAttribute("tag", tag);
        System.out.println(title);
        if (user==null){
            model.addAttribute("error","用户未登录");
            return "publish";
        }
        if (title==null||title.equals("")){
            model.addAttribute("error","title不能为空");
            return "publish";
        }
        if (description==null||description.equals("")){
            model.addAttribute("error","description不能为空");
            return "publish";
        }
        if (tag==null||tag.equals("")){
            model.addAttribute("error","tag不能为空");
            return "publish";
        }
        quesetion.setCreator(user.getId());
        quesetion.setGmtcreate(System.currentTimeMillis());
        quesetion.setGmtmodified(quesetion.getGmtcreate());
        questionMapper.create(quesetion);
        return "redirect:/";
    }

}
