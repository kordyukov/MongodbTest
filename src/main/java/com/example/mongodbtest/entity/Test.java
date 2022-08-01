package com.example.mongodbtest.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Document
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Test implements Serializable {
    @Id
    private String id;
    private String name;
    private Integer age;
}
