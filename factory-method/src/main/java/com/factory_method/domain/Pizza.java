package com.factory_method.domain;

public class Pizza implements FastFood {
    @Override
    public String getName() {
        return "pizza";
    }

    @Override
    public int getKiloCalories() {
        return 1000;
    }
}
