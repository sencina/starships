package main.java.weapoon;

import main.java.interfaces.Weapon;
import main.java.weapoon.components.Bullet;

public class DefaultWeapon implements Weapon {

    private final Bullet bullet;
    private final int ammo;
    private final int maxAmmo;

    public DefaultWeapon( Bullet bullet, int ammo, int maxAmmo) {
        this.bullet = bullet;
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
    }

    @Override
    public Weapon fire() throws IllegalStateException{
        if (ammo > 0) {
            return new DefaultWeapon(bullet, ammo - 1, maxAmmo);
        }
        throw new IllegalStateException("No ammo");
    }

    @Override
    public Weapon reload() throws IllegalStateException{
        if (ammo < maxAmmo) {
            return new DefaultWeapon(bullet, maxAmmo, maxAmmo);
        }
        throw new IllegalStateException("Full ammo");
    }

    @Override
    public Weapon clone() {
        return new DefaultWeapon(bullet,ammo, maxAmmo);
    }

}
