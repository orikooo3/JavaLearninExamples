package com.example.learning.adInheritance.code2;

public abstract class Character {

    int hp;
    String name;

    public abstract void attack(Matango m);

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
