package com.company;

public abstract class Traveller {
   public String name;
   public Traveller(String name){
       this.name = name;
   }
   public String getName(){
       return name;
   }
}
