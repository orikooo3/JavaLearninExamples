package com.example.learning.chapter5.code2;

public class CallByReference {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        intArray(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    // 結果をreturnで返してない
    public static void intArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }
}
