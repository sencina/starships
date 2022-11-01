package main.java.movement;

import main.java.interfaces.Container;
import main.java.interfaces.Entity;
import main.java.interfaces.property.Movable;
import main.java.interfaces.property.Rotatetable;
import main.java.movement.vector.Vector;

public class MovementContainer<T extends Entity> implements Container<T>, Movable<Container>, Rotatetable<Container> {

    private final T entity;
    private final Vector position;
    private final Vector rotation;

    public MovementContainer(T entity, Vector position, Vector rotation) {
        this.entity = entity;
        this.position = position;
        this.rotation = rotation;
    }


    @Override
    public Container<T> move(Vector vector) {
        return new MovementContainer<>(entity,position.add(vector),rotation);
    }

    @Override
    public Container<T> rotate(double angle) {

        return new MovementContainer<>(entity, position, new Vector(angle));

    }

    @Override
    public Vector position() {
        return position;
    }

    @Override
    public Vector rotation() {
        return rotation;
    }
}
