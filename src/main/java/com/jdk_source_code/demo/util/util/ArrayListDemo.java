package com.jdk_source_code.demo.util.util;

import com.jdk_source_code.demo.util.entity.User;
import com.jdk_source_code.demo.util.lang.DoubleDemo;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author lilin
 * @date 2019-10-10
 */
public class ArrayListDemo {

    public static void main(String[] args) {
       List list = new ArrayList();
       list.add("aaa");
       list.add(1);
       list.add(2);
       list.add(null);
       list.add(null);
       list.add("aaa");
       System.out.println(list);
       System.out.println(list.contains(1));
       System.out.println(list.indexOf(78));
       System.out.println(list.get(1));
       System.out.println(list.remove("aaa"));
       System.out.println(list);
        System.out.println(list.subList(0,2));

        List<Integer> list2 = new ArrayList<>();
        list2.add(42);
        list2.add(543);
        list2.add(1);
        list2.add(21);
        list.addAll(list2);
        System.out.println(list);
        Collections.sort(list2);
        Collections.reverse(list2);
        System.out.println(list2);

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

        System.out.println("business_id".compareTo("business"));

        String change = "-10";
        String type = change.substring(0,1);
        System.out.println(type);
        String amount = change.substring(1);
        System.out.println(amount);


        String time = "1573812266.900536";
        double timeD = new Double(time);
        timeD = timeD*1000;
        long date = (long)timeD;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = format.format(date);
        System.out.println(format1);

    }
}
