package com.example.learning.stringdate.code2;

public class Main {
    public static void main(String[] args) {
        String s1 = "メロン and メロンパン";
        if (s1.contains("メロン")) {
            System.out.println("文字列s1は、メロンを含んでいる");
        }

        if (s1.startsWith("メロン")) {
            System.out.println("文字列s1は、メロンが冒頭にある");
        }

        if (s1.endsWith("メロン")) {
            System.out.println("文字列s1は、メロンが末尾にある");
        }
        System.out.println("文字列s1で最初にメロンが登場する位置は" + s1.indexOf("メロン"));

        System.out.println("文字列s1で最後にメロンが登場する位置は" + s1.lastIndexOf("メロン"));
    }
}
