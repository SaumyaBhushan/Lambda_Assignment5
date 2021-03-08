package com.knoldus;

import java.util.Set;
import java.util.stream.Collectors;

public class GetDistinctStringsImpl {
    public GetDistinctStrings get = list -> {
        Set<String> set = list.stream().collect(Collectors.toSet());
        return set.stream().sorted().collect(Collectors.toList());
    };
}
