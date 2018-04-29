package com.abstract_factory_pattern.common;

public class IdGenerator {
    private static long id = 0;

    public static Long nextId(){
        return id + 1;
    }

}
