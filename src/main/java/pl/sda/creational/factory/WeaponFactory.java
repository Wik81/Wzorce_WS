package pl.sda.creational.factory;

public class WeaponFactory {

    public Weapon makeWeapon (Profession proffesion, int damage) {

        switch(proffesion){
            case ARCHER:
                return new Bow(damage);
            case SWORDSMAN:
                return new Sword(damage);
            case WIZARD:
                return new Wand(damage);
                default:
                    throw new IllegalStateException("There's na such weapon");
        }

    }
}
