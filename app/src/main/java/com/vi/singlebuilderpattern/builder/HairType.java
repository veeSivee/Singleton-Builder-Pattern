package com.vi.singlebuilderpattern.builder;

/**
 * Created by taufiqotulfaidah on 12/20/16.
 */

public enum HairType {

    BALD("bald"), SHORT("short"), CURLY("curly"), LONG_STRAIGHT("long straoight"), LONG_CURLY ("long curly");

    private String title;

    HairType(String title){
        this. title = title;
    }


    @Override
    public String toString() {
        return title;
    }
}
