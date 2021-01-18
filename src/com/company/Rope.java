package com.company;

public class Rope extends Creature{
    public Rope(String name){
        super(name);
    }
    public void link(String what){
        System.out.print("ам связаться " + what + "ой, как это делают альпинисты,");
    }
    public void fix(Place Enum, String what){
        System.out.print(". Не успели они прикрепить");
        getPlace(Enum);
        System.out.print(what + "у и двинуться в путь,");
    }
    public void getTime(Time Enum){
        switch(Enum){
            case IMMEDIATELY:
                System.out.print("а тотчас ");
                break;
        }
    }
    public void stretch(String what, Time Enum){
        System.out.print(". " + what);
        getTime(Enum);
        System.out.print("натянулась и потащила");
    }


}
