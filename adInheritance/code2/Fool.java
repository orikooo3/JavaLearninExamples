package com.example.learning.adInheritance.code2;

public class Fool extends Character implements Human {

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃");
    }

    public void talk() {
        System.out.println(this.name + "のお話");
    }

    public void watch() {
        System.out.println(this.name + "はみる");
    }

    public void hear() {
        System.out.println(this.name + "は傾聴する");
    }

    public void run() {
        System.out.println(this.name + "は走る");
    }
}
