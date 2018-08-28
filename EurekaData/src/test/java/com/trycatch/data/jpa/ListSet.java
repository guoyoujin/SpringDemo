package com.trycatch.data.jpa;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListSet {
    @Test
    public  void test1() {
//        String s1 = new String("aaa");
//        String s2 = new String("aaa");
//        String s3 = "bbb";
//        String s4 = "bbb";
//        String s5 = new String("ccc");
//        String s6 = s5;
//        String s7 = "ccc";
//        String s8 = s7;
//        System.out.println(s5 == s6);
//        System.out.println(s5.equals(s6));
//        System.out.println(s7 == s8);
//        System.out.println(s7.equals(s8));
//        System.out.println("======s1,s2======");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println("======s3,s4======");
//        System.out.println(s3 == s4);
//        System.out.println(s3.equals(s4));
//        System.out.println(s3.hashCode());
//        System.out.println(s4.hashCode());
//        System.out.println("======add======");
//        Set hashset = new HashSet();
//        System.out.println(hashset.add(s1));
//        System.out.println(hashset.add(s2));
//        System.out.println("======add=s1,s2=====");
//        System.out.println(hashset.add(s3));
//        System.out.println(hashset.add(s4));
//        System.out.println("=====size=s3,s4======");
//        Iterator it = hashset.iterator();
//        System.out.println(hashset.size());
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//
        String s9 = new StringBuilder().append("aa").append("bb").toString();

        System.out.println(s9.intern() == s9);

        String s10 = new StringBuilder().append("ja").append("va").toString();

        System.identityHashCode(s10);
        System.out.println(System.identityHashCode(s10));
        System.out.println(s10.intern().equals(s10));
        System.out.println(System.identityHashCode(s10));
        System.out.println(System.identityHashCode(s10.intern()));
        System.out.println(s10.intern() == s10);


        String s11 = new String("taobao.com");
        System.out.println(s11.intern().equals(s11));
        System.out.println(System.identityHashCode(s11));
        System.out.println(System.identityHashCode(s11.intern()));
        System.out.println(s11.intern() == s11);

        String s12 = "taobao";
        System.out.println(s12.intern().equals(s12));
        System.out.println(System.identityHashCode(s12));
        System.out.println(System.identityHashCode(s12.intern()));
        System.out.println(s12.intern() == s12);

    }
}
