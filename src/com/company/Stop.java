package com.company;

public interface Stop {
    default void stop(String what) {
    }
    default void was(String what, Time Enum) {
    }

    public default void getTime(Time Enum) {
        switch (Enum) {
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
}
