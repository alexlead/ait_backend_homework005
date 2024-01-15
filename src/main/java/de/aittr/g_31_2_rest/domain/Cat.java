package de.aittr.g_31_2_rest.domain;

import java.util.Objects;

public class Cat {

    private int id;
    private String color;
    private double weight;

    public Cat() {
    }

    public Cat(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id && Double.compare(weight, cat.weight) == 0 && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, color, weight);
    }

    @Override
    public String toString() {
        return String.format("Cat: ID - %d, color: %s, weight:  %.3f", id, color, weight);
    }
}
