package com.example.learning.paiza.code9;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] human = new int[n];
    int[] beans = new int[n];
    for (int i = 0; i < n; i++) {
      beans[i] = sc.nextInt();
    }
    int m = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      for (int j = a - 1; j <= b - 1; j++) {
        if (human[j] <= beans[j]) {
          human[j] += c;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      if (human[i] > beans[i]) {
        human[i] = beans[i];
      }
      System.out.println(human[i]);
    }
  }
}
