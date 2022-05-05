package polymorphism;

import java.util.*;


import static java.util.List.of;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = of(new Dog(), new Bear());
        animals.forEach(Animal::go);

    }


}

interface Animal {
    void go();
}

class Dog implements Animal {

    @Override
    public void go() {
        System.out.println("dog");
    }
}

class Bear implements Animal {

    @Override
    public void go() {
        System.out.println("bear");
    }
}