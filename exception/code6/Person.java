package com.example.learning.exception.code6;

public class Person {

    int age;

    public void setAge(int age) {
        // ここでパラメータをチェック
        if (age < 0) {
            throw new IllegalArgumentException("年齢は0以上の数を指定すべきです。指定地=" + age);
        }
        // 問題なければ、フィールドに値をセット
        this.age = age;
    }
}
