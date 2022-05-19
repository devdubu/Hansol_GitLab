package com.hansol.project.service;

import com.hansol.project.repository.HansolRepository;
import com.hansol.project.domain.HansolDomain;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HansolCRUD {

    private final HansolRepository hansolRepository;

    public HansolCRUD(HansolRepository hansolRepository){
        this.hansolRepository = hansolRepository;
    }
    public List<HansolDomain> findMembers(){
        return HansolRepository.getMemberData();
    }
    public void join(HansolDomain hansolDomain){
        HansolRepository.inputMemeberData(hansolDomain);
    }


}
