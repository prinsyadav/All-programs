<<<<<<< Updated upstream:SpringSecEx/src/main/java/org/prince/springsecex/Controller/Student.java
package org.prince.springsecex.Controller;
=======
<<<<<<< Updated upstream
package org.prince.springsecex.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Student {
>>>>>>> Stashed changes:SpringSecEx/src/main/java/org/prince/springsecex/model/Student.java

public class Student {
    private int id;
    private String name;
    private int marks;

<<<<<<< Updated upstream:SpringSecEx/src/main/java/org/prince/springsecex/Controller/Student.java
    public Student(int id, String name, int marks) {
=======

    public Student(int id, String name, int marks) {


    public Student(int id, String name,int marks) {

>>>>>>> Stashed changes:SpringSecEx/src/main/java/org/prince/springsecex/model/Student.java
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

<<<<<<< Updated upstream:SpringSecEx/src/main/java/org/prince/springsecex/Controller/Student.java
    public Student() {
    }
=======
}

>>>>>>> Stashed changes:SpringSecEx/src/main/java/org/prince/springsecex/model/Student.java

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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
<<<<<<< Updated upstream:SpringSecEx/src/main/java/org/prince/springsecex/Controller/Student.java
=======

>>>>>>> Stashed changes:SpringSecEx/src/main/java/org/prince/springsecex/model/Student.java
