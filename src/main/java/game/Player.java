package main.java.game;

import main.java.game.entity.ship.DefaultShip;
import main.java.interfaces.Ship;
import main.java.weapoon.DefaultWeapon;
import main.java.weapoon.components.Bullet;

public class Player {

    private final String name;
    private final Ship ship;
    private final int lives;
    private final int score;

    public Player(String name, Ship ship, int lives, int score) {
        this.name = name;
        this.ship = ship;
        this.lives = lives;
        this.score = score;
    }

    public Player(String name, Ship ship, int lives) {
        this(name, ship, lives, 0);
    }

    public Player(String name, Ship ship) {
        this(name, ship, 3);
    }

    public Player(String name) {
        this(name, new DefaultShip("Default", 100,100, new DefaultWeapon(new Bullet(10), 10, 10)));
    }

    public Player takeDamage(Bullet bullet) throws IllegalStateException {

        final Ship newShip = ship.takeDamage(bullet);
        final boolean isDead = newShip.getHealth() <= 0;
        if (isDead) {
            if (lives > 0)return new Player(name, newShip.clone(), lives - 1, score);
            else throw new IllegalStateException("No lives left");
        }
        return new Player(name, newShip, lives, score);
    }
}
