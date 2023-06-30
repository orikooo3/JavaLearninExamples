package com.example.learning.chapter9;

public class MemoryExample {
    public static void main(String[] args) {
        // スタック領域に変数を宣言
        int x = 10;
        int y = 20;

        // ヒープ領域にオブジェクトを作成
        MyClass myObject = new MyClass();

        // スタック領域の変数に値を代入
        int sum = addNumbers(x, y);

        // ヒープ領域のオブジェクトのメソッドを呼び出し
        myObject.printMessage("Hello, World!");

        // 結果を出力
        System.out.println("Sum: " + sum);
    }

    public static int addNumbers(int a, int b) {
        // スタック領域に引数として受け取った値を使用して計算
        return a + b;
    }
}

class MyClass {
    public void printMessage(String message) {
        // ヒープ領域のオブジェクトのメソッドで引数の値を使用
        System.out.println("Message: " + message);
    }
}
