package com.example.learning.free.fibonacci;

import java.util.Arrays;

public class FibonacciSequence {

    /** フィボナッチ数列を格納する配列 */
    private long[] array;

    /** 黄金比 */
    private static final double gold = (1 + Math.sqrt(5)) / 2;

    /** フィボナッチ数列の比と黄金比との差 */
    private double difference;

    /** 実行用mainメソッド */
    public static void main(String[] args) {
        FibonacciSequence fSequence = new FibonacciSequence();
        fSequence.getFibonacciSequence(5);
        System.out.println(Arrays.toString(fSequence.array));
        System.out.println("黄金比との差:" + fSequence.difference);
        fSequence.getFibonacciSequence(10);
        System.out.println(Arrays.toString(fSequence.array));
        System.out.println("黄金比との差:" + fSequence.difference);
    }

    /**
     * フィボナッチ数列と黄金比との差を取得
     * 
     * @param num 出力する数列の長さ
     */
    private void getFibonacciSequence(int num) {
        if (num < 3) {
            num = 2;
        }
        array = new long[num];
        // 配列の1番目と2番目に0と1を格納する
        array[0] = 0;
        array[1] = 1;
        // 3番目以降に1つ前と2つ前の数字を足した数字を入れる
        for (int i = 2; i < num; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        difference = gold - ((double) array[num - 1] / (double) array[num - 2]);
    }
}
