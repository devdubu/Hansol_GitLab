package com.hansol.project.dao;

import com.hansol.project.dto.HansolDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;

//repository
public interface HansolDAO {
    List<HansolDTO> getMemberData();
    List<HansolDTO> setMemberData();
}

