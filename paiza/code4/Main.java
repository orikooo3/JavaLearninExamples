package com.example.learning.paiza.code4;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int var = sc.nextInt();
    sc.nextLine(); // 整数の後の改行文字をクリア

    for (int i = 1; i <= var; i++) {
      String a = sc.next();
      String b = sc.next();
      if (a.equals("n") || b.equals("n")) {
        int num = i;
        System.out.println(num);
      }
    }
  }
}