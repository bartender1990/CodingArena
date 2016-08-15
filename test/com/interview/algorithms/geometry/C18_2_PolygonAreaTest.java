package com.interview.algorithms.geometry;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created_By: zouzhile
 * Date: 1/4/15
 * Time: 7:32 PM
 */
public class C18_2_PolygonAreaTest {

    @Test
    public void testGetPolygonArea() {
        C18_2_PolygonArea test = new C18_2_PolygonArea();
        int[][] points = new int[][] {{-2, 0}, {-2, 3}, {-1, 2}, {1, 2},{2,3}, {2, 0}, {0, -2}};
        double area = test.getArea(points);
        Assert.assertEquals(area, 13.0);
    }
}
