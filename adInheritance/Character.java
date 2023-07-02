package com.example.learning.adInheritance.code1;

public abstract class Character {
    private int hp;
    private String name;

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
