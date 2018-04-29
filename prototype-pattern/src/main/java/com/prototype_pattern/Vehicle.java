package com.prototype_pattern;

import java.util.Objects;

public abstract class Vehicle<T extends Vehicle>  implements Cloneable{
    private long id;

    protected Vehicle(long id) {
        this.id=id;
    }
    public Long getId() {
        return id;
    }

    public Long setId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle<?> vehicle = (Vehicle<?>) o;
        return getId().equals(vehicle.getId());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public T clone() {
        try {
            return (T) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
