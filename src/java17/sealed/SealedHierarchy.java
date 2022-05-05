package java17.sealed;

public class SealedHierarchy {
}

sealed interface Shape permits Triangle, Qube {
    void draw();
}

non-sealed interface Qube extends Shape {

}

interface DoubleQube extends Qube {

}

sealed interface Triangle extends Shape permits DoubleTriangle {

}

final class DoubleTriangle implements Triangle {

    @Override
    public void draw() {

    }
}
