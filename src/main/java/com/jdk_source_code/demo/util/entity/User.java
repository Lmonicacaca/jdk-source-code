package com.jdk_source_code.demo.util.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

    public static void main(String[] args) {
        List<User> listUser = new ArrayList<>();
        User user1 = new User("李四",29);
        User user2 = new User("张三",18);
        User user3 = new User("王五",30);
        User user4 = new User("李天一",40);
        listUser.add(user1);
        listUser.add(user2);
        listUser.add(user3);
        listUser.add(user4);
        Collections.sort(listUser, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if(o1.getAge()>o2.getAge()){
                    return 1;
                }
                if(o1.getAge()<o2.getAge()){
                    return -1;
                }
                return 0;
            }
        });

        System.out.println(listUser);
    }
}
