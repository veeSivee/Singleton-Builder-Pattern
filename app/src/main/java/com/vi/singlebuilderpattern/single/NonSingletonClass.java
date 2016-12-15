package com.vi.singlebuilderpattern.single;

/**
 * Created by taufiqotulfaidah on 12/13/16.
 */

public class NonSingletonClass {

    public static NonSingletonClass getInstance(){
        return new NonSingletonClass();
    }
}
