package com.example.learning.paiza.code5;

import java.util.Scanner;

public class ClassA {
  public static void main(String[] args) {
    methodA();
    methodB();
  }

  public static void methodA() {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    String s[] = new String[n.length()];
    for (int i = 0; i < n.length(); i++) {
      s[i] = sc.next();
    }
  }

  public static void methodB() {
    Scanner sc = new Scanner(System.in);
    int m = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < m; i++) {
      String delimiter = " ";
      String sArray[] = sc.nextLine().split(delimiter);

    }
  }
}
