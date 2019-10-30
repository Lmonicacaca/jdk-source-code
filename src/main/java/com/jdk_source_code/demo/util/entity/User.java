package com.jdk_source_code.demo.util.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lilin
 * @date 2019-10-30
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 9093453312L;
    private String name;
    private Integer age;
    public  User(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public User(){

    }
}
