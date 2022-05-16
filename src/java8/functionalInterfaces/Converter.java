package java8.functionalInterfaces;

@FunctionalInterface
public interface Converter<A, B> {
    B convert(A a);
}
