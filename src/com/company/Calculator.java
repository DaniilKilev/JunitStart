package com.company;

public class Calculator {
    public int add(int... a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res+=a[i];
        }
        return res;
    }
}
