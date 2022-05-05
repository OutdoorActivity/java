package genericarray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] strings = Main.convert(String.class, List.of("str1", "str2", "str3"));
        System.out.println(Arrays.toString(strings));
    }

    protected static <T> T[] convert(Class<T> clazz, List<T> values) {
        T[] array = (T[]) Array.newInstance(clazz, values.size());
        for (int i = 0; i < values.toArray().length; i++) {
            array[i] = values.get(i);
        }
        return array;
    }
}
