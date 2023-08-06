package com.example.learning.free.i18n;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputStr = new Scanner(System.in).nextLine();
        char startChar = inputStr.charAt(0);
        char endChar = inputStr.charAt(inputStr.length() - 1);
        int count = inputStr.length() - 2;
        String outputStr = "";

        if (count >= 2)
            outputStr = String.valueOf(startChar) + count + String.valueOf(endChar);
        if (count == 1)
            outputStr = String.valueOf(startChar) + "1" + String.valueOf(endChar);
        if (count == 0)
            outputStr = String.valueOf(startChar) + "0";
        if (count < 0)
            outputStr = String.valueOf(startChar);

        System.out.println(outputStr);
    }
}
