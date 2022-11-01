package main.java.game.entity.asteroid;

import main.java.interfaces.DamageSource;
import main.java.interfaces.property.Damageable;

public class Asteroid implements Damageable<Asteroid>, DamageSource{

    private final int size;
    private final int health;
    private final int maxHealth;
    private final int damage;
    private final int points;


    public Asteroid(int size, int health, int maxHealth, int points, int damage) {
        this.size = size;
        this.health = health;
        this.maxHealth = maxHealth;
        this.points = points;
        this.damage = damage;
    }


    @Override
    public Asteroid takeDamage(DamageSource damageSource) {
        return health - damageSource.damage() <= 0 ? new Asteroid(size, 0, maxHealth,points,damage) : new Asteroid(size, health - damageSource.damage(), maxHealth,points,damage);
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int damage() {
        return damage;
    }
}
