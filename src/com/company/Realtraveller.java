package com.company;

public class Realtraveller extends Traveller{
    public Realtraveller(String name){
        super(name);
    }
   public void pull(String what){
        System.out.print(" за собой остальных " + what + "ов. ");
   }
}
