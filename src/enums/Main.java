package enums;

import javax.swing.*;

public class Main {



    public static void main(String[] args) {
        drawGods(Gods.MERCURY_GOD);
    }

    static void drawGods(Gods god) {
        System.out.println("Hi, I am " + god);
    }
}

enum Planets {
    MERCURY("Mercury"), MARS("Mars");

    private final String name;

    Planets(String name) {
        this.name = name;
    }
}

enum Gods {
    MERCURY_GOD, MARS;


}

enum Chocolates {
    MARS("Mars");
    private final String name;

    Chocolates(String name) {
        this.name = name;
    }
}
