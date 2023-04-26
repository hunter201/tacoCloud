package com.rad.springstarter;


import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class Ingredient {
    private final String id;
    private final String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
