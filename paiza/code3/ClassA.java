package com.example.learning.paiza.code3;

import java.util.Scanner;

public class ClassA {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String expression = scanner.next();

    int result = total(expression);

    System.out.println(result);
  }

  // パイザ記法の数式を解釈して計算する関数
  public static int total(String expression) {
    int result = 0;
    for (char c : expression.toCharArray()) {
      if (c == '<') {
        result += 10;
      }
      if (c == '/') {
        result += 1;
      }
    }
    return result;
  }
}