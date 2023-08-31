package com.example.learning.exception.code5;

import java.io.FileWriter;
import java.io.IOException;

public class ClassA {
    public static void main(String[] args) {

    }

    /*
     * スロー宣言 : 発生するチェック例外をキャッチせずに呼び出し元へと伝播させることが許可される
     */
    public static void sub() throws IOException {
        FileWriter fw = new FileWriter("data.txt");
    }
}
