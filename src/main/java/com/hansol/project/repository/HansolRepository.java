package com.hansol.project.repository;

import com.hansol.project.domain.HansolDomain;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface HansolRepository {
    List<HansolDomain> getMemberData();
    List<HansolDomain> inputMemeberData(HansolDomain hansolDomain);


}

