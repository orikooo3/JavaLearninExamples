package com.example.learning.polymorphism.code2;

public class Gobelin extends Character {

    public Gobelin(int hp, String name) {
        super(hp, name);

    }

    public void attack() {
        System.out.println(getName() + "のHPは" + getHp());
    }

    public void run() {
        System.out.println();
    }
}
