package com.nuc.wcj.community.controller;

import com.nuc.wcj.community.dto.QuestionDto;
import com.nuc.wcj.community.service.QuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class QuestionController {
    @Autowired
    QuserService quserService;
    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id")Integer id, Model model){
        QuestionDto questionDto=quserService.findById(id);
        model.addAttribute("questioninfo",questionDto);
        return "question";
    }

}
