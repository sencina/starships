package main.java.movement.vector;

public class Vector {

    private final double x;
    private final double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector(double angle){
        this(Math.cos(Math.toRadians(angle)), Math.sin(Math.toRadians(angle)));
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public double angle(){
        return Math.toDegrees(Math.atan2(y,x));
    }

    public Vector add(Vector vector) {
        return new Vector(x + vector.x(), y + vector.y());
    }

    public Vector subtract(Vector vector) {
        return new Vector(x - vector.x(), y - vector.y());
    }
}
