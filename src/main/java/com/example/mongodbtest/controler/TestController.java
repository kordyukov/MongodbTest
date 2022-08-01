package com.example.mongodbtest.controler;

import com.example.mongodbtest.entity.Test;
import com.example.mongodbtest.repo.TestRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestRepo testRepo;

    @GetMapping
    public List<Test> getTest(){
        return testRepo.findAll();
    }

    @PostMapping
    public List<Test> saveTest(@RequestBody Test test){
        testRepo.save(test);
        return testRepo.findAll();
    }
}
