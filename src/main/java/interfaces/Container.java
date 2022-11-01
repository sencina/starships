package main.java.interfaces;

import main.java.movement.vector.Vector;

public interface Container<T> {

    Vector position();
    Vector rotation();
}
