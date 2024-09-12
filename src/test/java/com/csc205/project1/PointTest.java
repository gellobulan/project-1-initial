package com.csc205.project1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {


    @Test
    void testConstructorAndGetters() {
        Point p = new Point(3.0, 4.0);
        assertEquals(3.0, p.getX());
        assertEquals(4.0, p.getY());
    }

    @Test
    void testSetters() {
        Point p = new Point(0.0, 0.0);
        p.setX(5.0);
        p.setY(6.0);
        assertEquals(5.0, p.getX());
        assertEquals(6.0, p.getY());
    }

    @Test
    void testSetPoint() {
        Point p = new Point(0.0, 0.0);
        p.setPoint(7.0, 8.0);
        assertEquals(7.0, p.getX());
        assertEquals(8.0, p.getY());
    }

    @Test
    void testShiftX() {
        Point p = new Point(1.0, 1.0);
        p.shiftX(2.0);
        assertEquals(3.0, p.getX());
    }

    @Test
    void testShiftY() {
        Point p = new Point(1.0, 1.0);
        p.shiftY(2.0);
        assertEquals(3.0, p.getY());
    }

    @Test
    void testDistance() {
        Point p1 = new Point(0.0, 0.0);
        Point p2 = new Point(3.0, 4.0);
        assertEquals(5.0, p1.distance(p2));
    }

    @Test
    void testRotate() {
        Point p = new Point(1.0, 0.0);
        p.rotate(Math.PI / 2); // 90 degrees
        assertEquals(0.0, p.getX(), 1e-10);
        assertEquals(1.0, p.getY(), 1e-10);
    }

    @Test
    void testToString() {
        Point p = new Point(1.0, 2.0);
        assertEquals("Point(x=1.0, y=2.0)", p.toString());
    }
}




