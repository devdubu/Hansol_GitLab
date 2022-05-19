package com.hansol.project.controller;

import com.hansol.project.repository.TestDTO;
import com.hansol.project.service.HansolCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
