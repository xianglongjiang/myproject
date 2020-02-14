package com.dana;

import org.junit.Test;

import static com.dana.utils.NumberUtil.numbersToLetters;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test() {
        String s = numbersToLetters(2, 3, 4, 5);
        System.out.println(s);
    }
}
