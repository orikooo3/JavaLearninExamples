package com.example.learning.paiza.code8;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    scanner.close();

    int totalDistance = calculateDialDistance(input);
    System.out.println(totalDistance);
  }

  public static int calculateDialDistance(String phoneNumber) {
    int totalDistance = 0;
    for (char digit : phoneNumber.toCharArray()) {
      if (Character.isDigit(digit)) {
        int numericValue = Character.getNumericValue(digit);
        totalDistance += calculateDistance(numericValue);
      }
    }
    return totalDistance;
  }

  public static int calculateDistance(int digit) {
    int[] distances = { 24, 6, 8, 10, 12, 14, 16, 18, 20, 22 };
    return distances[digit];
  }
}
