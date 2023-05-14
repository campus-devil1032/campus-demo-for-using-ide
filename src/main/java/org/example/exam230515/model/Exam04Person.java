package org.example.exam230515.model;

public class Exam04Person {
    private String name;
    private int age;

    public Exam04Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Exam04Person) {
            Exam04Person other = (Exam04Person) obj;
            return this.name.equals(other.name) && this.age == other.age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
