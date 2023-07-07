package com.example.learning.polymorphism.code2;

public class Main {
    public static void main(String[] args) {
        Character[] c1 = { new Hero(), new Gobelin() };

        for (Character c : c1) {
            c.attack();
        }
    }
}
