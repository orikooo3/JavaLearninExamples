package com.example.learning.scanner.code1;

import java.util.Scanner;

public class ClassA {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str1 = scanner.next();
    String str2 = scanner.nextLine();
    System.out.println(str1);
    System.out.println(str2);
  }
}
