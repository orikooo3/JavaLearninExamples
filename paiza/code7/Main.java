package com.example.learning.paiza.code7;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] weights = new int[n];
    int maxDiet = 0; // 最大ダイエット日数
    int maxLazy = 0; // 最大怠惰日数
    int currentDiet = 0; // 現在のダイエット日数
    int currentLazy = 0; // 現在の怠惰日数
    for (int i = 0; i < n; i++) {
      weights[i] += sc.nextInt();
    }

    for (int i = 1; i < n; i++) {
      if (weights[i - 1] > weights[i]) {
        currentDiet++;
        currentLazy = 0;
      } else if (weights[i - 1] < weights[i]) {
        currentLazy++;
        currentDiet = 0;
      } else {
        currentDiet = 0;
        currentLazy = 0;
      }
      maxDiet = Math.max(maxDiet, currentDiet);
      maxLazy = Math.max(maxLazy, currentLazy);
    }
    System.out.println(maxDiet + " " + maxLazy);
  }
}
