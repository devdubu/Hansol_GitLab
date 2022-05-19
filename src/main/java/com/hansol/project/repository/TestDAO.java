package com.hansol.project.repository;

import com.hansol.project.repository.TestDTO;

import java.util.List;

public interface TestDAO {
    List<TestDTO> getTestData();
}
/*
* 이는 인터페이스 내에 정의되어 mapper와 연결되어있으므로 mapper의 getTestData와 메소드 명이 동일해야함
* */