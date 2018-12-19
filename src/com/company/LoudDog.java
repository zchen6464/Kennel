package com.company;

public class LoudDog extends Dog {

    public LoudDog(String name)
    {
        super(name);
    }

    public String Speak() {
        return super.Speak() + " " + super.Speak();
    }
}
