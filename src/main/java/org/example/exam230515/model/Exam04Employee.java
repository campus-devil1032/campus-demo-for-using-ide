package org.example.exam230515.model;

public class Exam04Employee {
    private String name;
    private int age;
    private String department;

    public Exam04Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Exam04Employee) {
            Exam04Employee other = (Exam04Employee) obj;
            return this.name.equals(other.name) && this.age == other.age && this.department.equals(other.department);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        result = 31 * result + department.hashCode();
        return result;
    }
}
