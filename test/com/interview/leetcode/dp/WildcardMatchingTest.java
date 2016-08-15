package com.interview.leetcode.dp;

import com.interview.leetcode.backtracing.WildcardMatching;
import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-17
 * Time: 上午10:27
 */
public class WildcardMatchingTest extends TestCase {
    public void testIsMatch() throws Exception {
        //assertTrue(WildcardMatching.isMatch("aabb","**b*"));
        //assertTrue(WildcardMatching.isMatch("aabb","a*b*"));
        assertTrue(WildcardMatching.isMatch("abbbc", "a*bbc"));
    }
}
