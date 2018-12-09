package pl.sda.Struktural.proxy.adapter;

public class Duck implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Quack");
    }
}
