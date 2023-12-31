package com.example.learning.polymorphism.code2;

public abstract class Character {
    private int hp;
    private String name;

    public Character(int hp, String name) {

    }

    public abstract void attack(Character[] c);

    public abstract void run(Character[] c);

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;
    }

}
