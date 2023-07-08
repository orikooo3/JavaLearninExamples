package com.example.learning.polymorphism.code2;

public class Main {
    public static void main(String[] args) {
        Character[] c1 = { new Hero(500, "ヒーロー"), new Gobelin(250, "ゴブリン") };

        for (Character c : c1) {
            c.attack();
        }
    }
}
