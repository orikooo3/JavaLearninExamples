package com.example.learning.object.code2;

public class Hero {

    String name;
    int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;

    }

    public String toString() {
        return "名前:" + this.name + "/HP" + this.hp;
    }
}
