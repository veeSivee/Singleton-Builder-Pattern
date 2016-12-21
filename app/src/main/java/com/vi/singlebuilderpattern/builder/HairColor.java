package com.vi.singlebuilderpattern.builder;

/**
 * Created by taufiqotulfaidah on 12/20/16.
 */

public enum HairColor {

    WHITE, BLOND, RED, BROWN, BLACK;


    @Override
    public String toString() {
        //return super.toString();
        return name().toLowerCase();
    }
}
