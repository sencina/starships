package test.java.movement;

import main.java.game.entity.ship.DefaultShip;
import main.java.interfaces.Container;
import main.java.interfaces.Ship;
import main.java.movement.MovementContainer;
import main.java.movement.vector.Vector;
import org.junit.Test;

public class MovementContainerTest {

    private final static MovementContainer<Ship> initialContainer = new MovementContainer<>(new DefaultShip(), new Vector(0,0), new Vector(0,1));

    @Test
    public void moveTest1() {
        Container<Ship> container = initialContainer.move(new Vector(3,0));
        assert container.position().x() == 3;
        assert container.position().y() == 0;
    }

    @Test
    public void moveTest2() {
        Container<Ship> container = initialContainer.move(new Vector(0,3));
        assert container.position().x() == 0;
        assert container.position().y() == 3;
    }

    @Test
    public void moveTest3() {
        Container<Ship> container = initialContainer.move(new Vector(3,3));
        assert container.position().x() == 3;
        assert container.position().y() == 3;
    }

    @Test
    public void rotateTest1() {
        Container<Ship> container = initialContainer.rotate(0);
        assert container.rotation().x() == 1;
        assert container.rotation().y() == 0;
    }



}
