package com.interview.algorithms.geometry;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created_By: zouzhile
 * Date: 1/11/15
 * Time: 10:09 AM
 */
public class C18_4_FindCircleCenterTest {

    @Test
    public void testFindCircleCenter() {
        C18_4_FindCircleCenter test = new C18_4_FindCircleCenter();
        int[] p1 = new int[] {-1, 1};
        int[] p2 = new int[] {1, 3};
        int[] p3 = new int[] {3, 1};

        double[] center = test.findCircleCenter(p1, p2, p3);
        Assert.assertEquals(center[0], 1.0);
        Assert.assertEquals(center[1], 1.0);
    }
}
