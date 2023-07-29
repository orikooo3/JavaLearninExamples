package com.example.learning.stringdate.formatformating;

public class ClassA {
    public static void main(String[] args) {
        ClassB b = new ClassB("オカネダイスキマン", "無職", 10000);

        final String FORMAT = "%-9s %-3s 所持金%,6d";
        String s = String.format(FORMAT, b.getName(), b.getJob(), b.getGold());
        System.out.println(s);
    }
}

class ClassB {
    private String name;
    private String job;
    private int gold;

    public ClassB(String name, String job, int gold) {
        this.name = name;
        this.job = job;
        this.gold = gold;
    }

    public String getName() {
        return this.name;
    }

    public String getJob() {
        return this.job;
    }

    public int getGold() {
        return this.gold;
    }
}
