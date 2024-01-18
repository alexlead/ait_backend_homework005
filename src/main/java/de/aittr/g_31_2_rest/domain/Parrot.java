package de.aittr.g_31_2_rest.domain;

import java.util.Objects;

public class Parrot {

    private int id;
    private String color;
    private double weight;

    public Parrot() {
    }

    public Parrot(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Parrot(int id, String color, double weight) {
        this.id = id;
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
        Parrot parrot = (Parrot) o;
        return id == parrot.id && Double.compare(weight, parrot.weight) == 0 && Objects.equals(color, parrot.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, color, weight);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
