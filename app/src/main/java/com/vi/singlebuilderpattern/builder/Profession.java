package com.vi.singlebuilderpattern.builder;

/**
 * Created by taufiqotulfaidah on 12/20/16.
 */

public enum Profession {

    WARRIOR, THIEF, MAGE, PRIEST;


    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
