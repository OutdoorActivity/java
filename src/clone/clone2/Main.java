package clone.clone2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Bird bird1 = new Bird("Birdy", 100);


        Bird bird1Clone = bird1.clone();
        bird1.setName("newBirdy");
        System.out.println(bird1);
        System.out.println(bird1Clone);
    }
}

class Bird {
    private String name;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }


    public Bird(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    protected Bird clone() throws CloneNotSupportedException {
       /* String name = getName();
        int health = getHealth();*/
        return new Bird(name, health);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
