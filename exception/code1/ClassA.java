package com.example.learning.exception.code1;

import java.io.FileWriter;
import java.io.IOException;

public class ClassA {
  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("data.txt");
    } catch (IOException e) {
      System.out.println("エラーが発生");
    }
  }
}
