package com.factory_method.creator;

import com.factory_method.domain.Burger;
import com.factory_method.domain.FastFood;

public class BurgerCreator extends Creator {

    @Override
    protected FastFood createFastFood() {
        return new Burger();
    }
}
