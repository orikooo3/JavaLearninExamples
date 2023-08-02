package com.example.learning.collection.List.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Listの変換を説明したクラス
 *
 */
public class ClassA {
    public static void main(String[] args) {
        /**
         * ArrayListからLinkedListへ変換
         * 
         * @param add() 要素の追加
         */
        List<String> str = new ArrayList<>();
        str.add("あ");
        str.add("い");
        str.add("う");
        str.add("え");
        LinkedList<String> str2 = new LinkedList<>(str);
        printList(str2);
    }

    /**
     * 中身の取り出し
     * 
     * @param list 型をListにすることでどんなリストも受け取れる
     */
    public static void printList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
