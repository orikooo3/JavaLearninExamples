package com.example.learning.free.code1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "123 test\n";
        Scanner sc = new Scanner(str);
        int num = sc.nextInt();
        String word = sc.next();
        String line = sc.nextLine();

        System.out.println(str);
        System.out.println(num);
        System.out.println(word);
        System.out.println(line);
    }
}
