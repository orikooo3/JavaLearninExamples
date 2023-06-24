package com.example.learning.chapter1.code3;

public class TypeConversionExample {
    public static void main(String[] args) {
        // 明示的な型変換 (Casting)
        double doubleValue = 3.14;
        int intValue = (int) doubleValue;
        System.out.println("明示的な型変換: " + intValue); // 出力: 3

        // 暗黙的な型変換 (Promotion)
        int x = 5;
        double y = x; // intからdoubleへの暗黙的な型変換
        System.out.println("暗黙的な型変換: " + y); // 出力: 5.0

        // 文字列から数値への変換
        String strNumber = "10";
        int number = Integer.parseInt(strNumber);
        System.out.println("文字列から数値への変換: " + number); // 出力: 10

        // 数値から文字列への変換
        int value = 20;
        String strValue = String.valueOf(value);
        System.out.println("数値から文字列への変換: " + strValue); // 出力: "20"
    }
}
