package com.example.learning.chapter9.code1;

public class Main {
  public static void main(String[] args) {
    Person person = createPerson();
    System.out.println("名前: " + person.getName());
    System.out.println("年齢: " + person.getAge());
  }

  public static Person createPerson() {
    return new Person("こてつ", 10);
  }
}