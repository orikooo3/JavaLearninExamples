package com.example.learning.supportclass.code2;

public class ClassB {

    public static int a = 97;
    static int b = 98;
    public int c = 99;
    int d = 100;

    public ClassB() {
    }

    ClassB(int dummy) {
        System.out.println(ClassB.a);
        System.out.println(this.a);

        System.out.println(ClassB.b);
        System.out.println(this.b);

        // System.out.println(ClassB.c);
        System.out.println(this.c);

        // System.out.println(ClassB.d);
        System.out.println(this.d);
    }
}
