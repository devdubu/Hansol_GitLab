package com.hansol.project.controller;

import com.hansol.project.dao.HansolDAO;
import com.hansol.project.dto.HansolDTO;
import com.hansol.project.dto.TestDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class LoginController {
    @GetMapping("/login")
    public String Join(){
        return  "HansolMemberJoin.html";
    }

    @PostMapping("/login")
    public String Login(LoginForm form){

        TestDTO testDTO = new TestDTO();
        testDTO.setId(form.getEmail());
        testDTO.setPassword(form.getPassword());

        return "redirect:/";
    }

}
