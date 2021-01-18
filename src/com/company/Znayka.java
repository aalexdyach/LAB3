package com.company;

public class Znayka extends Creature {
    public Znayka(){
        super("Знайка");
    }
    public void order(String who, String who2, String Case, Place Enum){
        if(Case == "велел")
            System.out.print(who + " велел " + who2);
        else if(Case == " распорядился"){
            System.out.print(who + Case + ", чтоб его привязали");
            getPlace(Enum);
        }
    }
    public void climb(String who, Place Enum2){
        System.out.print(who + "х и не разрешали вылезать");
        getPlace(Enum2);
    }
}
