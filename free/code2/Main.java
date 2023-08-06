package com.example.learning.free.code2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ary = new ArrayList<String>();
        int num = Integer.parseInt(sc.nextLine()); // Integer.parseIntを使って完全な数値に変換してしまえば、nextLineで読み込める！
        for (int i = 0; i < num; i++) {
            String word = sc.nextLine();
            ary.add(word);
        }
        System.out.println(ary);
    }
}
