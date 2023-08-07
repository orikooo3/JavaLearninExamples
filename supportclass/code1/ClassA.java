package com.example.learning.supportclass.code1;

import com.example.learning.supportclass.code2.ClassB;

public class ClassA {

    public static void main(String[] args) {
        System.out.println(ClassB.a);
        System.out.println(new ClassB().a);

        // System.out.println(ClassB.b);
        // System.out.println(new ClassB().b);

        // System.out.println(ClassB.c);
        System.out.println(new ClassB().c);

        // System.out.println(ClassB.d);
        // System.out.println(new ClassB().d);
    }
}
