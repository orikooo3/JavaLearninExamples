package com.example.learning.paiza.code1;

import java.util.Scanner;

public class ClassA {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    String[] words = new String[n];

    // 単語の入力を受け取る
    for (int i = 0; i < n; i++) {
      words[i] = scanner.next();
    }

    for (int i = 1; i < n; i++) {
      char lastChar = words[i - 1].charAt(words[i - 1].length() - 1); // 前の単語の末尾の文字
      char firstChar = words[i].charAt(0); // 現在の単語の先頭の文字

      if (lastChar != firstChar) {
        System.out.println(lastChar + " " + firstChar);
        return; // 一度でもしりとりが成立しない場合、その位置で終了
      }
    }

    System.out.println("Yes"); // すべての単語でしりとりが成立する場合
  }
}
