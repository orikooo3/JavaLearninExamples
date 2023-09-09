package com.example.learning.paiza.code2;

import java.util.Scanner;

public class ClassA {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt(); // 店舗の数
    int m = scanner.nextInt(); // 営業する月数

    int a = scanner.nextInt(); // 建設費用
    int b = scanner.nextInt(); // 人件費
    int c = scanner.nextInt(); // 利益

    int closedCount = 0; // 閉店する店舗の数

    for (int i = 0; i < n; i++) {
      int r = scanner.nextInt(); // 販売したラーメンの杯数
      int revenue = r * c - (a + b * m); // 収益（売上 - 費用）

      if (revenue < 0) {
        closedCount++;
      }
    }

    System.out.println(closedCount); // 閉店する店舗の数を出力
  }
}
