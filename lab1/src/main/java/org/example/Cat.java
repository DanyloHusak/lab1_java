package org.example;



public class Cat extends Animal {
    private String color;
    private String age;

    public Cat(String species, int age, String color) {
        super(species, age);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "species='" + getSpecies() + '\'' +
                ", age=" + getAge() +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
