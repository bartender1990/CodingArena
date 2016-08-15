package com.interview.leetcode.dp;

import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-14
 * Time: 上午11:40
 */
public class EditDistanceTest extends TestCase {
    public void testcase1() throws Exception {
        int distance = TwoSequenceDP.EditDistance.minDistance("ab", "b");
        assertEquals(1, distance);
    }

    public void testcase2() throws Exception {
        int distance = TwoSequenceDP.EditDistance.minDistance("ab", "acb");
        assertEquals(1, distance);
    }

    public void testcase3() throws Exception {
        int distance = TwoSequenceDP.EditDistance.minDistance("ab", "ac");
        assertEquals(1, distance);
    }

    public void testcase4() throws Exception {
        int distance = TwoSequenceDP.EditDistance.minDistance("a", "bc");
        assertEquals(2, distance);
    }

    public void testcase5() throws Exception {
        int distance = TwoSequenceDP.EditDistance.minDistance("ab", "ab");
        assertEquals(0, distance);
    }

    public void testcase6() throws Exception {
        int distance = TwoSequenceDP.EditDistance.minDistance("a", "ab");
        assertEquals(1, distance);
    }

    public void testDistance() throws Exception {
        int distance = TwoSequenceDP.EditDistance.minDistance("stefanie", "summer");
        assertEquals(7, distance);
    }
}
