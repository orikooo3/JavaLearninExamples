package com.example.learning.object.code1;

public class Main {
    public static void main(String[] args) {

        Hello h = new Hello();
        String s = h.toString();
        int num = 20;
        Object obj = 10;
        h.printAnything(s);
        h.printAnything(num);
        h.printAnything(obj);
    }
}
