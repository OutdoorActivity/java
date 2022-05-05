package collectionWithComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> elems = List.of(1, 5, -3, 0);

        Collection<Integer> sortedDigits = elems.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }).toList();
        sortedDigits.forEach(System.out::print);


    }
}



