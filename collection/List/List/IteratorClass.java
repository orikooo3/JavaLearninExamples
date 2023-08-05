package com.example.learning.collection.List.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("こてつ");
        names.add("ごんた");
        names.add("たろう");
        names.add("げんた");

        Iterator<String> it = names.iterator();
        // 矢印を次に進められるなら繰り返す
        while (it.hasNext()) {
            // 矢印を次に進め、内容を取り出す
            String e = it.next();
            System.out.println(e);
        }
    }
}
