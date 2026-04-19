package app;

/**
 * The WeaponInterface defines behaviors for all weapons.
 * Each weapon must be able to activate and fire.
 *
 * @author Deveir Cockett
 */
public interface WeaponInterface {

    /**
     * Fires the weapon with no power specified.
     */
    public void fireWeapon();

    /**
     * Fires the weapon with a specified power level.
     *
     * @param power the power level of the weapon
     */
    public void fireWeapon(int power);

    /**
     * Activates or deactivates the weapon.
     *
     * @param enable true to activate, false to deactivate
     */
    public void activate(boolean enable);
}