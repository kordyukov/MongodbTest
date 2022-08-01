package com.example.mongodbtest.repo;

import com.example.mongodbtest.entity.Test;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends MongoRepository<Test, String> {
}
