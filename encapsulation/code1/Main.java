package com.example.learning.encapsulation.code1;

public class Main {

    public static void main(String[] args) {
        Hero h = new Hero();
        Matango m = new Matango();
        Sword s = new Sword();

        h.setHp(100);
        h.setName("勇者ヨシヒコ");
        h.setSword(s);

        m.setHp(50);
        m.setName("毒キノコ");

        s.setName("勇者の剣");
        s.setAttribute("炎", "水", "草", "土", "風");

        h.attack(m);
    }
}