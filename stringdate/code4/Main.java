package com.example.learning.stringdate.code4;

public class Main {
    public static void main(String[] args) {

        String up = "UPPERCASE";
        String low = "lowercase";
        String space = "    空 白 が あ る よ     ";
        String subtion1 = "タスクラスク";
        String subtion2 = "マダガスカル";

        System.out.println(up.toLowerCase());
        System.out.println(low.toUpperCase());
        System.out.println(space.trim());
        System.out.println(subtion1.replace("ク", "カル"));
        System.out.println(subtion1.replace(subtion1, subtion2));
    }
}
