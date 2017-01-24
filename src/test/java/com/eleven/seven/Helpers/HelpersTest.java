package com.eleven.seven.Helpers;

import javafx.beans.binding.When;
import junit.framework.TestCase;
import org.hibernate.boot.model.source.internal.hbm.Helper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by JPMPC-B209 on 1/23/2017.
 */
public class HelpersTest /*extends TestCase */{

    @Mock
    Helpers helper;

    int fibNumber = 8;
    int [] sequence = {1,2,3,5,8,13};
    boolean isSequence = true;

    @Before
    public  void create(){
         initMocks(this);

        when(helper.testFibonacci(13)).thenReturn(true);
        //when(helper.add(1,3)).thenReturn(4);
    }

    @Test
    public void testFibonacci(){
        //boolean fib = true;
        //String fib = "[0] [1] [1] [2] [3] [5] [8] [13] [21] [34] [55] [89] [144] [233] [377] [610] [987] [1597] [2584] [4181]";

        assertTrue(helper.testFibonacci(fibNumber));
    }

    @Test
    public void fibSequence(){
        int input = 13;
        boolean fibNumber = helper.testFibonacci(input);

        System.out.print("Actual sequence [ "+input+" ]");
        System.out.print("[ "+ fibNumber +" ]");

        System.out.print("\nExpected sequence [ "+input+" ]: ");
        System.out.print("[ "+ isSequence +" ]");
        for (int i=0; i<sequence.length; i ++) {
            System.out.print("[" +sequence[i]+ "]");
        }
        assertTrue(helper.testFibonacci(13));
    }


    //String testName = "Rboy123";
   /* @Test
    public void testThisMethod(){
        String name = "Rboy";

        assertEquals(testName, Helpers.testThisMethod(name));
    }*/

    /*int actual = 3;
    @Test
    public void testFibonacci(){
        boolean fib = true;
        //String fib = "[0] [1] [1] [2] [3] [5] [8] [13] [21] [34] [55] [89] [144] [233] [377] [610] [987] [1597] [2584] [4181]";

        assertEquals(fib, Helpers.testFibonacci(actual));
    }*/
}
