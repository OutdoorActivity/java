package exceptionsWithFunctionalInterfaces;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        SquareGeometryLibrary geometryLibrary = new SquareGeometryLibrary(-1.3, -2.1, -3.1, -4.5);
        Supplier<Double> supplier = () -> geometryLibrary.getA() + geometryLibrary.getB() + geometryLibrary.getC() + geometryLibrary.getD();

        try {
            System.out.println(geometryLibrary.perimeter(supplier));
        } catch (GeometryException e) {
            throw new RuntimeException(e.getMessage());
        }


    }
}

interface GeometryLibrary {
    double perimeter(Supplier<Double> geometryLibrarySupplier) throws Exception;
}

class SquareGeometryLibrary implements GeometryLibrary {
    private final double a;
    private final double b;
    private final double c;
    private final double d;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public SquareGeometryLibrary(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }


    @Override
    public double perimeter(Supplier<Double> geometryLibrarySupplier) throws GeometryException {

        if (geometryLibrarySupplier.get() < 0) {
            throw new GeometryException();
        }
        else return (geometryLibrarySupplier.get());


    }
}

class GeometryException extends RuntimeException {
    public GeometryException() {
        super("geometry exception");
    }
}
