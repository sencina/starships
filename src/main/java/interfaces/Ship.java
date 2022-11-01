package main.java.interfaces;

import main.java.interfaces.property.Clonable;
import main.java.interfaces.property.Damageable;
import main.java.weapoon.components.Bullet;

public interface Ship extends Clonable<Ship>, Damageable<Ship>, Entity {

    Ship fire();
    Ship reload();
    int getHealth();

}
