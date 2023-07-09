package com.example.learning.polymorphism.code2;

public class Gobelin extends Monster {

    public Gobelin(int hp, String name) {
        super(hp, name);
        setHp(hp);
        setName(name);
    }

    public void attack(Monster[] m) {
        System.out.println(getName() + "のHPは" + getHp());
    }

    public void run(Monster[] m) {
        System.out.println();
    }
}
