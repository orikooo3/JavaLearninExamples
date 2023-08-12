package com.example.learning.collection.Map.HasMap.code2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassA {
    public static void main(String[] args) {
        /*
         *  Mapを作成して言語ごとの挨拶を管理する
         *  キー : String型の文字列を指定(言語)
         *  値 : List<String>型の文字列を指定(挨拶)
         */
        Map<String, List<String>> langList = new HashMap<>();

        /*
         * ArrayListに日本語の挨拶を格納する HashMapにキーとして「"Japanese"」、値としてArrayListの「Ver」
         */
        List<String> japaneseVer = new ArrayList<>();
        japaneseVer.add("おはよう");
        japaneseVer.add("こんにちわ");
        japaneseVer.add("こんばんは");
        langList.put("Japanese", japaneseVer);

        /*
         * ArrayListに英語の挨拶を格納する HashMapにキーとして「"English"」、値としてArrayListの「englishVer」
         */
        List<String> englishVer = new ArrayList<>();
        englishVer.add("Good Morning");
        englishVer.add("Hello");
        englishVer.add("Good Evening");
        langList.put("English", englishVer);

        /*
         * Map.Entry : キーと値のペア(Entry)を全て取得する
         * getKey() : キーを取得
         * getValue() : 値を取得
         * HasMap : 出力の順番は保証されない LinkedHasMap : 特定の順番を保証したい場合は、要素を格納するときにこれを使う
         */
        for (Map.Entry<String, List<String>> entry : langList.entrySet()) {
            String lang = entry.getKey();
            List<String> greeting = entry.getValue();
            System.out.println("Language: " + lang);
            System.out.println("greeting: " + greeting);
        }
    }
}
