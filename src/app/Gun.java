package app;

/**
 * The Gun class represents a gun weapon.
 * It implements the WeaponInterface.
 */
public class Gun implements WeaponInterface {

    @Override
    public void fireWeapon(int power) {
        System.out.println("Gun fireWeapon(int) called with power = " + power);
    }

    @Override
    public void fireWeapon() {
        System.out.println("Gun fireWeapon() called");
        fireWeapon(25);
    }

    @Override
    public void activate(boolean enable) {
        System.out.println("Gun activate(boolean) called with enable = " + enable);
    }
}