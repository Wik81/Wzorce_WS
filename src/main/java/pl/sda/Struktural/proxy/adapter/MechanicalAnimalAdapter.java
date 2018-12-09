package pl.sda.Struktural.proxy.adapter;

public class MechanicalAnimalAdapter implements Animal {

    private final IMechanicalAnimal adapterMechanicalAnimal;

    public MechanicalAnimalAdapter(IMechanicalAnimal adapterMechanicalAnimal){
        this.adapterMechanicalAnimal = adapterMechanicalAnimal;
    }

    @Override
    public void makeSound() {
        adapterMechanicalAnimal.doMechanicalSound();
    }
}
