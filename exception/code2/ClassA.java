package com.example.learning.exception.code2;

import java.io.FileWriter;
import java.io.IOException;

public class ClassA {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("hello");
            fw.close();
            /*
             * 例外インスタンスを受け取るための変数名は慣習として「e」か「ex」 どちらも同じ処理をする場合、catch (NullPointerException |
             * IOException e) {}みたいな感じで1つにまとめられる
             */
        } catch (NullPointerException | IOException e) {
            System.out.println("何らかの例外は発生しました");
        }
    }
}
