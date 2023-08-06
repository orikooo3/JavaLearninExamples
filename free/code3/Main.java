package com.example.learning.free.code3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String word = getWord();
        String str = String.format("Hello %d!", word);
        System.out.println(str);
    }

    public static String getWord() {
        Scanner sc = new Scanner(System.in);
        String word = String.valueOf(sc.next());
        return word;
    }
}
