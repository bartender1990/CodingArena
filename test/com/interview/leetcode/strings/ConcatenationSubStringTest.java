package com.interview.leetcode.strings;

import junit.framework.TestCase;

import java.util.List;

/**
 * Created_By: stefanie
 * Date: 14-11-17
 * Time: 下午1:36
 */
public class ConcatenationSubStringTest extends TestCase {
    public void testFindSubstring() throws Exception {
        String[] L = new String[]{"foo", "bar"};
        String S = "barfoothefoobarman";
        List<Integer> offsets = ConcatenationSubString.findSubstring(S, L);
        assertEquals(0, offsets.get(0).intValue());
        assertEquals(9, offsets.get(1).intValue());

    }
}
