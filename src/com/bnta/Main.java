package com.bnta;

import com.bnta.class2params.Pair;
import com.bnta.genericinterface.IntegerAndString;
import com.bnta.genericinterface.StringAndInteger;
import com.bnta.simpleclass.Box;
import com.bnta.wildcards.Child;
import com.bnta.wildcards.Father;
import com.bnta.wildcards.Grampa;
import com.bnta.wildcards.WildcardExample;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("START OF EXERCISE 1");

        Box boxWithoutRestrictions = new Box("No restrictions");

        System.out.println(boxWithoutRestrictions.getT());

        boxWithoutRestrictions.setT("Setter test");

        System.out.println(boxWithoutRestrictions.getT());

        Box<Integer> boxForIntegersOnly = new Box(4);

        System.out.println(boxForIntegersOnly.getT());

        boxForIntegersOnly.setT(7);

        System.out.println(boxForIntegersOnly.getT());

// END OF SIMPLECLASS BOX EXERCISE 1.

System.out.println("");
System.out.println("START OF EXERCISE 2");

        Pair<String, Integer> pair1 = new Pair<>("Ten", 10);
        System.out.println(pair1.getK() + ", " + pair1.getV());

        Pair<Integer, String> pair2 = new Pair<>(20, "Twenty");
        System.out.println(pair2.getK() + ", " + pair2.getV());


        Pair<String, String> pair3 = new Pair<>("Six", "Eight");
        System.out.println(pair3.getK() + ", " + pair3.getV());

// END OF CLASS2PARAMS EXERCISE 2.

System.out.println("");
System.out.println("START OF EXERCISE 3");

        IntegerAndString integerAndString = new IntegerAndString();
        System.out.println(integerAndString.doSomeOperations(5));
        System.out.println(integerAndString.doReverseOperations("-5" + "6"));

        StringAndInteger stringAndInteger = new StringAndInteger();
        System.out.println(stringAndInteger.doSomeOperations("12"));
        System.out.println(stringAndInteger.doReverseOperations(25));

// END OF GENERICINTERFACE EXERCISE 3.

System.out.println("");
System.out.println("START OF EXERCISE 4");

    List<Grampa> grampas = List.of(
            new Grampa("Christopher"),
            new Grampa("Theodore"),
            new Grampa("Rudolph")
    );

    List<Father> fathers = List.of(
            new Father("Max"),
            new Father("Christopher"),
            new Father("Andrew")
    );

    List<Child> children = List.of(
            new Child("Henry"),
            new Child("Owen"),
            new Child("Noah")
    );

    List<String> names = List.of("Max, Rudolph");

    WildcardExample wildEx = new WildcardExample();

System.out.println("");

    wildEx.printNames_allFamily(grampas);
    wildEx.printNames_allFamily(fathers);
    wildEx.printNames_allFamily(children);

    wildEx.printNames_allFamily(names);
//
//System.out.println("");
//
//    wildEx.printNames_fathersAndChildrenOnly(grampas);
//    wildEx.printNames_fathersAndChildrenOnly(fathers);
//    wildEx.printNames_fathersAndChildrenOnly(children);
//
//System.out.println("");
//
//    wildEx.printNames_grampasAndFathersOnly(children);
//    wildEx.printNames_grampasAndFathersOnly(grampas);
//    wildEx.printNames_grampasAndFathersOnly(fathers);

// END OF WILDCARD EXERCISE 4.

    }
}
