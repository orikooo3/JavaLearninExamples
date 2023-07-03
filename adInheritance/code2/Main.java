package com.example.learning.adInheritance.code2;

public class Main {
    public static void main(String[] args) {
        Fool f = new Fool();
        f.setHp(100);
        f.setName("お調子者");

        Matango m = new Matango();
        m.setHp(150);
        m.setName("マタンゴ");

        f.attack(m);
        f.talk();
        m.attack(m);
    }

}
