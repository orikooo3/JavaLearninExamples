package com.example.learning.stringdate.code3;

public class Main {
    public static void main(String[] args) {
        String s1 = "0123456789";
        System.out.println(s1.charAt(1) + "文字目は" + s1.charAt(1));
        System.out.println("文字列s1の" + s1.substring(4, 5) + "文字以降は" + s1.substring(3));
        System.out.println("文字列s1の" + s1.substring(5, 6) + "～10文字目は" + s1.substring(3, 8));
    }
}
