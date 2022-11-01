package main.java.interfaces.property;

import main.java.movement.vector.Vector;

public interface Movable<T> {

    T move(Vector vector);

}
