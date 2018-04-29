package com.prototype_pattern;

import java.util.Objects;

public class Car extends Vehicle<Car> {

    public int yop;

    public Car(long id, int yop) {
        super(id);
        this.yop = yop;
    }

    public int getYop() {
        return yop;
    }

    public void setYop(int yop) {
        this.yop = yop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return getYop() == car.getYop();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getYop());
    }
}
