package com.example.learning.polymorphism.code2;

public class Hero extends Character {

    public Hero(int hp, String name) {
        super(hp, name);
        setHp(hp);
        setName(name);
    }

    public void attack(Character[] c) {
        System.out.println(getName() + "のHPは" + getHp());
    }

    public void run(Character[] c) {
        System.out.println();
    }
}
