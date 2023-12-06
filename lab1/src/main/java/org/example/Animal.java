package org.example;
public class Animal {

    String species;
    int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && species.equals(animal.species);
    }

    @Override
    public int hashCode() {
        int result = species.hashCode();
        result = 31 * result + age;
        return result;
    }

    public static class Builder {
        private String species;
        private int age;

        public Builder setSpecies(String species) {
            this.species = species;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Animal build() {
            return new Animal(species, age);
        }
    }
}