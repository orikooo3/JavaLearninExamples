package com.example.learning.exception.code3;

import java.io.FileWriter;
import java.io.IOException;

public class ClassA {
    public static void main(String[] args) {
        /*
         * 多態性を用いる
         */
        // FileWriter fw = new FileWriter(); 「例外 IOExceptionをキャッチしていない」
        // FileWriter fw; 「初期化されていない変数fwを利用する可能性がある」
        FileWriter fw = null;
        try {
            fw = new FileWriter("data.txt");
            fw.write("hello");
            // 下記のようなコードをtry文に入れると、上記のコードを実行したときに例外的状況になると実行されない
            // fw.close();
        } catch (IOException e) {
            System.out.println("何らかの例外が発生しました");
            // 例外があってもなくても必ず実行する処理
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    ; // 空文
                }
            }
        }
    }
}
