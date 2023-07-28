package com.example.learning.stringdate.regexp2;

public class Main {

    public static void main(String[] args) {
        Main ch = new Main();
        ch.isValidPlayerName("MINATOA");
        ch.wordCheck("Jaaaaaaava");
    }

    public void isValidPlayerName(String name) {
        System.out.println(name.matches("[A-Z]{7}"));
    }

    public void wordCheck(String name) {
        if (name.matches("Java")) {
            System.out.println(true);
        }
        if ((name.matches("JavaJava"))) {
            System.out.println(true);
        }
//        ピリオド:任意の１文字であればよい
        if (name.matches("J.va")) {
            System.out.println(true);
        }
//        アスタリスク:直前の文字の0回以上の繰り返し
        if (name.matches("Ja*va")) {
            System.out.println(name);
        }
        if (name.matches("Ja.*") && name.matches(".*va")) {
            System.out.println(name);
        }
    }

}
