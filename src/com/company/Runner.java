package com.company;

public class Runner {

    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        Dog dog = new Dog("Dog");
        LoudDog loudDog = new LoudDog("Loud Dog");

        System.out.println(cat.Speak());
        System.out.println(dog.Speak());
        System.out.println(loudDog.Speak());
        new Kennel(cat,dog,loudDog).allSpeak();
    }
}
