package com.example.domain;

public class Rat extends Animal implements Pet {
    String name;
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println(name + " любит общатся с черепашками");
    }
    public Rat(String name)
    {
        this.name=name;
    }
}
