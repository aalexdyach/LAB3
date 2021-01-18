package com.company;

public class Tunnel extends Creature{
    public Tunnel(String name){
        super(name);
    }
    public void getTime(Time Enum){
        switch(Enum){
            case SOON:
                System.out.print("скоро ");
                break;
            case IMMEDIATELY:
                System.out.print(" тотчас ");
                break;
            case INTIME:
                System.out.print(" вовремя");
                break;
        }
    }
    public void come(Time Enum, String where){
        System.out.print("и ");
        getTime(Enum);
        System.out.print("очутились в " + where + "е с ледяным дном. ");
    }
    public void notice(String what, Place Enum){
        System.out.print("Заметив, что ледяное дно " + what + "я шло");
        getPlace(Enum);
    }
}
