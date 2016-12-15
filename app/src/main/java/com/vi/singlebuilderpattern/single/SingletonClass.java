package com.vi.singlebuilderpattern.single;

/**
 * Created by taufiqotulfaidah on 12/13/16.
 */

public class SingletonClass {

    private static final SingletonClass singletonClass = new SingletonClass();

    public SingletonClass(){}

    public static SingletonClass getInstance(){
        return singletonClass;
    }
}
