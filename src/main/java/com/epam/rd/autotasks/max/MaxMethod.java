package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {

        int m = Integer.MIN_VALUE;

        for(int x:values) m = Math.max(m,x);

        return m;
    }
}
