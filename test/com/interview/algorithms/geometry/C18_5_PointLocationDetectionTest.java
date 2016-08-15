package com.interview.algorithms.geometry;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created_By: zouzhile
 * Date: 1/16/15
 * Time: 3:32 PM
 */
public class C18_5_PointLocationDetectionTest {

    private int[] x = {1, 2, 1, 3, 4, 3};
    private int[] y = {1, 2, 4, 5, 3, 0};

    @Test
    public void testInterior() {
        C18_5_PointLocationDetection test = new C18_5_PointLocationDetection();
        String location = test.detect(x, y, 2, 3);
        Assert.assertEquals(location, "interior");
    }

    @Test
    public void testBoundary() {
        C18_5_PointLocationDetection test = new C18_5_PointLocationDetection();
        String location = test.detect(x, y, 4, 3);
        Assert.assertEquals(location, "boundary");
    }

    @Test
    public void testExterior() {
        C18_5_PointLocationDetection test = new C18_5_PointLocationDetection();
        String location = test.detect(x, y, 100, 100);
        Assert.assertEquals(location, "exterior");
    }
}
