package com.example.mongodbtest.service;

import com.example.mongodbtest.repo.TestRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestRepoService {
@Autowired
private TestRepo testRepo;

public void find(){
    testRepo.findAll();
}


}
