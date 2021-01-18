package com.company;

public class Klepka extends Creature implements ToFlow{
    public Klepka(String name){
        super(name);
    }
    public void slip(String who, Place Enum){
        System.out.print(" как шедший");
        getPlace(Enum);
        System.out.print(who + " поскользнулся на ");
    }
    @Override
    public void fall(Place Enum, Place Enum2){
        System.out.print("упав на спину, покатился");
        getPlace(Enum);
    }
    public void allow(String what, String who){
        System.out.print(" Подтащив к себе на " + what + "е " + who + ", ");
    }
}
