package com.example.learning.stringdate.code5;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append("Hello");
            String s = sb.toString();
            System.out.println(s);
        }
    }
}
