package com.factory_method.creator;

import com.factory_method.domain.FastFood;
import com.factory_method.domain.Pizza;

public class PizzaCreator extends Creator {

    @Override
    protected FastFood createFastFood() {
        return new Pizza();
    }
}
