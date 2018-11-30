package org.sopt.model.builder;

import org.sopt.model.Student;

public class StudentBuilder {

    private int studentidx;
    private String name;
    private int grade;
    private String email;
    private String address;
    private int age;
    private String state;

    public StudentBuilder setStudentIdx(final int studentIdx) {
        this.studentidx = studentIdx;
        return this;
    }

    public StudentBuilder setName(final String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setGrade(final int grade) {
        this.grade = grade;
        return this;
    }

    public StudentBuilder setEmail(final String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder setAddress(final String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setAge(final int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setState(final String state) {
        this.state = state;
        return this;
    }

    public Student build() {
        return new Student(this.studentidx, this.name, this.grade, this.email, this.address, this.age, this.state);
    }
}
