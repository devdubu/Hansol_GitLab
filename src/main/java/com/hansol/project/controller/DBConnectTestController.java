package com.hansol.project.controller;

import com.hansol.project.repository.HansolRepository;
import com.hansol.project.domain.HansolDomain;
import com.hansol.project.service.HansolCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DBConnectTestController {

    private final HansolCRUD hansolCRUD;
    @Autowired
    public DBConnectTestController(HansolCRUD hansolCRUD){
        this.hansolCRUD = hansolCRUD;
    }

    private HansolDomain hansolDomain;

    @PostMapping("/add")
    public List<HansolDomain> Login(){
        return hansolCRUD.inputMemeberData(hansolDomain);
    }
    @GetMapping("/")
    public List<HansolDomain> HelloWorld(){
        return hansolCRUD.findMembers();
    }


}
