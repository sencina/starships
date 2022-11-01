package main.java.interfaces.property;

import main.java.interfaces.DamageSource;

public interface Damageable<T> {
    T takeDamage(DamageSource damageSource);
    int getHealth();
}
