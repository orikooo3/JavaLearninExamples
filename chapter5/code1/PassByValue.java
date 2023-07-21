package com.example.learning.chapter5.code1;

public class PassByValue {

    public static void main(String[] args) {
        int value = 10;
        System.out.println(value);
        passValue(value);
        System.out.println(value);
    }

    public static void passValue(int value) {
        value++;
        // 元の変数には影響を与えない
        System.out.println(value); // 値は11
    }
}
