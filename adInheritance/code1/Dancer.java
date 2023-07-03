package com.example.learning.adInheritance.code1;

//1.オーバーライド
//2.Dancerクラスにabstract付ける
public class Dancer extends Character {
    public Dancer() {

    }

    public void attack(Matango m) {
        setHp(100);
        setName("ダンサー");
        System.out.println(getHp() + "のHP");
        System.out.println(getName() + "の攻撃");

    }
}
