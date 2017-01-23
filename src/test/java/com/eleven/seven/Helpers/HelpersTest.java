package com.eleven.seven.Helpers;

import junit.framework.TestCase;
import org.hibernate.boot.model.source.internal.hbm.Helper;
import org.junit.Test;

/**
 * Created by JPMPC-B209 on 1/23/2017.
 */
public class HelpersTest extends TestCase {

    String testName = "Rboy123";
    @Test
    public void testThisMethod(){
        String name = "Rboy";

        assertEquals(testName, Helpers.testThisMethod(name));
    }

    int fib123 = 21;
    @Test
    public void testFibonacci(){
        int fib = 21;

        assertEquals(fib, Helpers.testFibonacci(fib123));
    }
}
