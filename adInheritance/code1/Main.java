package com.example.learning.adInheritance.code1;

public class Main {
    public static void main(String[] args) {
        Matango m = new Matango(150, "マタンゴ");
        m.attack(m);
        Dancer d = new Dancer();
        d.attack(m);
    }

}
