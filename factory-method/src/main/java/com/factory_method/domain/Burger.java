package com.factory_method.domain;

public class Burger implements FastFood {

    @Override
    public String getName() {
        return "burger";
    }

    @Override
    public int getKiloCalories() {
        return 500;
    }
}
