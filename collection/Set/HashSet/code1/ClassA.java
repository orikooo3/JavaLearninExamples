package com.example.learning.collection.Set.HashSet.code1;

import java.util.HashSet;
import java.util.Set;

public class ClassA {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<String>();
        colors.add("赤");
        colors.add("黄");
        colors.add("青");
        // 重複して「赤」を格納しようとしても無視される
        colors.add("赤");
        System.out.println("色は" + colors.size() + "種類");
    }
}