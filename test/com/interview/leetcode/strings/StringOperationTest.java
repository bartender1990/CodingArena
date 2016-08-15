package com.interview.leetcode.strings;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created_By: stefanie
 * Date: 14-11-17
 * Time: 下午7:03
 */
public class StringOperationTest extends TestCase {
    public void testReverseWords() throws Exception {
        assertEquals("blue sky", StringOperation.reverseWords(" sky  blue"));
    }

    public void testReverseWordsInPlace(){
        char[] str = "sky blue".toCharArray();
        StringOperation.reverseWords(str);
        System.out.println(String.valueOf(str));
        Assert.assertArrayEquals("blue sky".toCharArray(), str);
    }
}
