package com.interview.algorithms.array;

import com.interview.utils.ConsoleWriter;
import junit.framework.TestCase;

public class C4_61_ShuffleWithoutRandomTest extends TestCase {

    public void testShuffle() throws Exception {
        int[] array = new int[]{15, 86, 50, 85, 78, 54, 42, 37, 13, 95, 48, 23, 8, 69, 71};//TestUtil.generateIntArray(15, false);
        ConsoleWriter.printIntArray(array);
        int[] input;
        for(int i = 0; i < 20; i++){
            input = array.clone();
            C4_61_ShuffleWithoutRandom.shuffle(input);
            ConsoleWriter.printIntArray(input);
        }
    }
}