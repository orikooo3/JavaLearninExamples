package com.example.learning.encapsulation.code1;

public class Hero {

    private int hp;
    private String name;
    // Swordクラスのオブジェクト変数
    private Sword sword;

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は眠ってしまった！");
    }

    // 引数がMatangoクラスのオブジェクト
    public void attack(Matango m) {
        System.out.println(sword.getAttribute(0) + sword.getName() + "で" + m.getName() + "に攻撃する！");
        int matangohp = m.getHp();
        matangohp -= 10;
        System.out.println(m.getName() + "のHPは" + matangohp + "になった！");
    }

    private void die() {
        System.out.println(this.name + "は死んでしまった！");
        System.out.println("GAME OVER");
    }

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

    public Sword getSword() {
        return sword;
    }

    // Swordオブジェクトをセットする
    public void setSword(Sword sword) {
        this.sword = sword;
    }

}
