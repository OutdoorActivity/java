package java8.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> evenNumbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .filter(x -> x % 2 == 0) //predicate
                .toList();
        System.out.println(evenNumbers);

        List<String> peopleGreetings = Stream.of("Tom", "Jack", "Артём", "Борис")
                .peek(x -> System.out.println("Hello, " + x + " !")) //consumer
                .toList();

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Elena");
        names.add("Den");
        names.add("Klava");
        Stream.generate(() -> {  //supplier
            int value = ThreadLocalRandom.current().nextInt(names.size());
            return names.get(value);
        }).limit(5).forEach(System.out::println);

        List<Integer> values = Stream.of("32", "43", "74", "54", "3")
                .map(x -> Integer.valueOf(x))  //function
                .collect(Collectors.toList());
        System.out.println(values);

        Stream.iterate(9, x -> x * x) //unary operator
                .limit(4)
                .forEach(System.out::println);

    }
}
