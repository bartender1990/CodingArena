package com.interview.leetcode.dp;

import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-14
 * Time: 上午9:06
 *      s1 = "aabcc",
 *      s2 = "dbbca",
 *  When s3 = "aadbbcbcac", return true.
 *  When s3 = "aadbbbaccc", return false.
 */
public class InterleavingStringTest extends TestCase {
    public void testIsInterleave() throws Exception {
        String s1 = "aabcc";
        String s2 = "dbbca";
        assertTrue(TwoSequenceDP.InterleavingString.isInterleave(s1, s2, "aadbbcbcac"));
        assertFalse(TwoSequenceDP.InterleavingString.isInterleave(s1, s2, "aadbbbaccc"));

        assertFalse(TwoSequenceDP.InterleavingString.isInterleave("a", "", "c"));
    }
}
