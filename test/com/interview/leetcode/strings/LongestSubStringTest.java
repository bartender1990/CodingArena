package com.interview.leetcode.strings;

import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-18
 * Time: 下午5:43
 */
public class LongestSubStringTest extends TestCase {
    public void testNonDuplicate() throws Exception {
        assertEquals(3, LongestSubString.nonDuplicate("abbac"));
    }

    public void testTwoDistinctChar() throws Exception {
//        assertEquals(3, LongestSubString.twoDistinctChar("eceab"));
//        assertEquals(4, LongestSubString.twoDistinctChar("eccbba"));
        assertEquals(7, LongestSubString.twoDistinctChar("ececcec"));
    }

    public void testKDistinctChar() throws Exception {
        //assertEquals(4, LongestSubString.kDistinctChar("eccbba", 2));
        assertEquals(7, LongestSubString.kDistinctChar("eccbbaac", 3));
    }
}
