package app;

/**
 * The Game class demonstrates polymorphism
 * by using different weapon types through
 * the WeaponInterface.
 */
public class Game {

    /**
     * Helper method that activates and fires a weapon.
     *
     * @param weapon the weapon to use
     */
    private static void fireWeapon(WeaponInterface weapon) {
        weapon.activate(true);
        weapon.fireWeapon();
    }

    public static void main(String[] args) {

        WeaponInterface[] weapons = new WeaponInterface[2];

        weapons[0] = new Bomb();
        weapons[1] = new Gun();

        for (WeaponInterface weapon : weapons) {
            fireWeapon(weapon);
            System.out.println();
        }
    }
}