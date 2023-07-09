package com.example.learning.polymorphism.code2;

public class Main {
    public static void main(String[] args) {
        Character[] cha = { new Hero(150, "ヨシヒコ"), new Hero(5000, "アイアンマン"), new Hero(10000, "ワンパンマン") };
        Monster[] mon = { new Gobelin(10, "ゴブリン"), new Gobelin(50, "ホブゴブリン"), new Gobelin(250, "ジャイアントゴブリン") };

        for (Character c : cha) {
            c.attack(cha);
        }

        for (Monster m : mon) {
            m.attack(mon);
        }

    }
}
