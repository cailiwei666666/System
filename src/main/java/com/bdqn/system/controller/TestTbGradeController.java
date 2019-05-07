package com.bdqn.system.controller;

import com.bdqn.system.pojo.TestTbGrade;
import com.bdqn.system.service.TestTbGradeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RestController
public class TestTbGradeController {

    private TestTbGradeService testTbGradeService;

    @PostMapping("/findAll")
    public List<TestTbGrade> findAll(){
        List<TestTbGrade> list = testTbGradeService.findAll();
        return list;
    }



}
