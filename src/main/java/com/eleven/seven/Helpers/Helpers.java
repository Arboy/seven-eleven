package com.eleven.seven.Helpers;

/**
 * Created by JPMPC-B209 on 1/23/2017.
 */
public class Helpers {
    public static boolean isFibonacci;

    public static String testThisMethod(String name) {
        return name + "123";
    }

    public boolean testFibonacci(int fib) {

        int n1 = 0, n2 = 1, n3, i, count =20    ;


        System.out.print("[" + n1 + "]" + " " + "[" + n2 + "]");//printing 0 and 1

        for (i = n1; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + "[" + n3 + "]");
            n1 = n2;
            n2 = n3;
            if (n3 == fib) {
                isFibonacci = true;
                break;
            }
        }

        System.out.println(isFibonacci ? "\n\n" + fib + " is a Fibonacci " + isFibonacci + "" : "\n\n" + fib + " is not a Fibonacci " + isFibonacci);

        return isFibonacci;

        /*int fibCount = 15;
        int[] fib = new int[fibCount];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fibCount; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = 0; i < fibCount; i++) {
            System.out.print(fib[i] + " ");
        }*/
    }

}