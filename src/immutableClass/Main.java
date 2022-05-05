package immutableClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    ImmutableClass immutableClass = new ImmutableClass(1, new ArrayList<>(Arrays.asList("123", "213")));
    }

}

final class ImmutableClass {

    private final int a;
    private final List<String> strings;

    public ImmutableClass(int a, List<String> strings) {
        this.a = a;
        this.strings = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImmutableClass that = (ImmutableClass) o;

        if (a != that.a) return false;
        return strings != null ? strings.equals(that.strings) : that.strings == null;
    }

    public int getA() {
        return a;
    }

    private List<String> getStrings() {
        final List<String> list = new ArrayList<>(strings);
        return list;
    }


    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + (strings != null ? strings.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "a=" + a +
                ", strings=" + strings +
                '}';
    }
}