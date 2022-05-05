package mapComparator;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.compareUnsigned;
import static java.util.Arrays.sort;

public class MapComparator {
    public static void main(String[] args) {
        Map<String, Integer> nonSortedMap = Map.of(
                "Two", 2,
                "Three", 3,
                "Five", 5,
                "One", 1,
                "Four", 4
        );
        Map<String, Integer> sortedMap = sortByValue(nonSortedMap);
        sortedMap.entrySet().forEach(System.out::println);
     /*nonSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);*/ //with streams
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> nonSortedMap) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(nonSortedMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;


    }
}
