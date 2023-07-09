package com.example.learning.polymorphism.code2;

public abstract class Monster {

    private int hp;
    private String name;

    public Monster(int hp, String name) {

    }

    public abstract void attack(Monster[] m);

    public abstract void run(Monster[] m);

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}
