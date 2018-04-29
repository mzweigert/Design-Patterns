package com.prototype_pattern;

import java.util.Objects;

public class Motorcycle extends Vehicle<Motorcycle> {

    public String type;

    public Motorcycle(long id, String type) {
        super(id);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Motorcycle)) return false;
        if (!super.equals(o)) return false;
        Motorcycle that = (Motorcycle) o;
        return Objects.equals(getType(), that.getType());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getType());
    }
}
