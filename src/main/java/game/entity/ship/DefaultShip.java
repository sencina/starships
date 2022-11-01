package main.java.game.entity.ship;

import main.java.interfaces.DamageSource;
import main.java.interfaces.Ship;
import main.java.interfaces.Weapon;
import main.java.weapoon.DefaultWeapon;
import main.java.weapoon.components.Bullet;

public class DefaultShip implements Ship {

    private final Weapon weapon;
    private final String name;
    private final int health;

    private final int maxHealth;

    public DefaultShip(String name, int health,int maxHealth, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.weapon = weapon;
    }

    public DefaultShip() {
        this("Default",100,100,new DefaultWeapon(new Bullet(10),10,10));
    }

    @Override
    public Ship fire() {
        return new DefaultShip(name, health, maxHealth, weapon.fire());
    }

    @Override
    public Ship reload() {
        return new DefaultShip(name, health, maxHealth, weapon.reload());
    }

    @Override
    public Ship takeDamage(DamageSource source){
        return new DefaultShip(name, health - source.damage(), maxHealth, weapon);
    }

    @Override
    public int getHealth(){
        return health;
    }

    @Override
    public Ship clone() {
        return new DefaultShip(name, maxHealth, maxHealth, weapon.clone());
    }

}
