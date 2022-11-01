package test.java.movement.vector;

import main.java.movement.vector.Vector;
import org.junit.Assert;
import org.junit.Test;

public class VectorTest {

    @Test
    public void angleCreationTest1() {

        Vector vector = new Vector(0);
        assert vector.x() == 1d;
        assert vector.y() == 0d;
    }

    @Test
    public void angleCreationTest2() {

        Vector vector = new Vector(90);
        Assert.assertEquals(0d, vector.x(), 0.0001);
        Assert.assertEquals(1d, vector.y(), 0.0001);
    }

    @Test
    public void angleCreationTest3() {

        Vector vector = new Vector(180);
        Assert.assertEquals(-1d, vector.x(), 0.0001);
        Assert.assertEquals(0d, vector.y(), 0.0001);
    }

    @Test
    public void angleCreationTest4() {

        Vector vector = new Vector(270);
        Assert.assertEquals(0d, vector.x(), 0.0001);
        Assert.assertEquals(-1d, vector.y(), 0.0001);

    }

    @Test
    public void angleCreationTest5() {

        Vector vector = new Vector(360);
        Assert.assertEquals(1d, vector.x(), 0.0001);
        Assert.assertEquals(0d, vector.y(), 0.0001);

    }

    @Test
    public void addTest1() {

        Vector vector = new Vector(180); // -1,0
        Vector vector2 = new Vector(90); // 0,1
        Vector vector3 = vector.add(vector2); // -1,1
        Assert.assertEquals(-1d, vector3.x(), 0.0001);
        Assert.assertEquals(1d, vector3.y(), 0.0001);

    }

    @Test
    public void angleTest1() {

        Vector vector = new Vector(180); // -1,0
        Assert.assertEquals(180d, vector.angle(), 0.0001);

    }


}
