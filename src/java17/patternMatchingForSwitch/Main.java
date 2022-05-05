package java17.patternMatchingForSwitch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PatternMatchingForSwitch.doDemoTwo(1L);
        PatternMatchingForSwitch.doDemoOne("Hello, world!");
        PatternMatchingForSwitch.doDemoTwo(new Object());
        PatternMatchingForSwitch.doDemoTwo(new Scanner(System.in).nextLine());
        PatternMatchingForSwitch.doDemoThree();
        PatternMatchingForSwitch.doDemoFour();
    }
}

class PatternMatchingForSwitch {
    static void doDemoOne(Object o) {
        switch (o) {
            case String s -> System.out.println("String: " + s);
            case Integer i -> System.out.println("Integer: " + i);
            case Long l -> System.out.println("Long: " + l);


            default -> throw new IllegalStateException("Unexpected value: " + o);
        }
    }

    static void doDemoTwo(Object o) {
        switch (o) {
            case String s -> System.out.println("String: " + s);
            case Integer i -> System.out.println("Integer: " + i);
            case Long l -> System.out.println("Long: " + l);
            case Scanner scanner -> System.out.println("Scanner: " + scanner);

            default -> System.out.println(o);
        }
    }

    static void doDemoThree() {
        Object o = null;
        switch (o) {

            case null -> System.out.println("Maybe NullPointerException");
            default -> System.out.println(o);
        }
    }

    static void doDemoFour() {
        Object o = "Str";
        switch (o) {
            case String s -> System.out.println("String: " + s);
            case CharSequence cs -> System.out.println(cs.toString());
            default -> System.out.println(o);
        }

    }
}
