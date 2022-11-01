package main.java.interfaces;

import main.java.interfaces.property.Clonable;

public interface Weapon extends Clonable<Weapon> {
    Weapon fire();
    Weapon reload();

}
