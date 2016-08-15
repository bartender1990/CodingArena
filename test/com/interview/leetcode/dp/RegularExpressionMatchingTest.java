package com.interview.leetcode.dp;

import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-16
 * Time: 下午10:41
 */
public class RegularExpressionMatchingTest extends TestCase {
    public void testIsMatch() throws Exception {
        assertTrue(TwoSequenceDP.RegularExpressionMatching.isMatch("aa", "aa"));
        assertTrue(TwoSequenceDP.RegularExpressionMatching.isMatch("a", "a*"));
        assertTrue(TwoSequenceDP.RegularExpressionMatching.isMatch("ab", "a."));
        assertTrue(TwoSequenceDP.RegularExpressionMatching.isMatch("ab", "a*b"));
        assertTrue(TwoSequenceDP.RegularExpressionMatching.isMatch("abc", "ac*bc"));
        assertTrue(TwoSequenceDP.RegularExpressionMatching.isMatch("abc", "d*a*b*c"));
        assertTrue(TwoSequenceDP.RegularExpressionMatching.isMatch("abc", "a*b*c"));
        assertFalse(TwoSequenceDP.RegularExpressionMatching.isMatch("abc", "a*b"));
        assertFalse(TwoSequenceDP.RegularExpressionMatching.isMatch("abc", "a.b"));
        assertFalse(TwoSequenceDP.RegularExpressionMatching.isMatch("abc", "ab"));


    }
}
