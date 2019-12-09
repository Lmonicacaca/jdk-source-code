package com.jdk_source_code.demo.util.util;

import java.util.Date;

/**
 * @author lilin
 * @date 2019-12-09
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        Date date2 = new Date(1575882868765L);
        System.out.println(date.compareTo(date2));
//        System.out.println(date2);
//        System.out.println(date.before(date2));
//

    }
}
