package com.example.learning.adInheritance.code1;

public class Matango extends Character {

    public Matango(int hp, String name) {
        setHp(hp);
        setName(name);
    }

    public void attack(Matango m) {
        System.out.println(getHp() + "のHP");
        System.out.println(getName() + "の攻撃");
    }
}
