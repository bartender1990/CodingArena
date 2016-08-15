package com.interview.leetcode.strings;

import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-17
 * Time: 下午5:50
 */
public class SubstringLocatorTest extends TestCase {
    public void testMatch() throws Exception {
        String pattern = "ababab";
        String str = "ababaababab";
        assertEquals(5, SubstringLocator.match(str, pattern));
    }

    public void testKmpMatch() throws Exception {
        String pattern = "ababab";
        String str = "ababaababab";
        assertEquals(5, SubstringLocator.kmpMatch(str, pattern));
    }
}
