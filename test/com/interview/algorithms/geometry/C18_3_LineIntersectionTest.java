package com.interview.algorithms.geometry;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created_By: zouzhile
 * Date: 1/4/15
 * Time: 9:38 PM
 */
public class C18_3_LineIntersectionTest {

    @Test
    public void testGetLineIntersection() {
        C18_3_LineIntersection test = new C18_3_LineIntersection();
        int[] P1 = {1, 1};
        int[] P2 = {5, 5};
        int[] P3 = {-1, 5};
        int[] P4 = {3, 1};

        double[] P = test.getIntersection(P1, P2, P3, P4);
        Assert.assertEquals(P[0], 2.0);
        Assert.assertEquals(P[1], 2.0);
    }

    @Test
    public void testGetLineIntersectionNull() {
        C18_3_LineIntersection test = new C18_3_LineIntersection();
        int[] P1 = {1, 1};
        int[] P2 = {2, 2};
        int[] P3 = {3, 3};
        int[] P4 = {4, 4};

        double[] P = test.getIntersection(P1, P2, P3, P4);

        Assert.assertNull(P);
    }
}
