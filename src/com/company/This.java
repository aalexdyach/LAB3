package com.company;

public class This extends Creature implements Stop{
    public This(String name){
        super(name);
    }
    @Override
    public void was(String what, Time Enum){
        System.out.print(what + " было сделано");
        getTime(Enum);
    }
    @Override
    public void stop(String what){
        System.out.print("." + what + " задержало падение.");
    }
}
