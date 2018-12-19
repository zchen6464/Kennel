package com.company;

import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList;

    public Kennel(Pet x, Pet y, Pet z)
    {
        petList = new ArrayList();
        petList.add(x);
        petList.add(y);
        petList.add(z);
    }
    public void allSpeak()
    {
        for (Pet p : petList)
        {
            System.out.println(p.getName() + ":" + p.Speak());
        }
    }
}
