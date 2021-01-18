package com.company;

public class Everyone extends Creature{
    public Everyone(String name){
        super(name);
    }
    public void move(String who, Place Enum){
        System.out.print(who + " двинулись");
        getPlace(Enum);
    }
    public void stress(String who){
        System.out.print(who + " принялись упираться");
    }

}
