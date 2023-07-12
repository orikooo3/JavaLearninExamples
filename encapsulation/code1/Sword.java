package com.example.learning.encapsulation.code1;

public class Sword {

    private String name;
    private String[] attribute = new String[5]; // 属性

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute(int idx) {
        return attribute[idx];
    }

    public void setAttribute(String attr1, String attr2, String attr3, String attr4, String attr5) {
        attribute[0] = attr1;
        attribute[1] = attr2;
        attribute[2] = attr3;
        attribute[3] = attr4;
        attribute[4] = attr5;
    }
}
