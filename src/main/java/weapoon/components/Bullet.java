package main.java.weapoon.components;

import main.java.interfaces.DamageSource;

public record Bullet(int damage) implements DamageSource {

    @Override
    public int damage() {
        return damage;
    }

}
