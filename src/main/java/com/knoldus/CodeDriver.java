package com.knoldus;

import java.util.ArrayList;
import java.util.Arrays;

public class CodeDriver {
    public static void main(String[] args) {
        GetDistinctStringsImpl str = new GetDistinctStringsImpl();

        System.out.println(str.get.distinctStrings(new ArrayList<>(Arrays.asList("java","java","c"))));
        System.out.println(str.get.distinctStrings(new ArrayList<>(Arrays.asList("sam","sam","c"))));

    }
}
