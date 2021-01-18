package com.company;

public class Creature {
    private String name;

    public Creature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getPlace(Place Enum) {
        switch (Enum) {
            case DOWN:
                System.out.print(" вниз");
                break;
            case UNDER:
                System.out.print(" под уклон, ");
                break;
            case BEHIND:
                System.out.print(" позади ");
                break;
            case FURTHER:
                System.out.print(" дальше ");
                break;
            case INFRONT:
                System.out.print(" впереди ");
                break;
            case TO:
                System.out.print(" к себе ");
                break;
            case WAY:
                System.out.print(" в путь ");
                break;
            case BELTS:
                System.out.print(" к поясам ");
                break;
            case NONE:
                System.out.print(" ");
                break;
        }
    }
}
