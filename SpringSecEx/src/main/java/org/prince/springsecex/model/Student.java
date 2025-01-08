<<<<<<< Updated upstream
package org.prince.springsecex.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Student {

=======
package com.telusko.part29springsecex.model;

public class Student {
>>>>>>> Stashed changes
    private int id;
    private String name;
    private int marks;

<<<<<<< Updated upstream
    public Student(int id, String name, int marks) {
=======

    public Student(int id, String name,int marks) {
>>>>>>> Stashed changes
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
<<<<<<< Updated upstream
}
=======

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "StudentController{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
>>>>>>> Stashed changes
