package app;

/**
 * The Bomb class represents a bomb weapon.
 * It implements the WeaponInterface.
 */
public class Bomb implements WeaponInterface {

    @Override
    public void fireWeapon(int power) {
        System.out.println("Bomb fireWeapon(int) called with power = " + power);
    }

    @Override
    public void fireWeapon() {
        System.out.println("Bomb fireWeapon() called");
        fireWeapon(50);
    }

    @Override
    public void activate(boolean enable) {
        System.out.println("Bomb activate(boolean) called with enable = " + enable);
    }
}