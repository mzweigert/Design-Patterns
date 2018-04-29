package com.factory_method.creator;

import com.factory_method.domain.FastFood;

public abstract class Creator {

    public static final String MESSAGE = "%s created! Has %s calories";

    public String createAndGetInfo(){
        FastFood fastFood = createFastFood();
        return String.format(MESSAGE, fastFood.getName(), fastFood.getKiloCalories());
    }

    protected abstract FastFood createFastFood();

}
