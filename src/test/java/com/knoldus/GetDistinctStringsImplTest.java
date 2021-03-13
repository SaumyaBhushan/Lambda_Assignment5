package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetDistinctStringsImplTest {

    @Test
    public void UniqueStringTest()  {
        GetDistinctStringsImpl obj1 = new GetDistinctStringsImpl();
        List<String> UniqueSet = obj1.get.distinctStrings(new ArrayList<>(Arrays.asList("java","java","c")));
        List<String> strList= new ArrayList<>();
        strList.add("c");
        strList.add("java");
        Assertions.assertEquals(strList,UniqueSet);
    }

    @Test
    public void TestForSimilarString() {
        GetDistinctStringsImpl obj1 = new GetDistinctStringsImpl();
        List<String> UniqueSet = obj1.get.distinctStrings(new ArrayList<>(Arrays.asList("java", "java", "c")));
        List<String> strList = new ArrayList<>();
        strList.add("c");
        strList.add("c");
        Assertions.assertNotEquals(strList, UniqueSet);

    }
    @Test
    public void TestForEmptyList(){
        GetDistinctStringsImpl obj1 = new GetDistinctStringsImpl();
        List<String> bb = obj1.get.distinctStrings(new ArrayList<>(Collections.emptyList()));
        List<String> aa = Collections.emptyList();
        Assertions.assertEquals(aa,bb);
    }


    @Test
    public void TestForNull() throws NullPointerException{
        GetDistinctStringsImpl obj1 = new GetDistinctStringsImpl();
        Assertions.assertThrows(NullPointerException.class, () ->
            obj1.get.distinctStrings(null));



    }
}