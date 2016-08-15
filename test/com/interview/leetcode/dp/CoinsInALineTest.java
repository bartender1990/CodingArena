package com.interview.leetcode.dp;

import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-26
 * Time: 下午3:57
 */
public class CoinsInALineTest extends TestCase {
    public void testMaxMoney() throws Exception {
        CoinsInALine finder = new CoinsInALine();
        int[] coins = new int[]{3, 2, 2, 3, 1, 2};
        assertEquals(8, finder.maxMoney(coins));
    }
}
