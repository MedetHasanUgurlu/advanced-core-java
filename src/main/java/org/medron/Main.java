package org.medron;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Boolean booleanObjectUsingStaticFactory = getBoolean(true);
        Boolean booleanObjectUsingConstructor = Boolean.valueOf(true);

    }


    public static Boolean getBoolean(boolean b){
        return b?Boolean.TRUE:Boolean.FALSE;
        Collections
    }




}