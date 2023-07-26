package com.example.learning.stringdate.regexp;

public class Check {

    public boolean isValidPlayerName(String name) {
        if (name.length() != 8) {
            return false;
        }
        char first = name.charAt(0);
        if (!(first >= 'A' && first <= 'Z')) {
            System.out.println("最初の文字に数字は使えません");
            return false;
        }
        for (int i = 1; i < 8; i++) {
            char c = name.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                System.out.println("正しい文字ではありません");
                return false;
            }
        }
        System.out.println("正しい文字です");
        return true;
    }
}
