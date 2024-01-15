package de.aittr.g_31_2_rest.domain;

public class Dog {

    private int id;
    private String petsName;
    private String breed;
    private int age;

    public Dog() {
    }

    public Dog(String petsName, String breed, int age) {
        this.petsName = petsName;
        this.breed = breed;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPetsName() {
        return petsName;
    }

    public void setPetsName(String petsName) {
        this.petsName = petsName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
