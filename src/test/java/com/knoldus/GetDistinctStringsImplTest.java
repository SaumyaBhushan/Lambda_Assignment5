package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetDistinctStringsImplTest {
    @Test
    public void uniqueStringTest(){
        GetDistinctStringsImpl obj1 = new GetDistinctStringsImpl();
        List<String> Uniquelist = obj1.get.distinctStrings(new ArrayList<>(Arrays.asList("java","java","c")));
        List<String> strList= new ArrayList<>();
        strList.add("c");
        strList.add("java");

        Assertions.assertEquals(strList,Uniquelist);
    }




}