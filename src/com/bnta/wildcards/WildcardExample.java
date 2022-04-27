package com.bnta.wildcards;

import com.sun.jdi.ClassType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardExample {


    public void printNames_fathersAndChildrenOnly(List<Father> fatherList, List<Child> childList){
        System.out.println(fatherList);
        System.out.println(childList);
    }

    public void printNames_grampasAndFathersOnly(List<Grampa> grampaList, List<Father> fatherList){
        System.out.println(grampaList);
        System.out.println(fatherList);
    }


    public void printNames_allFamily(List<Grampa> grampaList) {
        System.out.println(grampaList);
    }

    public void printNames_allFamily(List<Grampa> grampaList, List<Father> fatherList) {
        System.out.println(grampaList);
        System.out.println(fatherList);
    }

    public void printNames_allFamily(List<Grampa> grampaList, List<Father> fatherList, List<Child> childList){
        System.out.println(grampaList);
        System.out.println(fatherList);
        System.out.println(childList);
    }

    //printNames_fathersAndChildrenOnly - accepts only arguments of type: List<Father>, List<Children>
    //printNames_grampasAndFathersOnly  - accepts only arguments of type: List<Father>, List<Grampa>
    //printNames_allFamily  - accepts only arguments of type: List<Father>, List<Grampa>, List<Children>


}
