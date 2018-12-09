package pl.sda.creational.builder;

import java.time.LocalDate;

public class Customer {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String pesel;
    private String profession;
    private String city;
    private String country;

    private Customer(){

    }

    public static Customer createEmpty(){
        return new Customer();
    }

    public static Customer createDefault(){
        Customer customer = new Customer();
        customer.name = "";
        return customer;
    }

    public static Builder create(String name, String lastName){
        return new Builder(name, lastName);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getPesel() {
        return pesel;
    }

    public String getProfession() {
        return profession;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public static class Builder{
        private Customer customer = new Customer();

        public Builder(String name, String lastName) {

        }


        public Builder withName(String name){
            customer.name = name;
            return this;
        }

        public Builder withLastName(String lastName){
            customer.lastName = lastName;
            return this;
        }

        public Builder birth(LocalDate birthDate){
            customer.birthDate = birthDate;
            return this;
        }

        public Builder withPesel(String pesel){
            customer.pesel = pesel;
            return this;
        }

        public Builder workingAs(String proffesion){
            customer.profession = proffesion;
            return this;
        }

        public Builder livingIn(String city){
            customer.city = city;
            return this;
        }

        public Builder commingFrom(String country){
            customer.country = country;
            return this;
        }

        public Customer build(){
            return customer;
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name = " + name + '\'' +
                ", lastName = " + lastName + '\'' +
                ", birthDate = " + birthDate +
                ", pesel = " + pesel + '\'' +
                ", profession = " + profession + '\'' +
                ", city = " + city + '\'' +
                ", country = " + country + '\'' +
                '}';
    }
}
