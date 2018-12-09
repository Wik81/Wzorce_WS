package pl.sda.creational.builder;

import java.time.LocalDate;

public class BuilderDemo {

    public static void main(String[] args) {

        Customer customer = Customer.create("Wiktor", "S")
                .withName("Wiktor")
                .withLastName("Kowalski")
                .birth(LocalDate.of(1981, 10, 21))
                .withPesel("81102145897")
                .workingAs("galvanizer")
                .livingIn("Szczecin")
                .commingFrom("Poland")
                .build();

        System.out.println(customer);

        Customer emptyCustomer = Customer.createEmpty();
    }
}
