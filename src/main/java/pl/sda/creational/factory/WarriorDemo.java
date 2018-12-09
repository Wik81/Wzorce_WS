package pl.sda.creational.factory;

public class WarriorDemo {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Wik", 2, Profession.ARCHER);

        warrior.changeProfession(Profession.SWORDSMAN);
    }
}
