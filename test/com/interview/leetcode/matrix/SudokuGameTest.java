package com.interview.leetcode.matrix;

import com.interview.utils.ConsoleWriter;
import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-16
 * Time: 下午7:24
 */
public class SudokuGameTest extends TestCase {
    public void testSolveSudoku() throws Exception {
        String[] lines = new String[]{"..9748...","7........",".2.1.9...","..7...24.",".64.1.59.",".98...3..","...8.3.2.","........6","...2759.."};
        char[][] board = new char[9][9];
        for(int i = 0; i < 9; i++) board[i] = lines[i].toCharArray();

        SudokuGame.solve(board);
        ConsoleWriter.printIntArray(board);
    }
}
