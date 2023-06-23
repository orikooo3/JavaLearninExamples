package com.example.learning.chapter1.code2;

public class VariousVariable {

    // クラス変数
    static int classVariable;

    // フィールド変数（メンバ変数）
    String instanceVariable;

    public void method() {
        // ローカル変数
        int localVariable = 10;

        System.out.println(classVariable); // クラス変数の使用
        System.out.println(instanceVariable); // フィールド変数の使用
        System.out.println(localVariable); // ローカル変数の使用
    }

    public static void main(String[] args) {
        VariousVariable vable = new VariousVariable();
        vable.instanceVariable = "Hello, World!";
        vable.method();
    }
}
