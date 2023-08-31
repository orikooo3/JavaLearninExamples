package com.example.learning.exception.code4;

import java.io.FileWriter;

public class ClassA {
    public static void main(String[] args) {
        // try-with-resources 文
        /*
         * try (closeによる後片付けが必要な変数の宣言) { 本来の処理 }catch (例外クラス 変数名) { 例外が発生した場合の処理 }
         */
        try (FileWriter fw = new FileWriter("data.txt")) {
            fw.write("こんにちわ");
        } catch (Exception e) {
            System.out.println("何らかの例外が発生しました");
        }
    }
}
