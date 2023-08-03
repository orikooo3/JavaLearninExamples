package com.example.learning.collection.Map.HasMap.code1;

import java.util.HashMap;
import java.util.Map;

public class ClassA {
    public static void main(String[] args) {
        // ペアで値を格納
        Map<String, Integer> prefs = new HashMap<>();
        prefs.put("北海道", 1000);
        prefs.put("東京都", 2000);
        prefs.put("大阪府", 3000);
        prefs.put("沖縄県", 4000);

        // キーを指定し値を取得
        int oosaka = prefs.get("大阪府");
        System.out.println("大阪府の人口は" + oosaka);
        // 指定した内容の要素を削除
        prefs.remove("大阪府");
        // 値の上書き
        prefs.put("北海道", 1234);
        for (String key : prefs.keySet()) {
            int value = prefs.get(key);
            System.out.println(key + "の人口は" + value);
        }
    }
}
