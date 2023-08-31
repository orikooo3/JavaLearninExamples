package com.example.learning.exception.code6;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        // 例外発生
        p.setAge(-1);
    }
}
