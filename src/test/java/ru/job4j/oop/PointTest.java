package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenDistanceX1Y1Y2ZeroX2TwoThenTwo() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistanceX1Y1Y2OneX2TwoThenOne() {
        int expected = 1;
        Point a = new Point(1, 1);
        Point b = new Point(2, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistanceX1Y1Y2TwoX2FourThenTwo() {
        int expected = 2;
        Point a = new Point(2, 2);
        Point b = new Point(4, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance3dX1Y1X2Y2TwoZ1FourZ2EightThenFour() {
        int expected = 4;
        Point a = new Point(2, 2, 4);
        Point b = new Point(2, 2, 8);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}