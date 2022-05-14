package com.hansol.project.controller;

import com.hansol.project.dao.HansolDAO;
import com.hansol.project.dto.HansolDTO;
import com.hansol.project.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DBConnectTestController {
    @Autowired
    private HansolDAO hansolDAO;

    @GetMapping("/")
    public List<HansolDTO> HelloWorld(){
        return hansolDAO.getMemberData();
    }
    @PostMapping('/login')
    public LoginForm Login(){
        LoginForm form = new LoginForm();

    }

}
