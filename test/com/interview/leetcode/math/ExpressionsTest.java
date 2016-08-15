package com.interview.leetcode.math;

import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-20
 * Time: 上午10:14
 */
public class ExpressionsTest extends TestCase {
    Expressions.ReversePolishNotation notation = new Expressions.ReversePolishNotation();
    public void testVerify() throws Exception {

        String[] tokens = new String[]{"2", "1", "+", "3", "*"};
        assertTrue(notation.verify(tokens));

        tokens = new String[]{"1","2", "1", "+", "3", "*"};
        assertFalse(notation.verify(tokens));

        tokens = new String[]{"2", "1", "+", "3", "*", "/"};
        assertFalse(notation.verify(tokens));
    }

    public void testVerifyString(){
        assertTrue(Expressions.valid("(2 + 3) * 4 / 5"));
        assertFalse(Expressions.valid("(2*3)2 "));
        assertFalse(Expressions.valid("2(2*3)"));
        assertFalse(Expressions.valid("(2) + + 3"));
        assertFalse(Expressions.valid("2+)5*(2+4)"));
        assertFalse(Expressions.valid("2+(5*(2+4)"));

    }

    public void testTransform(){
        String[] tokens = new String[]{"2", "+", "1", "*", "3"};
        assertEquals("2 1 3 * +", notation.tranformRPN(tokens));

        //( 2 + 3 ) * 5
        tokens = new String[]{"(", "2", "+", "3", ")", "*", "5"};
        assertEquals("2 3 + 5 *", notation.tranformRPN(tokens));

        tokens = new String[]{"2", "+", "3", "*", "5"};
        assertEquals("2 3 5 * +", notation.tranformRPN(tokens));

        tokens = "2 3 5 * +".split(" ");
        assertEquals("( 2 + ( 3 * 5 ) )", notation.tranformFromRPN(tokens));
    }

    public void testEval() throws Exception {

    }
}
