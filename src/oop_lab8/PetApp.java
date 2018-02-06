package oop_lab8;

import oop_lab9.Cow;

public class PetApp {
    public static void main(String[] args) {
        Dog dog = new Dog("jj",2,"Bangkeaw");
        System.out.println(dog.toString());
        dog.makeNoise();
        dog.myPet();

        Cat cat = new Cat("ja",2,"persian");
        System.out.println(cat.toString());
        cat.makeNoise();
        cat.myPet();

        Cow cow = new Cow("jim",5);
        System.out.println(cow.toString());
        cow.makeNoise();
        cow.myPet();

    }//main

}//class


