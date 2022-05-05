package factorypattern;


import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class ShapeFactory<T> {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException {
        Triangle triangle =  getInstance(Triangle.class);
        Cube cube = getInstance(Cube.class);
        System.out.println(triangle.getClass().getName() + "\n" + cube.getClass().getName());
    }

    public static <T extends Shape> T getInstance(Class<T> type) throws NoSuchMethodException, InvocationTargetException {
        Shape instance = null;
        try {
            instance = type.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return (T) instance;
    }
}

