package swapIntegers;

public class Main {
    public static void main(String[] args) {

        swapIntegers(20, 10);

    }

    static void swapIntegers(int a, int b) {
        a = a + b; //20+10=30
        b = a - b; //30-10=20
        a = a - b; //30-20=10
        System.out.println(a + " " + b);
    }
}
