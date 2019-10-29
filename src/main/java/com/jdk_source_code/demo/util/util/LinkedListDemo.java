package com.jdk_source_code.demo.util.util;

import java.util.LinkedList;

/**
 * @author lilin
 * @date 2019-10-29
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        list.add(3);
        list.add("34");
        Object first = list.getFirst();
        System.out.println(first);
        Object last = list.getLast();
        System.out.println(last);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        list.add("543");
        list.addFirst(90);
        System.out.println(list);
        System.out.println(list.peek());
        list.poll();
        System.out.println(list);
    }
}
