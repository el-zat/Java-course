package ru.stqa.pft.sandbox;

import org.testng.Assert;


import org.testng.annotations.Test;


public class PointTests {

    @Test
    public void testDistance1() {
        Point p1 = new Point(3, 2);
        Point p2 = new Point(10, 6);
        Assert.assertEquals(p1.distance(p2), 8.06225774829855);
    }

    @Test
    public void testDistance2() {
        Point p1 = new Point(4, 28);
        Point p2 = new Point(18, 32);
        Assert.assertEquals(p1.distance(p2), 14.560219778561036);
    }

    @Test
    public void testDistance3() {
        Point p1 = new Point(48, 8);
        Point p2 = new Point(31, 54);
        Assert.assertEquals(p1.distance(p2), 98.561036);
    }
}
