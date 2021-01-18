package com.company;

public class Alpenstok extends Creature{
    public Alpenstok(){
        super("альпеншток");
    }
    public void stress(String what, String what2){
        System.out.print(" стальными остриями " + what + "ов в " + what2);
    }
}
