package ru.unn.agile.polygon.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PolygonTest {

    private final double delta = 0.001;

    private final Point pointA = new Point();
    private final Point pointB = new Point(6, 0);
    private final Point pointC = new Point(4, 2);
    private final Point pointD = new Point(6, 4);
    private final Point pointE = new Point(0, 4);
    private final Point pointF = new Point(2, 2);

    @Test
    public void canCreateTriangle() {
        try {
            Polygon triangle = new Polygon(pointA, pointB, pointC);
        } catch (Exception e) {
            fail("Should not have thrown any exception");
        }
    }

    @Test
    public void canCreateSquare() {
        try {
            Polygon square = new Polygon(pointA, pointB, pointC, pointD);
        } catch (Exception e) {
            fail("Should not have thrown any exception");
        }
    }

    @Test
    public void canCreatePolygon() {
        try {
            Polygon polygon = new Polygon(pointA, pointB, pointC, pointD, pointE);
        } catch (Exception e) {
            fail("Should not have thrown any exception");
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void cantCreatePolygonWithLessThanThreePoints() {
        Polygon pol1 = new Polygon();
        Polygon pol2 = new Polygon(pointA);
        Polygon pol3 = new Polygon(pointA, pointB);
    }

    @Test(expected = IllegalArgumentException.class)
    public void cantCreatePolygonWithIntersectingSides() {
        Polygon pol1 = new Polygon(pointA, pointD, pointB, pointE);
    }

    @Test
    public void canGetNumbersOfPolygonVertices() {
        Polygon polygon = new Polygon(pointA, pointB, pointC, pointD);

        assertEquals(4, polygon.getSize());
    }

    @Test
    public void canGetAreaOfRegularPolygon() {
        Polygon polygon = new Polygon(pointA, pointB, pointD, pointE);

        assertEquals(24, polygon.getArea(), delta);
    }

    @Test
    public void canGetAreaOfIrregularPolygon() {
        Polygon pol6 = new Polygon(pointA, pointB, pointC, pointD, pointE, pointF);

        assertEquals(16, pol6.getArea(), delta);
    }

    @Test
    public void canRunCreateSidesMethod() {
        try {
            Polygon polygon = new Polygon(pointA, pointB, pointC, pointD, pointE, pointF);
        } catch (Exception e) {
            fail("Should not have thrown any exception");
        }
    }
}