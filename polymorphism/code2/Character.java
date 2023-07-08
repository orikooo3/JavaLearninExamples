package com.example.learning.polymorphism.code2;

public abstract class Character {
    private int hp;
    private String name;

    public Character(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public abstract void attack();

    public abstract void run();

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

}
