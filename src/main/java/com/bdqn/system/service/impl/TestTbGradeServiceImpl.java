package com.bdqn.system.service.impl;

import com.bdqn.system.mapper.TestTbGradeMapper;
import com.bdqn.system.pojo.TestTbGrade;
import com.bdqn.system.service.TestTbGradeService;

import java.util.List;

public class TestTbGradeServiceImpl implements TestTbGradeService {

    private TestTbGradeMapper testTbGradeMapper;

    @Override
    public List<TestTbGrade> findAll() {
        return testTbGradeMapper.findAll();
    }
}
