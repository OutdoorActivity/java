package java8.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Valera", 54);
        Converter<Dog, Racoon> converter = x -> new Racoon(x.name, x.age);
        Racoon racoon = converter.convert(dog);
        System.out.println(racoon);

        Predicate<Integer> isEvenNumber = x -> x % 2 == 0;
        System.out.println(isEvenNumber.test(2));
        System.out.println(isEvenNumber.test(3));

        Consumer<String> greet = x -> System.out.println("Hello, " + x + " !");
        greet.accept("Жмышенко Валерий Альбертович");

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Elena");
        names.add("Den");
        names.add("Klava");
        Supplier<String> randomName = () -> {
            int value = ThreadLocalRandom.current().nextInt(names.size());
            return names.get(value);

        };
        System.out.println(randomName.get());

        Function<String, Integer> valueConverter = Integer::valueOf;
        int a = valueConverter.apply("777");
        System.out.println(a);

        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(6));


    }

}

