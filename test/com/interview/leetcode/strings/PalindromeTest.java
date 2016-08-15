package com.interview.leetcode.strings;

import junit.framework.TestCase;

import java.util.HashSet;
import java.util.Set;

/**
 * Created_By: stefanie
 * Date: 14-11-19
 * Time: 上午9:40
 */
public class PalindromeTest extends TestCase {
    public void testValid() throws Exception {

    }

    public void testRearrange(){
        assertEquals("abba", Palindrome.rearrange("aabb"));
        assertEquals("abcba", Palindrome.rearrange("aabcb"));
        assertEquals("a", Palindrome.rearrange("a"));
        assertNull(Palindrome.rearrange("abecab"));
    }

    public void testLongestPalindrome() throws Exception {
        assertEquals("goog", Palindrome.LongestPalindrome.longestPalindromeDP("google"));
        assertEquals("bb", Palindrome.LongestPalindrome.longestPalindromeDP("bb"));
        assertEquals("ccc", Palindrome.LongestPalindrome.longestPalindromeDP("ccc"));
    }

    public void testMinPalindromePartition(){
        Palindrome.MinPalindromePartition partitioner = new Palindrome.MinPalindromePartition();
        assertEquals(1, partitioner.minCut("aab"));
    }

    public void testPalindromePair(){
        Set<String> dict = new HashSet<String>();
        dict.add("exe");
        dict.add("xe");
        dict.add("piexe");
        dict.add("nxe");
        dict.add("ip");

        Palindrome.PairPalindrome finder = new Palindrome.PairPalindrome();
        finder.findPairPalindrome(dict);
    }
}
