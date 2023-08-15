package com.example.learning.free.codd4;

public class ClassA {
    private String str2 = "6789";

    public static void main(String[] args) {
        ClassA m1 = new ClassA();

        String str = String.valueOf(m1.getValue(100, 100));
        System.out.println(str);

        int num = Integer.parseInt(m1.getComment("12345"));
        System.out.println(num);

        System.out.println(m1.getValue(5, 5));

    }

    public String getComment(String s) {
        return s + str2;
    }

    public int getValue(int num1, int num2) {
        return num1 + num2;
    }
}
