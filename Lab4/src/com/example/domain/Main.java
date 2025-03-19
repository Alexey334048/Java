package com.example.domain;

public class Main {
    public static void main(String[] args) {
        Animal a;

        Spiderman s = new Spiderman("XXX");
        s.eat();
        s.walk();
        Cat c = new Cat("Tom");
        c.eat();
        c.walk();
        c.play();
        a = new Cat("BBB");
        a.eat();
        a.walk();
        Pet p;
        p = new Cat("VVv");
        p.setName("Mr. Whiskers");
        p.play();
        Fish f = new Fish("Dori");
        f.setName("Guppy");
        f.eat();
        f.walk();
        f.play();
        a = new Fish("Dori");
        a.eat();
        a.walk();
        Rat rat = new Rat("Сплинтер");
        rat.play();
        rat.walk();
        rat.eat();
    }
}
