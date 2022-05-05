package hashMapWithCustomKey;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Key, String> map = new HashMap<>();
        Key key1 = new Key(1, new Object());
        Key key2 = new Key(2, new Object());
        map.put(key1, "one");
        map.put(key2, "two");
        map.forEach((key, s) -> System.out.println((key + " " + s)));
    }
}

final class Key {
    private final int id;
    private final Object value;

    @Override
    public String toString() {
        return "Key{" +
                "id=" + id +
                ", value=" + value +
                '}';
    }


    public int getId() {
        return id;
    }


    public Object getValue() {
        return value;
    }


    public Key(int id, Object value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Key key = (Key) o;

        if (id != key.id) return false;
        return value != null ? value.equals(key.value) : key.value == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
