package java16.record;

public  record Car(String name, int number)   {

    public Car {
        if(number < 0) {
            throw new RuntimeException("Отрицательное число");
        }
    }
}
