package com.interview.leetcode.dp;

import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-25
 * Time: 下午5:33
 */
public class LongestValidParenthesesTest extends TestCase {
    public void testLongestValidParentheses() throws Exception {
        OneSequenceDP.LongestValidParentheses checker = new OneSequenceDP.LongestValidParentheses();
        assertEquals(2, checker.longestValidParentheses("()"));
    }
}
