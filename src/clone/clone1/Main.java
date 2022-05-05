package clone.clone1;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Address street = new Address(1, "Street");
        Customer customer = new Customer(
                "123",
                66,
                street,
                Collections.singletonList(
                        new CellNumber("777-555-666", 3.14D))
        );
        Customer clonedCustomer = customer.clone();
        System.out.println(customer);
        System.out.println(clonedCustomer);
        System.out.println(customer.equals(clonedCustomer));
    }

}

class Customer implements Cloneable {
    private String id;
    private int age;
    private Address address;
    private List<CellNumber> number;

    public Customer(String id, int age, Address address, List<CellNumber> number) {
        this.id = id;
        this.age = age;
        this.address = address;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (age != customer.age) return false;
        if (id != null ? !id.equals(customer.id) : customer.id != null) return false;
        if (address != null ? !address.equals(customer.address) : customer.address != null) return false;
        return number != null ? number.equals(customer.number) : customer.number == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    @Override
    protected Customer clone() throws CloneNotSupportedException {
        int id = this.address.getId();
        String name = this.address.getName();
        Address address1 = new Address(id, name);

        return new Customer(this.id, this.age, address1, number);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", number=" + number +
                '}';
    }
}