package com.example.learning.paiza.code6;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 人数Nを取得
    int N = sc.nextInt();

    // 各人の初期ボールの個数を取得
    int[] ballCounts = new int[N];
    for (int i = 0; i < N; i++) {
      ballCounts[i] = sc.nextInt();
    }

    // パス回数Mを取得
    int M = sc.nextInt();

    // パス回しの情報を処理
    for (int i = 0; i < M; i++) {
      int a = sc.nextInt(); // パスをする人
      int b = sc.nextInt(); // パスを受ける相手
      int x = sc.nextInt(); // 宣言されたボールの個数

      // aからbへボールをパスする
      if (ballCounts[a - 1] >= x) {
        ballCounts[a - 1] -= x;
        ballCounts[b - 1] += x;
      } else {
        ballCounts[b - 1] += ballCounts[a - 1];
        ballCounts[a - 1] = 0;
      }
    }

    // 各人の最終的なボールの個数を出力
    for (int count : ballCounts) {
      System.out.println(count);
    }
  }
}
