package com.interview.algorithms.geometry;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created_By: zouzhile
 * Date: 1/4/15
 * Time: 7:23 PM
 */
public class C18_1_DotToLineDistanceTest {

    @Test
    public void testGetDistance() {

        C18_1_DotToLineDistance test = new C18_1_DotToLineDistance();
        int[] A = {2, 2};
        int[] B = {3, 2};
        int[] C = {-1, 4};
        double distance = test.getDistance(A, B, C);
        Assert.assertEquals(distance, 2.0);
    }
}
